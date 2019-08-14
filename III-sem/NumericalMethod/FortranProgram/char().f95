program ascii
    implicit none;
    integer i;
    i = 0;
    
    do while (i .le. 255)
       print *, "char(", i, ") = ", char(i); 
       i= i+1;
    enddo;
end program ascii