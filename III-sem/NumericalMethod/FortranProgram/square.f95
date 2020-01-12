! fortran statement function is a function-like declaration, made in a single statement.
! refer : https://www.obliquity.com/computer/fortran/function.html
!         https://docs.oracle.com/cd/E19957-01/805-4939/6j4m0vnb9/index.html
program Square
	implicit none;
	
	integer num;
 	integer F;
	F(num) = num * num; 
	print *, "Enter number : ";
 	read  *, num;
	write(*,*) "Square of ", num, " is : ", F(num);

end program Square
