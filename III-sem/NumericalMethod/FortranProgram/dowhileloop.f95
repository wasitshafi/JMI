program loop
    implicit none
    integer n;
    integer i;
    
    print *, "Enter value of n : ";
    read *, n;
    i = 0;
    
    ! This loop is similar to while loop  
    do while(i .le. n)
       print *, i;
       i = i + 1;
    end do
    
    end program loop