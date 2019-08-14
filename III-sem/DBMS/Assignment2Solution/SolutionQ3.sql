         -- CTM -- 
-- pname => programmer name
-- splace => study place
-- ccost => course cost
  
-- devin => developed in
-- scost => software cost
-- dcost => development cost

-- prof1 => proficiency1


--Creating table
create table studies(pname varchar2(30) not null, splace varchar2(30) not null, course varchar2(15) not null, ccost number(5) not null);

create table software(pname varchar2(30) not null, title varchar2(20) not null, devin varchar2(15) not null, scost number(6) not null, dcost number(6) not null, sold number(6) not null);

create table programmer(pname varchar2(30) not null, dob date not null, doj date not null, sex char, prof1 varchar2(15) not null, prof2 varchar2(15) not null, sal number(5) not null);

select * from studies;
desc studies;

select * from software;
desc software;

select * from programmer;
desc programmer;

--Inserting Data
insert into studies(pname, splace, course, ccost)values('wasit shafi', 'new delhi', 'MCA', 50000);
insert into studies values('wasit shafi', 'new delhi', 'MCA', 500000);
insert into studies values(:Name, :Study_Place, :Course, :Course_Cost);


insert into programmer(pname, dob, doj, sex, prof1, prof2, sal)values('wasit shafi', '09-Sep-1999', '09-Oct-2005','m', 'c++', 'java', 500000);
insert into programmer values('saima ashraf', '15-Dec-1998', '20-Feb-2006','f', 'c', 'vb', 350000);
insert into programmer values(:Name, :DOB, :DOJ, :Sex, :Proficiency1, :Proficiency2, :Salary);


--1

--2

--3 
select pname as "Names" from studies where course = 'PGDCA' 

--4
select max(sold) "Highest no. of copies" from software;

--5
select pname as "Name", dob as "DOB" from programmer where extract(month from  dob) = 4;

-6
select min(ccost) as "MIN. Fee" from studies;

--7
select count(course) as "Total" from studies where course = 'DCA'

--8
--9
--10 
select count(splace) as "Total" from studies where splace = 'pentafour'

--11
--12
--13
--14
--15
--16
select count(splace) as "Total" from studies where splace = 'pragathi'
--17
select count (ccost) as "Total" from studies where (ccost >=10000 and ccost <= 15000)

--18
select avg(ccost) as "Average Fee"  from studies
select (sum(ccost)/count(ccost)) as "Average Fee" from studies


--19
select pname "Name", dob as "DOB", DOJ as "DOJ", upper(sex) as "Sex", (prof1 || ', ' || prof2) as "Proficiency" from programmer where prof1 = 'c' or prof2 = 'c'

--20
select count(*) as "Total" from programmer where prof1 in('c', 'c++') or prof2 in('c', 'c++')

--21 
select count(*) as "Total" from programmer where prof1 not in('c', 'c++') and  prof2 not in('c', 'c++')

--22 
select extract(year from sysdate) - min(extract( year from dob)) from programmer
select min(dob) from programmer

--23

--26
select count(*) as "Total" from programmer where sex = 'f'

--27
select distinct(distinct(prof1) + distinct(prog2)) from programmer

--28
select avg(sal) as "Average Salary"  from programmer
select (sum(sal)/count(sal)) as "Averae Salary" from programmer

--30 
select * from programmer where prof1 not in('c', 'c++', 'Pascal') and  prof2 not in('c', 'c++', 'Pascal')

