-- Tabel : salesmen
create table salesmen(snum number(4) primary key, sname varchar2(30) not null, city varchar2(20), commission number(3) check(commission between -1 and 100) );

desc salesmen;

select * from salesmen;
select snum as "ID", sname as "Name", city as "City", concat(commission,' %') as "Commission" from salesmen;

insert into salesmen values(1001, 'piyush', 'london', 12);
insert into salesmen values(:Enter_ID, :Enter_Name, :Enter_City, :Enter_Commission);



-- Tabel : customers
create table customers(cnum number(4) primary key, cname varchar2(30) not null, city varchar2(20) not null, rating number(4) not null, snum number(4) not null);

desc customers

select * from customers
select cnum as "ID", cname as "Name", city as "City", rating as "Rating", snum as "Salesman ID" from customers

insert into customers values(:Enter_ID, :Enter_Name, :Enter_City, :Enter_Rating, :Enter_Number_Of_Salesman);



-- Tabel : Orders
create table orders(onum number(4) primary key, amount number(8,4) not null, odate date not null, cnum number(4) not null, snum number(4) not null);

desc orders
select * from orders
select onum as "Order ID", amount as "Amount", to_char(odate, 'DD/MM/YYYY') as "Order Date", cnum as "No Of Orders", snum as "Salesman ID" from orders

select onum as "ID", amount as "Amount", odate as "Order Date", cnum as "N0. Of Orders", snum as "Salesman ID" from orders

insert into orders values(:Enter_ID, :Enter_Amount, :Enter_Order_Date, :Enter_No_Of_Orders, :Enter_Number_Of_Salesman);

--a
select snum as "Salesman Id", max(amount) as "Amount" from orders group by snum having snum in( 1002, 1007)

--b
select count(odate) as "Total" from orders where odate ='03-Oct-1997'

--c
select sum(amount) as "Total" from orders;

--d
select avg(amount) as "Average" from orders;

--e

############no working properly
select count(*) as "Total" from orders group by odate having odate = to_date(sysdate, 'dd-Mon-YYYY')
###########################

--f
select snum as "Salesman ID", odate as "Order Date", max(amount) as "Maximum Amount" from orders group by snum, odate

--g

--h
select count (*) from (select distinct city from customers where city is not null);

--j
select cnum as "Customer ID", min(amount) as "Min. Order Amount" from orders group by cnum;

--k
