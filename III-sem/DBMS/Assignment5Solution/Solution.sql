create table customers5( id number(3) not null,
                       name varchar(30) not null,
                       age number(2) not null,
                       address varchar2(50) not null,
                       salary number(6) not null,
                       primary key(id),
                       check(age > 0),
                       check(salary > 0)
);

select * from customers5;
desc customers5;

insert into customers5 values(:ID, :Name, :Age, :Address, :Salary);

--1)
declare
   id integer;
   name varchar2(30);
   age number(2);
   address varchar2(50);
   salary number(5);
   cursor c is select * from customers5;
begin

   open c;
   fetch c into id, name, age, address, salary;
   while(c%found) loop
     dbms_output.put_line(id || ' '|| name || ' ' || age || ' ' || address || ' ' || salary);
     fetch c into id, name, age, address, salary;
   end loop;
   close c;

end;

--2)
Ref : https://docs.oracle.com/cd/E11882_01/appdev.112/e25519/triggers.htm#LNPLS020
      https://docs.oracle.com/cd/E17781_01/appdev.112/e18147/tdddg_triggers.htm#TDDDG50000

create or replace trigger trackSalaryDifference before
    insert or
    update of salary or
    delete
on customers5 for each row
begin
    case
      when inserting then
        dbms_output.put_line('Inserting new Record of id : ' || :new.id);
      when updating('salary') then
        dbms_output.put_line('Updating Salary' || chr(13) || 'Old Salary      : ' || :old.salary  || chr(13) || 'New Salary      : ' || :new.salary || chr(13) || 'Abs. Difference : ' || abs(:old.salary - :new.salary));
      when deleting then
        dbms_output.put_line('Deleting Record of id : ' || :old.id);
    end case;
end;

--3)
create or replace procedure greatest(a in integer, b in integer, result out integer) 
is
begin

 if(a > b) then
   result := a;
 else
   result := b;
 end if;
end;

declare
   a integer;
   b integer; 
begin
     a := :Enter_value_of_a;
     b := :Enter_value_of_b;
     dbms_output.put_line('a : ' || a || chr(13) ||'b : ' || b || chr(13) || 'Result : ' || greatest(a, b));
end;