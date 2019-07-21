create table department2(deptno number(4) primary key, dname varchar2(30) not null, loc varchar(30) not null);

create table employee2(empno number(4) primary key, ename varchar2(20) not null, deptno number(4) references department2(deptno) , job varchar2(30), hiredate date default sysdate)
-- NOTE : we can also use 'on delete cascade' or 'on delete set null' on foreign key like  deptno number(4) references department2(deptno) on delete cascade
desc department2
desc employee2

select * from department2
select * from employee2


--a)                    INSERTION

-- Department Table

insert into department2 values(101, 'Department of Computer Science', 'New Delhi - 110025')
                    -- or
insert into department2(deptno, dname, loc) values(102, 'Department of Psychology', 'New Delhi - 110025')
                    -- or
insert into department2 values(:Department_No, :Department_Name, :Location)                       -- GUI Based
                    -- or
insert into department2(deptno, dname, loc)  values(:Department_No, :Department_Name, :Location)  -- GUI Based
                    


-- Employee Table

insert into employee2 values(1002, 'Hamid', 103, 'System Programmer')  -- it will date current date as default value for hiredate field
                    -- or
insert into employee2(empno, ename, deptno, job, hiredate) values(1005, 'Ashar Ahmad', 101, 'Content Writer', '01-jan-19')
                    -- or
insert into employee2 values(:Employee_No, :Employee_Name, :Department_No, :Job , :Hire_Date)
                    -- or
insert into employee2(deptno, dname, loc)  values(:Department_No, :Department_Name, :Location)  -- GUI Based








--b)                   Display all records in the table

select * from employee1

select employeeid as "Employee ID", name as "Name", email as "Email-ID", mobileno as "Mobile no.", jobid as "Job ID", salary as "Salary" from employee1


--c)                   Update a record in a table to change salary of a person with specific 

update employee1 set salary = 5000 where name = 'Wasit Shafi'

--d)                   Delete all rows of table

delete from employee1


