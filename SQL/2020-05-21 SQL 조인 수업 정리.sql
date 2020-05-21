--2020.05.21
----------------------------
--Join
--스키마의 결합
----------------------------

select ename ,dname from dept, emp where dept.deptno = emp.deptno;

select ename ,dname, e.deptno, d.deptno from dept d, emp e where d.deptno = e.deptno;




--book. customer, orders
--cross JOIN
select * from orders;
select * from book;
select * from customer;
select * from orders, book;

select * from dept, emp;

--Equi Join
select * from orders o, book b, customer c;
--예)
select * from orders o, book b, customer c
where o.bookid = b.bookid and o.custid = c.custid
and name like '박지성'
;


--non - Equi Join
select * from salgrade;

select ename, sal, grade from emp, salgrade
where sal between losal and hisal;

select ename, sal, grade,losal , hisal from emp, salgrade 
where sal between losal and hisal;

select ename , sal ,grade from  emp e, salgrade s
where e.sal >= s.losal and e.sal <= s.hisal;

--Self Join

--관리자의 이름을 알아보자
select * from emp;

select e.ename ||'의 상사는 '|| m.ename ||' 입니다.'
from emp e, emp m 
where e.mgr = m.empno
order by e.empno;

--Outer Join
--King의 MGR은 존재하지 않으으로 컬럼 값은 NULL 이다. 그러므로 Self Join의 결과에서 배제됨.
--그러나 S.J에 만족하지 못하였더라도 King의 정보를 출력하고 싶을 때
-- (+) 기호를 조인 조건에서 정보가 부족한 칼럼 이름 뒤에 덧붙임.
select e.ename||'의 상사는' ||m.ename ||'입니다.' 
from emp e , emp m
where e.mgr = m.empno(+)
order by e.empno
;

select e.ename , e.empno, e.sal, nvl (e.comm,0),nvl( m.ename,'관리자 없음')
from emp e, emp m
where e.mgr = m.empno(+)
;

--ANSI Join
select * from emp cross join dept;

select ename, dname from emp e Inner join dept d
on e.deptno = d.deptno;

select ename, dname 
from emp inner join dept
using(deptno);


--NATURAL JOIN
select ename, dname
from emp natural join dept;

--OUTER JOIN
select e.ename , e.empno, e.sal, nvl (e.comm,0),nvl( m.ename,'관리자 없음')
from emp e, emp m
where e.mgr = m.empno(+)
;
select *
from emp e left outer join emp m
on e.mgr =m.empno
;