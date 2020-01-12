program exitCycleStop
    ! exit -> its similar to break in c++;
    ! cycle -> its similar to continue in c++;
    ! stop -> its used to terminate the program i.e. its quiet similar to return in c++

    implicit none
    integer :: i;
  
     do i = 0, 10, 1  ! synatax do var = start, stop, step
       if(i .eq. 5) then
         cycle;  ! CTM : we can also use labled loop along with exit label just like in java
       end if;
       
       if(i .eq. 8) then
         exit;
       end if;
       
       print *, i;
     end do;
    
    stop;
    print *, "This is not going to print because of stop statement.";
end program exitCycleStop