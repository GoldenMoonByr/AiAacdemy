--2020-05-25
--SQL 부속질의 연습문제 풀이


--43. 사원 번호가 7788인 사원과 담당 업무가 같은 
--사원을 표시(사원 이름과 담당업무)하시오.
select job from emp where empno = '7788';


select *
from emp
where job = 'ANALYST' --7788 사원의 담당 업무
;

--최종

select ename, job
from emp
where job = (select job from emp where empno = '7788') --7788 사원의 담당 업무
;


--44. 사원번호가 7499인 사원보다 
--급여가 많은 사원을 표시하시오. 
-- 사원이름과 감당 업무
select sal from emp where empno='7499';



select *
from emp
where sal >(select sal from emp where empno='7499')
;

select ename, job
from emp
where sal >(select sal from emp where empno='7499')
;


--45. 최소급여를 받는 
--사원의 이름, 담당업무 및 급여를 표시하시오. (그룹함수 사용)
select min(sal) from emp;

select *
from emp
where sal = (select min(sal) from emp)
;

select ename , job , sal
from emp
where sal = (select min(sal) from emp)
;

--all 방법
--모든 데이터들과의 비교 연산이 포함되어 있으므로 , 데이터가 많으면 많을수록
--비효율적임을 알 수 있다
select ename, job , sal
from emp
where sal <= all(select sal from emp)
;

--46. 평균급여가 가장 적은 직급의 
--직급 이름과 직급의 평균을 구하시오.

select job, avg(sal)
from emp
group by job
having avg(sal) < = all (select avg(sal)
from emp
group by job)
;

--직종별 평균의 최소 평균 값

select avg(sal) 
from emp
group by job;
select avg(sal)
from emp
group by job
;



select min(avg)
from (
    select avg(sal) as avg
    from emp
    group by job
)
;

select job, avg(sal)
from emp
group by job
having avg(sal) = (
    select min(avg)
from (
    select avg(sal) as avg
    from emp
    group by job
)
    
    
    )
;



--47. 각 부서의 최소 급여를 받는 
--사원의 이름, 급여, 부서번호를 표시하시오.
select deptno , min(sal)
from emp
group by deptno;

select *
from emp 
where sal in (select min(sal)
from emp
group by deptno);

------수정 요함
select *
from emp e1
where deptno in (e1.deptno = e2.deptno
from emp e2 ;

select *
from emp 
where sal in (select min(sal)
from emp
group by deptno);



--48. 담당업무가 ANALYST 인 사원보다 
--급여가 적으면서 
--업무가 ANALYST가 아닌 사원들을 표시
--(사원번호, 이름, 담당 업무, 급여)하시오.
select distinct sal from emp where job = 'ANALYST';


select * 
from emp 
where sal < all(select distinct sal from emp where job = 'ANALYST')
and job != 'ANALYST'
;



select empno , ename , job ,sal
from emp 
where sal < all(select distinct sal from emp where job = 'ANALYST')
and job != 'ANALYST'
;


--49. 부하직원이 없는 사원의 이름을 표시하시오.
select distinct mgr empno from emp there where mgr is not null;

select ename,mgr 
from emp
where empno not in(select distinct mgr from emp there where mgr is not null)
;





--50. 부하직원이 있는 사원의 이름을 표시하시오.





--51. BLAKE와 동일한 부서에 속한 사원의 이름과 입사일을 표시하는 질의를 작성하시오. ( 단 BLAKE는 제외 )





--52. 급여가 평균 급여보다 많은
--사원들의 사원 번호와 이름을 표시하되 
--결과를 급여에 대해서 오름차순으로 정렬하시오.
select avg(sal) from emp;


select empno, ename, sal
from emp
where sal > (select avg(sal) from emp)
order by sal asc;


--53. 이름에 K가 포함된 사원과 같은 부서에서 일하는 
-- 사원의 사원 번호와 이름을 표시하시오.
select distinct deptno from emp where ename like '%K%';

select empno, ename
from emp
where deptno 
in (select distinct deptno from emp where ename like '%K%')
;

--54. 부서위치가 DALLAS인 
--사원의 이름과 부서번호 및 담당업무를 표시하시오.
desc dept;

select deptno from dept where loc = 'DALLAS';

select ename, deptno, job
from emp where deptno 
in (select deptno from dept where loc = 'DALLAS')
;


--55. KING에게 보고하는  --mgr ->KING의 empno
--사원의 이름과 급여를 표시하시오.
select empno from emp where ename = 'KING';

select ename , sal
from emp
where mgr=(select empno from emp where ename = 'KING')
;

--56. RESEARCH 부서의 사원에 대한 
-- 사원이름 및 담당 업무를 표시하시오.

select deptno from dept where dname = 'RESEARCH';


select  ename, job
from emp
where deptno = (select deptno from dept where dname = 'RESEARCH')
;

--조인으로 가능하다면 조인으로 해주는 것이 더 좋다.
--질의가 하나이므로 내부적으로 처리하는 횟수를 줄일 수 있음.
select d.deptno , empno , job
from emp e, dept d
where e.deptno = d.deptno
and d.dname = 'RESEARCH'
;


--57. 평균 월급보다 많은 급여를 받고 
--이름에 M이 포함된 사원과 같은 부서에서 근무하는 사원의 
--사원 번호, 이름, 급여를 표시하시오.

--평균 월급
select avg(sal) from emp;
--이름에 M이 포함된 사원과 같은 부서
select distinct deptno from emp where ename like '%M%';

select empno ,ename, sal
from emp
where sal > (select avg(sal) from emp)
and deptno 
in (select distinct deptno from emp where ename like '%M%')
;

--58. 평균급여가 가장 적은 업무를 찾으시오.
--각 업무간 평균 급여
select job , avg(sal)
from emp
group by job
having avg(sal) <= all( select avg(sal) from emp group by job)
;


--59. 담당업무가 MANAGER 인 사원이 소속된 부서와 동일한 부서의 
-- 사원을 표시하시오.
select distinct deptno from emp where job = 'MANAGER';

select *
from emp
where deptno in (select distinct deptno from emp where job = 'MANAGER')
;
