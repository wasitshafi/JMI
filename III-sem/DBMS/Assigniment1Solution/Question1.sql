create table dept1 (depatmentid number(4), deptname varchar2(20), managerid number(4), managername varchar2(20), locationid number(4));

desc dept1

select * from dept1



--a)                    INSERTION

insert into dept1 values(101, 'Department of CS', 1001, 'Abdul Aziz', 1125)
                    -- or
insert into dept1 (departmentid, deptname, managerid, managername, locationid)values(1051, 'Department of CS', 1001, 'Abdul Aziz', 1125)
                    -- or
insert into dept1 values(:Enter_departmant_ID, :Enter_Department_name, :Enter_manager_ID, :Enter_Manager_Name, :Enter_location_ID)   -- GUI Based 
                    -- or
insert into dept1 (departmentid, deptname, managerid, managername, locationid)values(:Enter_departmant_ID, :Enter_Department_name, :Enter_manager_ID, :Enter_Manager_Name, :Enter_location_ID) -- GUI Based Insertion



--b)                   Selecting Department ID & Department Name

select departmentid, deptname from dept1
                    -- or
select departmentid as "Dept. ID", deptname as "Dept. Name" from dept1



--c)                   Selecting Department Name & Department Manager

select deptname, managername from dept1
                    -- or
select deptname as "Dept. Name", managername as "Manager" from dept1



--d)                   Deleting All rows

delete from dept1
