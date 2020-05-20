--2020.05.20
-------------------------------
--그룹함수 ( 집합함수 )
-------------------------------
-- sum, avg , count, max, min (모두 잘 쓰이지만 그 중에서도 count의 사용빈도가 높음)
-- sum(컬럼이름) : 해당 컬럼의 데이터들의 합 반환
-- 매월 지급되는 급여의 총 합
select sum(sal) as totalsal from emp;

select to_char(sum(sal*1000),'L999,999,999,999') as totalsal from emp;

--null 값은 자동 삭제, 무시되어 연산이 진행된다.
select sum(comm) from emp;

-- avg(컬럼명) : 해당 컬럼의 데이터들의 평균값을 반환.
select avg(sal) from emp;
select 29025/14 from dual; -- 동일한 값이 출력되는 것을 볼 수 있다.

select avg(comm) from emp;
select sum(comm) from emp; 
select * from emp order by comm; 
--null이 아닌 comm의 부분은 4개 이므로 comm의 합 /4 가 평균값으로 
--출력되는 것을 볼 수 있다.

select to_char(avg(sal*1000), 'L999,999,999,999') as salavg from emp;


--max, min : 해당 컬럼의 데이터중에서 최대값, 최소값을 반환
select max(sal), min(sal) , max(comm) , min(comm) from emp;

--그룹 함수와 단순 컬럼은 같이 선언 될 수 없다.


--count(컬럼명 or *) : 행(row의 개수를 반환
select count(*) from emp;
select count(comm) from emp;  --null을 포함하는 행은 개수로 포함하지 않는다.

select count(job) from emp;

select distinct job from emp order by job; 

select count(distinct job) from emp order by job; 

--group by 절 : 특정 컬럼으로 그룹핑을 해주는다
select * from emp group by deptno;

select * from emp group by job;

--소속 부서별
--평균 급여 구하는 예제입니다.
select deptno , round(avg(sal),0)  from emp group by deptno;

--소속 부서별
--최대 급여와 최소 급여를 구하자
select deptno, max(sal) ,min(sal) from emp group by deptno;

--소속 부서별
--사원 수와 커미션을 받는 사원들의 수를 구하자.
select deptno, count(*) ,count(comm) from emp group by deptno;
select deptno, count(*) ,count(comm) from emp where comm<>0 group by deptno;

--소속 부서별 
--최대값과 최소값을 구하되 최대 급여가 2900이상인 부서만 출력합니다.
select deptno, avg(sal) from emp group by deptno having avg(sal)>=2900; 
select deptno, avg(sal), count(*) , count(comm), sum(comm) from emp group by deptno having avg(sal)<=2000; 

--직급별 , 지표 출력
select job, count(*) as"직급별 인원" , 
to_char(sum(sal*1000),'L999,999,999') as "직급별 월 총 급여",
to_char(avg(sal*1000),'L999,999,999.9') as "직급별 월 평균 급여", 
to_char(nvl(sum(comm),0),'L999,999') as "직급별 수령 커미션의 총 합",
to_char(max(sal*1000),'L999,999,999' )as "직급별 최고 급여 금액"
from emp group by job
--having count(*)>=2 --직급의 인원이 2명 이상인 직급
having avg(sal) >= 2000 and count(*) > 1
;

select deptno, job from emp group by deptno, job order by job;