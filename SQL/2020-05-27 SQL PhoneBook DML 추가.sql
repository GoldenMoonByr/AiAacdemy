-- phonebook 테이블명세서 DDL : 2020.05.26

drop table phoneInfo_basic;
drop table phoneInfo_univ;
drop table phoneInfo_com;

create table phoneInfo_basic (
    idx number(6),
    fr_name varchar2(20)  not null,
    fr_phonenumber varchar2(20) not null ,
    fr_email varchar2(20),
    fr_address VARCHAR2(20),
    fr_regdate date default sysdate,    
    constraint b_idx_pk primary key(idx)  
);
 
 
create table phoneInfo_univ (
    idx number(6),
    fr_u_major varchar2(20) default 'N' not null,
    fr_u_year number(1) default 1 not null,
    fr_ref number(6) not null,
    constraint u_idx_pk primary key(idx),
    constraint u_fr_u_year_ck check (fr_u_year between 1 and 4),
    constraint u_fr_ref_fk foreign key(fr_ref)
    references phoneInfo_basic(idx) on delete cascade    
);
 
create table phoneInfo_com(
    idx number(6),
    fr_c_company varchar2(20) default 'N' not null,
    fr_ref number(6),
    constraint c_idx_pk primary key(idx),
    constraint c_fr_ref_fk foreign key(fr_ref)
    references phoneInfo_basic(idx)  on delete cascade
);

---------------------------------------------------------------------------------
-- 입력 DML
---------------------------------------------------------------------------------

-- 학교 친구 정보 입력 순서
-- 2. 학교 친구 정보 테이블 데이터 입력
insert into phoneinfo_basic (idx, fr_name, fr_phonenumber, fr_email, fr_address) 
VALUES (1, '김관영', '010-7878-1234', 'xognl@naver.com', 'Ansan')
;
insert into phoneinfo_univ 
values (1, 'computer', 1, 1)
;

insert into phoneinfo_basic (idx, fr_name, fr_phonenumber, fr_email, fr_address) 
VALUES (PB_BASIC_IDX_SEQ.nextval, '김관영', '010-7878-1234', 'xognl@naver.com', 'Ansan')
;
insert into phoneinfo_univ 
values (PB_UNIV_IDX_SEQ.nextval, 'computer', 1, PB_BASIC_IDX_SEQ.currval)
;


insert into phoneinfo_basic (idx, fr_name, fr_phonenumber, fr_email, fr_address) 
VALUES (3, '박성진', '010-5441-7419', 'tjdwls0912@naver.com', 'Ansan')
;
insert into phoneinfo_univ 
values (2, 'chemical eng', 4, 3)
;



-- 회사 친구 정보 입력 순서
-- 1. 기본 친구 정보 테이블 데이터 입력
-- 2. 회사 친구 정보 테이블 데이터 입력
insert into phoneinfo_basic (idx, fr_name, fr_phonenumber, fr_email, fr_address) 
values (PB_BASIC_IDX_SEQ.nextval, '권세빈', '010-3589-5675', 'sebin@gmail.com', 'Seoul')
;
insert into phoneinfo_com 
values (PB_COM_IDX_SEQ.nextval, 'LG U+', PB_BASIC_IDX_SEQ.currnval)
;

insert into phoneinfo_basic (idx, fr_name, fr_phonenumber, fr_email, fr_address) 
values (4, '최민혁', '010-7878-2121', 'subinlo@daum.net', 'Seoul');

insert into phoneinfo_com 
values (2, 'LG U+', 4)
;
---------------------------------------------------------------------------------
-- 친구 정보 출력 질의
---------------------------------------------------------------------------------
-- 1. 전체 친구 목록 출력
select * 
from phoneinfo_basic b, phoneinfo_univ u, phoneinfo_com c
where b.idx=u.fr_ref(+) and b.idx=c.fr_ref(+)
order by b.idx
;

--view : pb_all_view
create or replace view pb_all_view
(name,phonenumber, email, address,regdate,major,year,company ) --별칭
as 
select 
       b.fr_name,
       b.fr_phonenumber,
       b.fr_email,
       b.fr_address,
       b.fr_regdate,
       u.fr_u_major,
       u.fr_u_year,
       c.fr_c_company
from phoneinfo_basic b, phoneinfo_univ u, phoneinfo_com c
where b.idx=u.fr_ref(+) and b.idx=c.fr_ref(+)
;

select * from pb_all_view;


-- 2. 학교 친구 목록 출력
select * from phoneinfo_basic b, phoneinfo_univ u
where b.idx=u.fr_ref;

--view : pb_univ_view
create or replace view pb_univ_view
as
select 
        b.fr_name,
        b.fr_phonenumber,
        b.fr_email,
        b.fr_address,
        b.fr_regdate,
        u.fr_u_major,
        u.fr_u_year

from phoneinfo_basic b, phoneinfo_univ u
where b.idx=u.fr_ref;

select  * from pb_univ_view;

-- 3. 회사 친구 목록 출력
select * from phoneinfo_basic b, phoneinfo_com c
where b.idx=c.fr_ref
;

--view : pb_com_view
create or replace view pb_com_view
as
select  b.fr_name,
        b.fr_phonenumber,
        b.fr_address,
        b.fr_regdate,
        c.fr_c_company
from phoneinfo_basic b, phoneinfo_com c
where b.idx=c.fr_ref
;

select * from pb_com_view;



---------------------------------------------------------------------
--회사 친구 수정
update phoneinfo_basic
set fr_name = 'SCOTT',
    fr_phonenumber = '010-0000-0000',
    fr_address ='SEOUL',
    fr_email= 'scott@gmail.com'
where idx=1
;

update phoneinfo_com
set fr_u_company='KAKAO'
where fr_ref =1
;


--학교 친구 수정
update phoneinfo_basic
set fr_name = 'KING',
    fr_phonenumber = '010-0000-0000',
    fr_address ='SEOUL',
    fr_email= 'KING@gmail.com'
where idx=2
;

update phoneinfo_univ
set fr_u_major='DATA',
    fr_u_year = 3
where fr_ref =1
;
   

--회사 친구 정보 삭제
delete from phoneinfo_com where fr_ref=1;
delete from phoneinfo_univ where fr_ref=1;
delete from phoneinfo_basic where fr_ref=1;
--학교 친구 정보 삭제
delete from phoneinfo_com where fr_ref=2;
delete from phoneinfo_univ where fr_ref=2;
delete from phoneinfo_basic where fr_ref=2;



--1.회사 친구의 정보 변경
update phoneinfo_basic
set fr_phonenumber = '010-3619-8588' --전화번호 변경
where fr_name = '권세빈'
;
update phoneinfo_com
set fr_c_company = 'LG' --회사명 변경
where fr_ref = (select idx from phoneinfo_basic where fr_name='권세빈');
--2.학교 친구의 정보 변경
update phoneinfo_basic
set fr_phonenumber = '010-4908-0913' --전화번호 변경
where fr_name = '박성진'
;
update phoneinfo_univ
set fr_u_year = '3' --학년 변경
where fr_ref = (select idx from phoneinfo_basic where fr_name='박성진');
---------------------------------------------------------------------
--삭제를 위한 sql
---------------------------------------------------------------------
--1. 회사 친구의 정보 삭제
delete from phoneinfo_basic where fr_name='권세빈';
delete from phoneinfo_com where fr_ref = (select idx from phoneinfo_basic where fr_name='권세빈');
--2. 학교 친구의 정보 삭제
delete from phoneinfo_basic where fr_name='김관영';
delete from phoneinfo_univ where fr_ref = (select idx from phoneinfo_basic where fr_name = '김관영');

drop table phoneinfo_basic;
drop table phoneinfo_com;
drop table phoneinfo_univ;

--외래키 설정시 부모의 행이 삭제 될 때 설정
--references phoneinfo_basic(idx) on delete 설정 옵션
-- no action : 모두 삭제 불가
-- cascade : 참조를 하고 있는 자식 테이블의 모든 행도 삭제
-- set null : 참조를 하고 있는 자식 테이블의 모든 행의 외래키 컬럼 값을 null로
-- set default : 참조를 하고 있는 자식 테이블의 모든 행의 외래키를 기본값으로

--------------------------------------------------------------
--view 생성!
--------------------------------------------------------------

------------------------
--sequence 생성
------------------------
-- 1. basic 테이블 seq
create sequence pb_basic_idx_seq
start with 0  --default 값은 1
minvalue 0 --default 값은 1이므로 0으로 지정
;

-- 2. com 테이블 seq
create sequence pb_com_idx_seq
start with 0
minvalue 0
;

-- 3. univ 테이블 seq
create sequence pb_univ_idx_seq
start with 0
minvalue 0
;
