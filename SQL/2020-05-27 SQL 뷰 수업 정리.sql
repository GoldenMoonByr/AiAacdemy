--2020-05-27
----------------------------------------------------------
--view
----------------------------------------------------------
--논리적인 가상 테이블 : 테이블과 같이 사용 가능
--약간의 제약은 존재한다.
--물리적인 테이블을 기반으로 만든다 : select 서브쿼리를 이용해서 만든다.

--create [or replace] view view이름  as 서브쿼리
--자주 사용되는 30번 부서에 소속된 사원들의 사번과 이름과 부서번호를 출력하기 위한
--SELECT문을 하나의 뷰로 정의해 봅시다

--sys나 system에서 권한 부여 해줘야 함
-- 다른 사용자 -> scott -> 사용자 편집 -> 권한 부여 -> create ,drop view 권한 부여

create view emp_view_deptno30
as  
select empno, ename, deptno from emp where deptno =30
;

select * from emp_view_deptno30;

desc user_views;

select view_name, text from user_views;

drop view emp_view_deptno30;






--사원 중에서 입사일이 빠른 사람 5명(TOP-5)만을 얻어오기로 합시다.

--1. view 객체 생성
create or replace view emp_hir_view
as
select empno,ename, hiredate
from emp
order by hiredate asc
;

select * from emp_hir_view;
--emp를 view로 재정의 하면서 rownum이 조건에 맞게 재정의된다.
select rownum, empno, ename, hiredate from emp_hir_view;
--emp의 rownumm 순서는 초기에 데이터를 저장했던 순서이므로 rownum이 뒤죽박죽
select rownum, empno, ename, hiredate from emp order by hiredate;

select rownum, empno, ename, hiredate from emp_hir_view where rownum<=5;