create table employee1(employeeid number(5), name varchar2(30), email varchar2(25), mobileno number(10), jobid varchar2(10), salary number(8, 2));

desc employee1

select * from employee1


--a)                    INSERTION

insert into employee1 values(54, 'Wasit Shafi', 'wasit@gmail.com', 9856874125, 'j1001', 40000)
                    -- or
insert into employee1(employeeid, name, email, mobileno, jobid, salary)values(48, 'Syed Hamid', 'SyedHamid@gmail.com', 852459621, 'j1002', 50000)
                    -- or
insert into employee1 values(:Employee_ID, :Name, :Email, :MobileNo, :Job_ID, :Salary)   -- GUI Based 
                    -- or
insert into employee1(employeeid, name, email, mobileno, jobid, salary) values(:Employee_ID, :Name, :Email, :MobileNo, :Job_ID, :Salary)    -- GUI Based 


--b)                   Display all records in the table

select * from employee1

select employeeid as "Employee ID", name as "Name", email as "Email-ID", mobileno as "Mobile no.", jobid as "Job ID", salary as "Salary" from employee1


--c)                   Update a record in a table to change salary of a person with specific 

update employee1 set salary = 5000 where name = 'Wasit Shafi'

--d)                   Delete all rows of table

delete from employee1
