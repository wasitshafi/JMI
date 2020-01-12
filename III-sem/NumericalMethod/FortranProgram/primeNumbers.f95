program primeNo
    integer n;
    logical isPrime /.true./
    integer  i, j;

    print *, "Enter value of n...";
    read *, n;

    print *, "Prime no upto n : ";
    do i = 2, n, 1
        isPrime = .true.;
        do j = 2, int(sqrt(real(i))), 1 ! loop must have integer upper limit and sqrt takes real agruments
            if(mod(i,j) .eq. 0) then
                isPrime = .false.;
                exit;
            end if;
        end do
        
        if(isPrime) then
            print *, i;
        end if;
    end do;
end program primeNo
