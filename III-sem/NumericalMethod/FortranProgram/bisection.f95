! Fortran program to find the root of equation using bisection

program bisection
	implicit none;

	integer iterations /0/;
	Real F, x, a, b, c, eps /.00001/; ! tolerance;
	F(x) = (x**3 - x - 2); ! statement function

	x = 0;
	do while((F(x) * F(x + 1)) .ge. 0)
		x = x + 1;
	end do
	

	
	if(F(x) .lt. 0) then
		a = x;
		b = x + 1;  
	else
		a = x + 1;
		b = x;
	end if;

	iterations = iterations + 1;
	do while((abs(a - b)) > eps)
		c = (a + b ) / 2;

		if(F(c) .le. 0) then
			a = c;
		else
			b = c;	
		end if;
	end do

	print *, "Iterations : ", iterations;
	print *, "Value of c : ", c;
	print *,"Root : ", F(c); 
end program bisection