! Fortran program to find the root of equation using bisection

program Bisection
	implicit none;
	Real F, x;

	integer i;

	print *, "Enter Value of i ";
	read *, x;


	!F(X) = X**3 + 2*X + 5;
    x = 0;
	do while( x .lt. 10)
		print * , x , " ";
	    print * ,"#";
		
	end do;

	!print *, F(2);
end program Bisection