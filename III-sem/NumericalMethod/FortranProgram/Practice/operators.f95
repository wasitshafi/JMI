! for more info refer : https://www.tutorialspoint.com/fortran/fortran_operators
program operators
    ! CTM: here i don't have used 'implicit none' keep that in mind if u use variables 

!Arithmetic Operators    
    print *, "Arithmetic Operators";
    print *, "2 + 20     = ", 2 + 20; 
    print *, "2 - 20     = ", 2 - 20; 
    print *, "2 * 20     = ", 2 * 20; 
    print *, "20 / 3     = ", 20 / 3;
    print *, "mod(20, 3) = ", mod(20, 2); 
    print *, "2**20      = ", 2**10;
    
!Relation
    print *, char(10) ! new line
    print *, "Relational Operators";
    print *, "2 > 5  = ", 2 > 5;
    print *, "2 >= 5 = ", 2 >= 5;
    print *, "2 < 5  = ", 2 < 5;
    print *, "2 <= 5 = ", 2 <= 5;
    print *, "2 == 5 = ", 2 == 5;
    print *, "2 /= 5 = ", 2 /= 5;   !  '/=' its is not equal operator
    ! Alternate Method
    print *, char(10) ! new line
    print *, "Relational Operators";
    print *, "2 .gt. 5 = ", 2 .gt. 5;
    print *, "2 .ge. 5 = ", 2 .ge. 5;
    print *, "2 .lt. 5 = ", 2 .lt. 5;
    print *, "2 .le. 5 = ", 2 .le. 5;
    print *, "2 .eq. 5 = ", 2 .eq. 5;
    print *, "2 .ne. 5 = ", 2 .ne. 5;


!boolean
    print *, char(10) ! new line
    print *, "Boolean Values";
    print *, ".true.  = ", .true.;
    print *, ".false. = ", .false.;


!logical
    print *, char(10) ! new line
    print *, "Logical Operators ";
    print *, ".true..and..false.= ", .true..and..false.; ! General Syntax (exp).and.(exp) 
    print *, ".true..or..false. = ", .true..or..false.;
    print *, ".not..true.       = ", .not..true.;  
    print *, "(5<50).eqv.(10<90)= ", (5 < 50).eqv.(10 < 90);          ! General Syntax (exp).eqv.(eqv) ! NOTE : its not .e q.
    print *, "(5<50).neqv.(10<90)= ", (5 < 50).neqv.(10 < 90);          ! General Syntax (exp).eqv.(eqv) ! NOTE : its not .eq.
    
end program operators