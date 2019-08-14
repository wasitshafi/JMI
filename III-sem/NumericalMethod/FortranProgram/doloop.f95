program loop
     implicit none;
     integer i, n;

     print *, "Enter value of n : ";
     read *, n;
    ! CTM : this loop is similar to for loop
     do i = 0, n, 2  ! synatax do var = start, stop, step
       print *, i;
     end do;
end program loop