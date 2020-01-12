program hugeKind
    implicit none;
    
    !Kind set the  size of data type in bytes ex : kind = 1,2,4,8,16,32....
    integer :: i1;
    integer(kind = 1) :: i2; ! i1 will be of 1 byte so its range is upto 128 i.e. 0-127
    integer(kind = 2) :: i3;
    integer(kind = 4) :: i4;
    integer(kind = 8) :: i5;
    integer(kind = 16) ::i6;
    
    integer x;
    real r;
    character ch;
    character (len = 20) str;
    
    !huge() function gives the largest number that can be held by the specific integer data type.
    print *, "deault, huge(i1) : ", huge(i1);
    print *, "kind  = 1 ,huge(i2) : ", huge(i2);    
    print *, "kind  = 2 ,huge(i3) : ", huge(i3);    
    print *, "kind  = 4 ,huge(i4) : ", huge(i4);    
    print *, "kind  = 8 ,huge(i5) : ", huge(i5);    
    print *, "kind  = 16 ,huge(i6) : ", huge(i6);    

    !The intrinsic function kind() allows you to query the details of the hardware’s data representations before running a program.
    ! for more info ref: https://www.tutorialspoint.com/fortran/fortran_numbers.htm
    print *, "kind(x) = ", kind(x);
    print *, "kind(r) = ", kind(r);
    print *, "kind(ch) = ", kind(ch);
    print *, "kind(str) = ", kind(str); ! why its prints only 1 bytes ...?

end program hugeKind