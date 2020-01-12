program newtonRaphson
    real F;
    integer x;
    F(x) = x**2 + x - 5;
        
    i = 0
    do while(F(x) * F(x + 1) .gt. 0)
        print *, x;
        x = x + 1;
    end do
    print *, "Values are as : ";
    
    print *, x;

end program newtonRaphson