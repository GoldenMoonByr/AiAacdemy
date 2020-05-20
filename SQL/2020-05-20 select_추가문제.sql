--2020.05.20 : 마당서적 추가 문제
desc book;
desc customer;
desc orders;


--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
--(1) 도서번호가1인도서의이름
select bookname from book where bookid = 1;
-- 보통 우리가 하는 제목 검색
--select bookname from book where bookname like '%축구%';

--(2) 가격이20,000원이상인도서의이름
select bookname from book where price =20000;
--(3) 박지성의총구매액(박지성의고객번호는1번으로놓고작성)
select to_char(sum(saleprice),'L999,999') as"박지성의 총구매액" from orders where custid =1 ; 

--(4) 박지성이구매한도서의수(박지성의고객번호는1번으로놓고작성)
select count(*) as"박지성이 구매한 도서의 수" from orders where custid = 1;

--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--(1) 마당서점도서의총개수
select count(*) as"마당 서점 도서의 총개수" from book;
--(2) 마당서점에도서를출고하는출판사의총개수
select count(distinct publisher) as"출판사의 총개수" from book;
--(3) 모든고객의이름, 주소
select name, address from customer;
--(4) 2014년7월4일~7월7일사이에주문받은도서의주문번호
select orderid from orders where orderdate between '14/07/04' and '14/07/07'; 
select orderid from orders where orderdate between '14-07-04' and '14-07-07';
--(5) 2014년7월4일~7월7일사이에주문받은도서를제외한도서의주문번호
select orderid from orders where orderdate not between '14/07/04' and '14/07/07'; 
select orderid from orders where orderdate not between '14-07-04' and '14-07-07';
--(6) 성이‘김’씨인 ==> like '김%' ==> 김으로 시작하고, 뒤에 오는 글자는 몇 글자가 되든 상관없음.
--고객의이름과주소
select name, address from customer where name like '김%';

--(7) 성이‘김’씨이고이름이‘아’로끝나는 
--고객의이름과주소
select name, address from customer where name like '김%아';
--정의 되어지는 데이터가 무조건 세글자 이름의 '김' 시작, '아' 끝인 패턴이라면 다음도 가능하다.
select name, address from customer where name like '김_아';





