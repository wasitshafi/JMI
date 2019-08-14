program CASting ! CTM : fortran is case insensitive language
    
    implicit none;
    InteGer a, b;
    ReAl p, q;
    
    a = 5;
    b = 60;

    p = 45.28964;
    q = 78.25874;

    print *,"a=", a; 
    print *,"b=", b; 
    
    print *,"p=", p; 
    print *,"q=", q; 
    
    a = q;
    p = b;
    print *, "After Implicit casting";
    print *, "a = ", a;  ! Implicit Casting
    print *, "p = ", p;
    
    print *, "Explicit casting";    
    print *, "real(a) = ", real(a);
    print *, "int(p) = ", int(p);   ! CTM : int for casting not integer
    
end program casting