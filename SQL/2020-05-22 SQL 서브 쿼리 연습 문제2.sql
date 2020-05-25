--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
desc book
select * from book;
desc orders
select * from orders;
desc customer
select * from customer;


--(5) 박지성이 --customer
--구매한 --orders
--도서의 출판사수 --book

--조인을 이용한 방법
select count(distinct publisher)
from customer c, orders o, book b
where c.custid = o.custid and o.bookid = b.bookid
and c.name = '박지성'
;


--서브쿼리를 이용한 방법
--박지성이 구매한 도서 id
select distinct o.bookid 
from customer c , orders o where c.custid = o.custid and c.name = '박지성'; 


select count(publisher)
from book
where bookid in (select distinct o.bookid 
from customer c , orders o where c.custid = o.custid and c.name = '박지성');

select bookid 
from orders o, customer c 
where o.custid = c.custid and c.name = '박지성'; 


--(6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이
--조인을 이용한 방법
select b.bookname, b.price ,b.price - o.saleprice "정가 - 판매가격"
from orders o , customer c , book b
where c.custid = o.custid and b.bookid = o.bookid
and c.name = '박지성'
;


--서브 쿼리를 이용한 방법
select custid from customer where name = '박지성';

select b.bookname, b.price , b.price - o.saleprice
from orders o , book b 
where o.bookid = b.bookid 
and custid = (select custid from customer where name = '박지성') --박지성의 custid
;


--(7) 박지성이구매하지않은
--도서의이름

--박지성이 구매한
select *
from orders o , customer c 
where o.custid = c.custid and c.name = '박지성';

select bookname,bookid
from book
where bookid not in (select o.bookid
from orders o , customer c 
where o.custid = c.custid and c.name = '박지성')
;


--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--(8) 주문하지않은
--고객의이름(부속질의사용)

--외부 조인을 이용한 방법
select c.name
from orders o, customer c
where o.custid(+) = c.custid
and o.orderid is null
;

--서브 쿼리를 이용한 방법
select distinct custid from orders ;

select name
from customer
where custid not in(select distinct custid from orders) --구매한 오더의 custid
;


--(9) 주문금액의총액과주문의평균금액
select sum(saleprice) , avg(saleprice)
from orders
;


--(10) 고객의
--     이름과고객별구매액
select c.name ,sum(o.saleprice)
from orders o , customer c
where o.custid = c.custid
group by c.name
;

--(11) 고객의 이름과 고객이 구매한 도서 목록

select c.name, b.bookname 
from book b , orders o , customer c
where b.bookid = o.bookid and o.custid = c.custid 
;



--(12) 도서의가격(Book 테이블)과 판매가격(Orders 테이블)의
--     차이가가장많은주문

--서브 쿼리 이용

--차이가 가장 많이 나는 주문
select max(b.price - o.saleprice)
from orders o, book b
where o.bookid = b.bookid;

select b.bookname, b.price - o.saleprice
from orders o, book b
where o.bookid = b.bookid
and price-saleprice = (select max(b.price - o.saleprice)
from orders o, book b
where o.bookid = b.bookid)
;


--(13) 도서의 판매액 평균보다 
--     자신의 구매액 평균이 더 높은 고객의 이름

--평균 구매액
select avg(saleprice)
from orders;

select c.name , avg(saleprice)
from orders o , customer c 
where o.custid = c.custid
group by c.name
having avg(saleprice) > (select avg(saleprice)
from orders) --평균 구매액
;



--3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
--(1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
select distinct b.publisher
from orders o , customer c, book b
where o.custid = c.custid and o.bookid = b.bookid
and c.name= '박지성';

select *
from orders o , customer c, book b
where o.custid = c.custid and o.bookid = b.bookid
and b.publisher in
(
select distinct b.publisher
from orders o , customer c, book b
where o.custid = c.custid and o.bookid = b.bookid
and c.name= '박지성'
) --박지성이 구매한 도서의 출판사
and c.name != '박지성'
;


--(2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름

select c.name, count(distinct publisher)
from orders o, customer c , book b
where o.custid = c.custid and o.bookid = b.bookid 
group by c.name 
having count(distinct publisher) >=2
;



