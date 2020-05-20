--------------------------------------------------------------
--숫자함수

select mod(10,20) from dual;

select abs(sal)from emp;

select trunc(12123182.41545,-2) from dual;

select trunc(sal ,-2) from emp;

select round (3.1415952,3) from dual;

--문자 처리 함수

--날짜 함수
select sysdate from dual;

--TO_CHAR
--date -> varchar2
select sysdate, to_char(sysdate,'YYYY-MM-dd') from dual;
select hiredate as hiredate from emp;
select ename, to_char(hiredate,'YYYY.MM.DD') as hiredate from emp;
--요일도 가능
select ename, to_char(hiredate,'YYYY.MM.DD DY') as hiredate from emp;

select sysdate, to_char(sysdate, 'HH24:MI:SS') from  dual;
--네이버 카페 게시글 시간 형식
select to_char(sysdate, 'YYYY.MM.DD. HH24:MI') from dual;

--to_char
--number -> varchar2

select to_char(123000, ',999,999,999,999') from dual;
select to_char(12500, '000,000') from dual;
--자리수 안 맞음.
select to_char(12500, '0,000') from dual;

select to_char(12500, '999,999') from dual;
select to_char(125000, 'L999,999,999,999') as price from dual;

--소수점 표현
select to_char(3.14 , '000,000.000') from dual;
select to_char(3.14 , '999,999.99') from dual;

select to_char(sal*1000, 'L999,999,999')
, to_char (sal*1000*12+nvl(comm,0),'L999,999,999,999')as income  from emp order by income desc;

-- to_date
-- to_date(원본, 패턴)
-- str -> date
-- 고객이 입력한 값들은 서버에 String 값으로 저장되고 , 이 String 값을 데이터베이스에 저장하기 위해서
-- 문자열을 다시 숫자로 바꿔주는 처리를 할 때 이용 되곤 한다.
select to_date('19810820', 'YYYY-MM-DD') from dual;
select to_date('1981-08-20', 'YYYY-MM-DD') from dual;

select ename, hiredate from emp where hiredate = to_date('1981/02/20','YYYY/MM/DD');

select sysdate, to_date('20201225','YYYYMMDD'),trunc(to_date('20201225','YYMMDD')-sysdate) from dual;
select sysdate, trunc(sysdate - to_date('19921201','YYYYMMDD')) from dual;

--to_number
--to_number(원본 ,'패턴')
--String -> number 변경 : 산순연산 또는 관계연산을 목적으로 변환
select to_number('20,000','999,999') - to_number('10,000','999,999') from dual;

--decode 함수 : if switch 구문과 유사
select ename, deptno, decode(deptno, 
10,'account',
20,'research',
30,'sales',
40,'operations') as dname from emp;

select empno, ename, job, sal, decode(job,
'ANALYST',sal*1.05,
'SALESMAN',sal*1.10,
'MANAGER',sal*1.15,
'CLERK',sal*1.20) as upsal from emp order by upsal desc;


--case - edn 함수 
--java의 if else 구문과 비슷
select ename, deptno,
case when deptno=10 then 'ACCOUNTING'
when deptno=20 then 'RESEARCH'
when deptno=30 then 'SALES'
when deptno=40 then 'OPERATIONS'
End as dname from emp;

select empno, ename, job, sal,
case when job = 'ANALYST' then sal*1.05
when job = 'SALESMAN' then sal*1.10
when job = 'MANAGER' then sal*1.15
when job = 'CLERK' then sal*1.20
end as upsal from emp order by upsal desc;



