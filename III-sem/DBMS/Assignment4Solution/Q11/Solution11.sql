create table employee4(empnumber number(4), ename varchar2(35) not null, ecity varchar2(25) not null, salary number(6) not null, eaddress varchar2(35) not null, deptname varchar2(30) not null, primary key(empnumber));
create table company4(cname varchar2(30), ccity varchar2(30), empnumber number(4) references employee4(empnumber));

select * from employee4;
select * from company4;

select * from employee4company4View;
select * from employee4company4; 

insert into employee4 values(:ID, :Name, :City, :Salary, :Address, :Dept_Name);
insert into company4 values(:Name, :City, :Employee_ID);

--a
create view employeeNameAndCityView as select ename, ecity from employee4;

--b
update employeeNameAndCityView set ecity = 'Delhi' where ename = 'John';

--c
create view employee4company4View as select e.empnumber, e.ename, e.ecity, e.salary, e.eaddress, e.deptname, c.cname, c.ccity from employee4 e, company4 c;

--d
Remarks : Wrong Question(There exists dependencies).
--e

###############################
Wrong Question
declare
     average number(10, 2);
begin
     select avg(salary) into average from employee4;
     dbms_output.put_line('Average : ' || average);
end;
###########################

--f
declare
     eid integer;
     ename varchar2(30); dname varchar(30);
     cursor details is select empnumber, ename, deptname from employee4;
begin
     open details;
     dbms_output.put_line('Emp ID    Name          Dept ID');
  
     loop
        fetch details into eid, ename, dname;
        
        if(details%found)then
        
          dbms_output.put(eid || '      ' || ename || '   ');
          CASE dname
             when 'Technical' then dbms_output.put_line('1'); 
             when 'HR' then dbms_output.put_line('2'); 
             else dbms_output.put_line('3'); 
          end CASE;
        else
          exit;
        end if;
     end loop;
     close details;
end;
