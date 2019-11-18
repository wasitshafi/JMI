!Incomplete program....

Program MAIN
    implicit none;
    real ll, ul, sum1, sum2, sum;
!    F(x) = 1/(1 + x**2);
    F(X)=0.398862*((PI+(X/SQRT(200.0)))*EXP(-0.5*X*X))

    integer n, i;
    real h;
    real integral;
    
    ll = 0
    ul = 1
    n = 6
    h = (ul-ll) / n

    sum = F(ll) + F(ul);
    sum1 = 0;
    sum2 = 0;

    do i = 2 , n, 2
     sum1 = sum1 + F(ll + (i-1)*h)
    end do

    do i = 3 , n, 2
        sum2 = sum2 + F(ll + (i-1)*h)
    end do
   

   integral = h/3(sum + 2*sum2 + 4*sum1)

   print * , integral

end program MAIN