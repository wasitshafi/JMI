-- Creating Table

create table emp(ename varchar(30) not null, dept_name varchar2(30) not null, designation varchar2(20) not null, salary number(5) not null, date_of_join date not null);
desc emp

select * from emp


select ename as "Name", dept_name as "Department", designation as "Designation", salary as "Salary", To_CHAR(date_of_join, 'Mon DD, YYYY') as "Date of Join" from emp




insert into emp (ename, dept_name, designation, salary, date_of_join) values('karan', 'Accounting', 'Director', 50000, '17-Aug-12') -- CTM: we can't specify custom format to store data in oracle DB, although its upto admin. how to show date.Internally date with different formats as same eg: 17 Aug 2018 === 17-08-18 === August 17 2019 and so on. whatever format you provide while inserting EX: 17-August-19 or 17-Aug-19 its going to store in DB like 17-Aug-2018(DD-Mon-YYY) format 

insert into emp values(:Enter_name, :Enter_dept_name, :Enter_designation, :Enter_salary, :Enter_data_of_Join_DD_MON_YYYY);

--a)
select ename as "Names" from emp where salary < 20000

--b)
select ename as "Name", dept_name as "Department", designation as "Designation", salary as "Salary", To_CHAR(date_of_join, 'Mon DD, YYYY') as "Date of Join"  from emp where dept_name ='sales' and designation = 'manager'

--c)
select ename as "Name", dept_name as "Department", designation as "Designation", salary as "Salary", To_CHAR(date_of_join, 'Mon DD, YYYY') as "Date of Join"  from emp where ename like 's%'

--d)
select count(*) as "Total" from emp where dept_name = 'research' -- CTM: we can't use sub-Query within () like select count(select ---- from emp where dept_name = 'research') from emp   

--e)
select ename as "Name", dept_name as "Department", designation as "Designation", salary as "Salary", To_CHAR(date_of_join, 'Mon DD, YYYY') as "Date of Join"  from emp where date_of_join > TO_DATE('01-01-2010', 'DD-MM-YYYY')

--f)
select count(*) as "Total" from emp where salary > 8000 and salary < 12500

--g)
select  ename as "Name", dept_name as "Department", designation as "Designation", salary as "Salary", To_CHAR(date_of_join, 'Mon DD, YYYY') as "Date of Join"   from emp order by ename

--h)
select  ename as "Name", dept_name as "Department", designation as "Designation", salary as "Salary", To_CHAR(date_of_join, 'Mon DD, YYYY') as "Date of Join" from emp where designation = 'salesman' and date_of_join > TO_DATE('01-08-1990', 'DD-MM-YYYY')

--i)
select  ename as "Name", dept_name as "Department", designation as "Designation", salary as "Salary", To_CHAR(date_of_join, 'Mon DD, YYYY') as "Date of Join" from emp where designation = 'clerk'

--j)
select count(*) as "Total employees in Sales Dept." from emp where dept_name = 'sales'

--k)
select count(*) as "Total no of Employees" from emp

--l)
select  ename as "Name", dept_name as "Department", designation as "Designation", salary as "Salary", To_CHAR(date_of_join, 'Mon DD, YYYY') as "Date of Join" from emp where date_of_join > TO_DATE('01-01-1997', 'DD-MM-YYYY') and date_of_join < TO_DATE('31-12-2010', 'DD-MM-YYYY') 

--m)
select  ename as "Name", dept_name as "Department", designation as "Designation", salary as "Salary", To_CHAR(date_of_join, 'Mon DD, YYYY') as "Date of Join" from emp order by salary desc