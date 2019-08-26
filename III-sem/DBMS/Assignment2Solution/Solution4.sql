-- Creating Tables
create table dept2(deptno number(2) primary key, dname varchar2(30), loc varchar2(30) );

create table emp2(empno number(4) not null, ename varchar2(30), job varchar2(20), mgr number(4), hiredate date, sal number(7,2), comm number(7,2), deptno number(2) references dept2(deptno));

desc dept2;
desc emp2;

select * from dept2
select * from emp2

insert into dept2 values(10, 'Dept. of Computer Science', 'New Delhi');
insert into dept2 values(:Dept_No, :Dept_Name, :Location);

insert into emp2 values(100, 'Wasit Shafi', 'System Programmer', 103, '05-Aug-2007', 40000, 5000, 10);
insert into emp2 values(:Emp_Id, :Name, :Job, :Manager_No, :Hire_Date, :Salary, :Commission, :Dept_No);

-- 1
select * from emp2 where empno in (select mgr from emp2 group by mgr)
            --or
select empno as "Employee No", ename as "Name", job as "Job", mgr as "Manager No.", hiredate as "Hire Date", sal as "Salary", comm as "Commission", deptno as "Dept. No." from emp2 where empno in (select distinct mgr from emp2);
            --or 
select * from emp2 where empno in (select distinct mgr from emp2)

-- 2 
select * from emp2 where deptno = 10 and (select count(*) from emp2 group by deptno having deptno = 10) > 4

--3 
select E1.ename as "Employee", E2.ename as "Manager" from emp2 E1, emp2 E2 where E1.mgr = E2.empno;

--4
select empno as "Employee No", ename as "Name", job as "Job", mgr as "Manager No.", hiredate as "Hire Date", sal as "Salary", comm as "Commission", deptno as "Dept. No." from emp2 where empno not in (select distinct mgr from emp2);

--5
select * from emp2 where sal > ( select min(sal) from emp2  where deptno = 20);

--6
select * from emp2 where sal > (select max(sal) from emp2 where empno in ( select distinct mgr from emp2));

--7
select job, max(sal) from emp2 group by job;

--8 
select deptno, max(hiredate) from emp2 group by deptno;

--9
select * from emp2

select extract(year from hiredate) from emp2;

select hiredate, count(*) from emp2 group by extract(year from hiredate)


select extract(year from hiredate) from emp2 ;

--10
select * from emp2
select deptno, sum(sal+comm) from emp2 group by deptno; -- list of dept with their total rem. but how to select max one deptno
--11
select * from emp2 where hiredate = (select max(hiredate) from emp2)

--12
select E1.empno, E1.ename, E1.job, E1.mgr, E1.hiredate, E1.sal, E1.comm, E1.deptno from emp2 E1 where E1.sal > (select avg(sal) from emp2 group by deptno having deptno = E1.deptno)

-- to view the average salary for each department use the below mentioned query:
select deptno, avg(sal) from emp2 group by deptno
