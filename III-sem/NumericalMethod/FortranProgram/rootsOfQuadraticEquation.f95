program rootsOfQuadraticEquation
    implicit none;
    Real F, x, a, b, c;
    Real D, R1, R2;
    F(x) = a * (x**2) + b * x + c;

    write(*, *)"Enter Value of A, B & C...";
    read *, a, b, c;
   
    print *, "A : ", a;
    print *, "B : ", b;
    print *, "C : ", c;

    D = b**2 - 4 * a * c;
    print *, "D : ", D;

    print *, "";
    if(D .ge. 0) then     ! Real roots
        R1 = (-b + sqrt(D)) / 2 * a;
        R2 = (-b - sqrt(D)) / 2 * a;
        print *, "R1 : ", R1;
        print *, "R2 : ", R2;
    else                  ! Complex Roots
        print *, "There is no real roots, D = ", D;
    end if;

end program rootsOfQuadraticEquation