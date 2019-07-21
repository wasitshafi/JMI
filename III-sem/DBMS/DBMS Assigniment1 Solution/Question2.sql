create table friendslist1(name varchar2(15), address varchar2(30), mobileno number(10), highestdegree varchar2(6), marksinhighestdegree number(3));

desc friendslist1

select * from friendslist1



--a)                    INSERTION

insert into friendslist1 values('Wasit Shafi', 'Solina payeen, srinagar', 9854712548, 'MCA', 900)
                    -- or
insert into friendslist1 (name, address, mobileno, highestdegree , marksinhighestdegree )values('Wasit Shafi', 'Solina payeen, srinagar', 9854712548, 'MCA', 901)
                    -- or
insert into friendslist1 values(:Name, :Address, :MobileNo, :Highest_Degree, :Marks_in_Highest_Degree)   -- GUI Based 
                    -- or
insert into friendslist1 (name, address, mobileno, highestdegree , marksinhighestdegree ) values (:Name, :Address, :MobileNo, :Highest_Degree, :Marks_in_Highest_Degree)   -- GUI Based 



--b)                   Selecting name, highestdegree & marksinhighestdegree

select name, highestdegree, marksinhighestdegree from friendslist1
                    -- or
select name as "Name" , highestdegree as "Highest Degree", marksinhighestdegree as "Marks in Highest Degree" from friendslist1



--c)                   sorting table according to tables

select * from friendslist1 order by name -- by default its in asc i.e "select * from friendslist1 order by name asc"
                    -- or
select * from friendslist1 order by name desc -- for sortin name by descending



--d)                   Deleting rows such that no friends name can start from letter 'p'

delete from friendslist1 where name like 'p%'


--e)                   Display the name of friends in the decreasing order of their marks

select * from friendslist1 order by marksinhighestdegree desc