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

--Inserting Data into studies table
insert into studies(pname, splace, course, ccost)values('wasit shafi', 'new delhi', 'MCA', 50000);
insert into studies values('wasit shafi', 'new delhi', 'MCA', 500000);
insert into studies values(:Name, :Study_Place, :Course, :Course_Cost);

--Inserting Data into software table
insert into software values('wasit shafi', 'payroll system', 'c#', 15000, 10000, 5);
insert into software values(:Name, :Software_Title, :Developed_In, :Software_Cost, :Development_Cost, :No_of_copies_sold);

--Inserting Data into programmer table
insert into programmer(pname, dob, doj, sex, prof1, prof2, sal)values('wasit shafi', '09-Sep-1999', '09-Oct-2005','m', 'c++', 'java', 500000);
insert into programmer values('saima ashraf', '15-Dec-1998', '20-Feb-2006','f', 'c', 'vb', 350000);
insert into programmer values(:Name, :DOB, :DOJ, :Sex, :Proficiency1, :Proficiency2, :Salary);


--1
select avg(scost) from software where devin='oracle'
		--or
select sum(scost)/ count(scost) from software where devin = 'oracle'

--2
-- we want only upto one decimal place that is why we use floor(.....*10)/10
select pname as "Name", floor(((sysdate - dob) / 365) * 10 ) / 10 || ' yrs' as "Age", floor(((sysdate - doj) / 365) * 10 ) / 10 || ' yrs' as "Experience" from programmer

--3 
select pname as "Names" from studies where course = 'PGDCA';

--4
select max(sold) "Highest no. of copies" from software;

--5
select pname as "Name", dob as "DOB" from programmer where extract(month from  dob) = 4;

--6
select min(ccost) as "MIN. Fee" from studies;

--7
select count(course) as "Total" from studies where course = 'DCA';

--8 
--CTM: revenue is not same as profit/income. revenue is 'Amount received from sale of product' 
select sum(scost*sold) as "Total Revenue" from software where devin = 'c'

--9
select * from software where pname = 'rakesh'
             --or
select pname as "Name", title as "Tittle", devin as "Developed In", scost as "Software Cost" from software where pname = 'rakesh'

--10 
select count(splace) as "Total" from studies where splace = 'pentafour';

--11
select title as "Title", pname as "Programmer Name" , devin as "Developed In", scost as "Software Cost", dcost as "Development Cost", sold as "Sold", scost*sold as "Total Sale" from software where scost * sold> 50000

--12

--13
select pname as "Programmer Name", title as "Tittle", devin as "Developed In", scost as "Software Cost", dcost as "Development Cost", sold as "Copies Sold" from software where scost * sold >= dcost;

--14
select max(scost) as "Costliest Software price" from software where devin = 'vb'

--15
select count(devin) as "Total" from software where devin = 'oracle'

--16
select count(splace) as "Total" from studies where splace = 'pragathi';

--17
select count (ccost) as "Total" from studies where (ccost >=10000 and ccost <= 15000);

--18
select avg(ccost) as "Average Fee"  from studies;
    		 --or
select (sum(ccost)/count(ccost)) as "Average Fee" from studies;

--19
select pname "Name", dob as "DOB", DOJ as "DOJ", upper(sex) as "Sex", (prof1 || ', ' || prof2) as "Proficiency" from programmer where prof1 = 'c' or prof2 = 'c';

--20
select count(*) as "Total" from programmer where prof1 in('c', 'pascal') or prof2 in('c', 'pascal');

--21 
select count(*) as "Total" from programmer where prof1 not in('c', 'c++') and  prof2 not in('c', 'c++');

--22 
-- we want only upto one decimal place that is why we use floor(.....*10)/10
select floor(((sysdate - min(dob)) / 365) * 10 ) / 10 || ' yrs' as "Oldest Male Programmer's Age " from programmer where sex = 'm' 

--23
select avg(floor( ((sysdate - dob)/ 365) * 10 ) / 10) || ' yrs' as "Avg. female Programmer's Age" from programmer where sex = 'f' 

--24
select pname as "Name", floor(((sysdate - doj) / 365) * 10 ) / 10 || ' yrs' as "Experience" from programmer order by pname desc

--25
select pname "Name", dob as "DOB", DOJ as "DOJ", upper(sex) as "Sex", (prof1 || ', ' || prof2) as "Proficiency" from programmer where extract(month from dob) = extract(month from sysdate)

--26
select count(*) as "Total Female Programmers" from programmer where sex = 'f';

--27
select prof1 as "Male Programmer's Language" from programmer where sex = 'm' union select prof2 from programmer where sex = 'm'

--28
select avg(sal) as "Average Salary"  from programmer
            --or
select (sum(sal)/count(sal)) as "Average Salary" from programmer

--29
select  count (*)  as "Total" from programmer where sal between 5000 - 1 and 7500 + 1   -- this will give salary range from 5000 to 75000

--30 
select pname "Name", dob as "DOB", DOJ as "DOJ", upper(sex) as "Sex", prof1  as "Proficiency1" , prof2 as "Proficiency2" from programmer where prof1 not in('c', 'c++', 'Pascal') and  prof2 not in('c', 'c++', 'Pascal')

--31

--32
select 'Mr.' || initcap(pname) || ' - has ' || floor(( (sysdate - dob) / 365) * 10 )/10 || ' years of experience.' as "Detalis" from programmer where sex = 'm' union select 'Ms.' || initcap(pname) || ' - has ' || floor(( (sysdate - dob) / 365) * 10 )/10 || ' years of experience.' as "Detalis" from programmer where sex = 'f'


