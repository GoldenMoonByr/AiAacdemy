--2020.05.25
--테이블 구조 생성, 변경 및 삭제를 위한 DDL

--테이블 생성
--create table 테이블의 이름() < - 괄호 안에 컬럼을 정의
--(컬럼명1 타입(사이즈) , 컬럼명2 타입(사이즈),...)

--ddl test라는 이름의 테이블을 생성
--컬럼1 : no, 숫자타입 사이즈는 3
--컬럼2 : name, 가변 문자열 저장 사이즈는 10
--컬럼3 : birth, 날짜 타입, 기분값은 현재 시간.

create table ddl_test(
    no number(3),
    name  varchar(10),
    birth date default sysdate
)
;

desc ddl_test; 

insert into ddl_test (no,name) values (1,'scott');
select  * from  ddl_test;

--지금까지 실습에 사용했던 사원 테이블과 유사한 구조의 
--사원번호, 사원이름, 급여 3개의 칼럼으로 구성된 
--EMP01 테이블을 생성해 봅시다.
desc emp;
create table emp01(
    empno number(4),
    ename varchar2(10),
    sal number(7,2));
select * from tab;
desc emp01;

--테이블의 복사! : 서브 쿼리를 이용 -> 스키마 복사, 행 복사 가능
--그러나 제약조건의 복사는 되지 않는다.
create table emp02
as
select * from emp;

select * from tab; --테이블이 정상적으로 복사되어 생생되어 있을을 알 수 있다.
desc emp02; -- emp테이블의 모든 구조들이 복사되어 있음을 알 수 있다.
select * from emp02; --데이터들도 모두 복사되어 있음을 알 수 있다.


-- emp 테이블의 empno와 ename 컬러만 선택적으로 복사해서
--새로운 테이블 emp03을 생성해보자.
create table emp03
as
select empno, ename from emp;

select * from tab;
desc emp03;
select * from emp03;

--emp 테이블의 10번 부서의 데이터만 복사해서 새로운 테이블
--emp04 테이블을 생성하자
create table emp04
as
select * from emp
where deptno =10
;

select * from emp04;


--emp 테이블의 스키마 구조만 복사해서 새로운 테이블 emp05를 생성하자
create table emp05
as
select * from emp
where 1=0
;

select * from emp05;


--------------------------------------------------
--alter table
--------------------------------------------------

-- 테이블에 컬럼 추가
-- alter table 테이블이름 add (컬럼 정의)

--emp01 테이블에 직급(job) 컬럼을 추가해보자.
desc emp01;

alter table emp01 add(job varchar2(10));
desc emp01;


--컬럼의 변경
--alter table 테이블이름 modify (컬럼 정의)
--직급(JOB) 컬럼을 최대 30글자까지 저장할 수 있게 변경해 보도록 하자.
alter table emp01 modify (job varchar(30) not null);
desc emp01;


--컬럼의 삭제
--alter table 테이블이름 drop column 컬럼이름
alter table emp01 drop column sal;
desc emp01;

--테이블 객체 삭제
--drop table 테이블이름;
drop table emp01;
select * from tab;

--테이블 로우 삭제
--truncate 테이블이름;
select * from emp02;
truncate table emp02;


--테이블 이름의 변경
--rename 현재 테이블 이름 to 새로운 테이블 이름

rename emp02 to test_emp;
select * from tab;

desc dept;
insert into dept values(10, 'test' , 'seoul');


--컬럼의 제약 정의는 컬럼 정의를 하면서 컬럼 옆에 정의
--컬럼의 타입을 모두 정의하고, 아래에 제약을 정의하는 방법

--create table emp01 (
   -- empno number(4) not null
--)

--create table emp01(
   -- empno number(4),
   -- primary key(empno)
   -- )
    
--not null 제약 : 컬럼의 값에 null 값을 허용하지 않는다.
--컬럼 레벨에서만 정의가 가능하다.

--사원 테이블(EMP02)을 
--사원번호, 사원명, 직급, 부서번호 4개의 칼럼으로 구성하되 
--이번에는 사원번호와 사원명에 NOT NULL 조건을 지정하도록 합시다.
drop table emp02;

create table emp02(
    empno number (4) not null,
    ename varchar2(10) not null,
    job varchar2(10),
    deptno number(2)
);

desc emp02;
insert into emp02 values (1111,null,'MANAGER',10);
insert into emp02 values (1111,'SON','MANAGER',10);
select * from emp02;



--유일한 값만 허용하는 unique 제약 조건
drop table emp03;

create table emp03(
    empno number(4) unique,
    ename varchar2(10) not null,
    job varchar2(10),
    deptno number(2)
) ;

create table emp03(
    empno number(4) unique not null, --유니크와 낫널 동시 선언 가능
    ename varchar2(10) not null,
    job varchar2(10),
    deptno number(2)
) ;

desc emp03;

insert into emp03 values(1111,'TEST','MANAGER',10);
insert into emp03 values(null,'TEST123','MANAGER',20);
select * from emp03;


--지금까지 실습에 사용했던 사원 테이블과 유사한 구조의 사원번호, 사원명, 직급, 부서번호 4개의 칼럼으로 구성된
--EMP04 테이블을 생성하되 
--사원번호에는 유일키로 사원명은 NOT NULL 제약조건을 설정해 봅시다.

drop table emp04;
create table emp04(
    empno number(4) CONSTRAINT emp04_empno_uk unique CONSTRAINT emp04_empno_nn not null,
    ename varchar2(10) CONSTRAINT emp04_ename_NN not null,
    job varchar2(10),
    depeno number(2)
);

insert into emp04 values(1111,'TEST','MANAGER',10);
insert into emp04 values(1111,'TEST','MANAGER',20);
insert into emp04 values(null,'TEST123','MANAGER',20);
select * from emp04;


--사원번호, 사원명, 직급, 부서번호 4개의 칼럼으로 구성된 테이블을 생성하되 
--기본 키 제약 조건을 설정해 봅시다.
drop table emp05;
create table emp05(
    empno number(4) CONSTRAINT emp05_empno_pk primary key,
    ename varchar2(10) CONSTRAINT emp05_ename_nn not null,
    job varchar2(10), 
    deptno number(2)
);

insert into emp05 values(1111,'TEST','MANAGER',10);
insert into emp05 values(1111,'TEST','MANAGER',20);
insert into emp05 values(null,'TEST123','MANAGER',20);

desc emp05;


--사원번호, 사원명, 직급, 부서번호 4개의 칼럼으로 구성된 테이블을 생성하되 
--기본 키 제약 조건을 설정해 봅시다.
--deptno 외래키로 제약조건을 설정해보자.
drop table emp06;
create table emp06(
    empno number(4) CONSTRAINT emp06_empno_pk primary key,
    ename varchar2(10) CONSTRAINT emp06_ename_nn not null,
    job varchar2(10), 
    deptno number(2) CONSTRAINT emp06_deptno_fk references dept(deptno)
);

insert into emp06 values(1111,'TEST','MANAGER',10);
insert into emp06 values(1111,'TEST','MANAGER',20);
insert into emp06 values(null,'TEST123','MANAGER',20);
insert into emp06 values(2222,'TEST123','MANAGER',50);
select * from emp06;
desc emp06;



--사원번호, 사원명, 직급, 부서번호, 직급, 성별, 생일 7개의 칼럼으로 
--구성된 테이블을 생성하되 
--기본 키 제약 조건, 외래키 제약 조건은 물로 
--CHECK 제약 조건도 설정해 봅시다.
--default 제약 조건으로 BIRTHDAY sysdate로 입력되도록 처리
create table emp07(
    empno number(4) CONSTRAINT emp07_empno_pk primary key,
    ename varchar2(10) CONSTRAINT emp07_ename_nn not null,
    job varchar2(10) default 'MANAGER', 
    deptno number(2) CONSTRAINT emp07_deptno_fk references dept(deptno),
    gender char(1) CONSTRAINT emp07_gender_ck check (gender = 'M' or gender = 'F'),
    sal number(7,2) CONSTRAINT emp07_sal_ck check (sal between 500 and 5000),
    birthday date default sysdate
);

insert into emp07 values (1111,'TEST','null','10','F','600',null);
insert into emp07 values (1112,'TEST','null','10','M','600',null);

insert into emp07 (empno, ename,deptno, gender,sal)
values (1113,'TEST',10,'F',1600)
;

select * from emp07;


