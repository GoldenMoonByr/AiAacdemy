--2020-05-27
-----------------------------------------------
--sequence : 번호 자동 생성기
-----------------------------------------------

--create sequence 시퀀스이름
--start wirh 시작값 0 시작
--increment by 증가값 
--maxvalue 최대값
--minvaluse 최소값
-- cycle | nocycle 반복 여부
-- cathe | nocashe 


--부서번호 deptno의 sequence 생성
create sequence dept_deptno_swq01;


select  dept_deptno_swq01.nextval
from dual;

select  dept_deptno_swq01.currval
from dual;