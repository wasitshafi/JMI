program fibonaciiSeries
    implicit none;
    integer term, term1, term2, n, i;

    write(*, *) "Enter value of n...";
    read *, n
    
    term1 = 0;
    term2 = 1;

    if(n == 1) then
        print *, 0;
    else if(n == 2) then
        print *, 0;
        print *, 1;
    else
        term1 = 0;
        term2 = 1;
        print *, term1;
        print *, term2;

        do i = 2 , n - 1, 1
            term = term1 + term2;
            print *, term;
            term1 = term2;
            term2 = term;
        end do;
    end if
end program fibonaciiSeries