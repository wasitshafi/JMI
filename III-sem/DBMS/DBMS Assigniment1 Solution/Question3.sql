create table classmates1(rollno number(2), name varchar2(30), address varchar2(6), mobileno number(10), marksintest number(3));

desc classmates1

select * from classmates1



--a)                    INSERTION

insert into classmates1 values(54, 'Wasit Shafi', 'Solina', 9856874125, 600)
                    -- or
insert into classmates1 (rollno, name, address, mobileno, marksintest) values(48, 'Hamid', 'Bihar', 7558968574, 800)
                    -- or
insert into classmates1 values(:Rollno, :Name, :Address, :MobileNo, :Marks)   -- GUI Based 
                    -- or
insert into classmates1 (rollno, name, address, mobileno, marksintest) values(:Rollno, :Name, :Address, :MobileNo, :Marks)    -- GUI Based 


--b)                   Display student with rollno between 20 to 30

select * from classmates1 where rollno > 20 and rollno < 30

--c)                   Sort the table in increasing order of their roll no

select * from classmates1 order by rollno -- by default its in asc i.e "select * from classmates1 order by rollno asc"
 

--d)                   Display names of students with their percentage

select name as "Name", marksintest / 1000 * 100 as "Percentage" from classmates1