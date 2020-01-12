! for more info ref : http://www.icl.utk.edu/~mgates3/docs/fortran.html

program datatype
    !The implicit none statement is used to inhibit a very old feature of Fortran that by default treats all variables
    ! that start with the letters i, j, k, l, m and n as integers and all other variables as real arguments.
    !Implicit None should always be used. It prevents potential confusion in variable types, and makes detection of typographic errors easier.
   implicit none
   ! they all are static variables
   integer :: i;
   real :: r;
   character :: char;
   character(len = 20) :: str;
   logical :: bool;
   complex :: c;  ! CTM: we can perform several operation between complex numbers ex: c1 = c1 + c2; 
   
   real, parameter :: pi = 3.1415 ! constant syntax <data_type>, parameter :: <constant name> = <exp>
   ! for constants its not like "real, parameter ::pi /3.1415/"
   str = "Hello world i am wasit shafi";
   i = 10;
   r = 55.36;
   char = 'C';
   bool = 0;
   c = (4, -8);  ! c = 4 + 8i

   print *, "i        : ", i;
   print *, "r        : ", r;
   print *, "char     : ", char;
   print *, "str      : ", str;
   print *, "str(3:8) : ", str(3 : 8);
   print *, "bool     : ", bool;
   print *, "c        : ", c;
   print *, "pi       : ", pi;
   
end program datatype