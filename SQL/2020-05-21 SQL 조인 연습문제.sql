--32. EQUI 조인을 사용하여 SCOTT 사원의 부서번호와 부서 이름을 출력하시오.

select d.deptno "부서번호" , dname "부서이름" , ename "사원이름"
from emp e, dept d 
where e.deptno = d.deptno and ename like 'SCOTT';

select deptno "부서번호" , dname "부서이름" , ename "사원이름"
from dept natural join emp where ename like 'SCOTT';

--33. INNER JOIN과 ON 연산자를 사용하여 사원 이름과 함께 그 사원이 소속된 부서이름과 지역 명을 출력하시오.

select ename 사원이름 , dname 부서이름
from emp e  inner join dept d 
on e.deptno = d.deptno;

--36. 조인과 WildCARD를 사용하여 이름에 ‘A’가 포함된 모든 사원의 이름과 부서명을 출력하시오.
select ename 사원이름 , dname 부서이름 
from emp natural join dept
where ename like '%A%';




--37. JOIN을 이용하여 NEW YORK에 근무하는 모든 사원의 이름, 업무, 부서번호 및 부서명을 출력하시오.

select ename 사원이름 , job 업무, d.deptno 부서번호 , dname 부서이름 , loc 위치 
from emp e, dept d 
where d.deptno = e.deptno and d.loc = 'NEW YORK';

select ename 사원이름 , job 업무, deptno 부서번호 , dname 부서이름 , loc 위치 
from emp natural join dept
where loc = 'NEW YORK';

--38. SELF JOIN을 사용하여 사원의 이름 및 사원번호, 관리자 이름을 출력하시오.

select e.empno 사원번호, e.ename 사원이름, m.ename "관리자 이름" 
from emp e , emp m 
where e.mgr = m.empno order by m.ename;

--39. OUTER JOIN, SELF JOIN을 사용하여 관리자가 없는 사원을 포함하여 사원번호를 기준으로 내림차순 정렬하여 출력하시오.

select e.deptno 부서번호, e.empno 사원번호,e.ename 사원이름,e.job,nvl(e.mgr,0) 업무,
e.hiredate 입사일,e.sal 급여,nvl(e.comm,0) 인센티브,nvl(m.ename,'관리자 없음') "관리자 이름"
from emp e, emp m
where e.mgr = m.empno(+) order by e.empno desc;

--40. SELF JOIN을 사용하여 지정한 사원의 이름, 부서번호, 지정한 사원과 동일한 부서에서 근무하는 사원을 출력하시오. ( SCOTT )

select e.deptno 부서번호, e.empno 사원번호,e.ename 사원이름,e.job,nvl(e.mgr,0) 업무,
e.hiredate 입사일,e.sal 급여,nvl(e.comm,0) 인센티브,nvl(m.ename,'관리자 없음') "관리자 이름"
from emp e, emp m
where e.deptno = m.deptno and m.ename= 'SCOTT' and e.ename not like 'SCOTT';

--41. SELF JOIN을 사용하여 WARD 사원보다 늦게 입사한 사원의 이름과 입사일을 출력하시오.

select e.ename 사원이름 ,e.hiredate 입사일
from emp e, emp m
where e.hiredate> m.hiredate and m.ename='WARD' and e.ename not like 'WARD'
order by e.hiredate;


--42. SELF JOIN 을 사용하여 관리자보다 먼저 입사한 모든 사원의 이름 및 입사일을 관리자의 이름 및 입사일과 함께 출력하시오.
select e.ename 사원이름,e.hiredate 입사일 , m.ename "관리자 이름" ,m.hiredate"관리자 입사일"
from emp e , emp m
where e.hiredate < m.hiredate and e.mgr = m.empno;