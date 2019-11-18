program meanVarianceSD

    implicit none;
    integer, parameter::MAX_SIZE = 100;
    integer n;
    integer i;
    real  sumX, sumY, sumXY, meanX, meanY, Xpow2, Ypow2, X, Y, RESULT;
  
    real, dimension(2, MAX_SIZE)::arrXY
   
    print *, "Enter no of terms : "
    read *, n
    
    
    do i = 1, n
      print *, "x = "
      read *, arrXY(1, i);
      print *, "y = "
      read *, arrXY(2, i);
    end do;

     meanX = 0;
     meanY = 0;
     
    do i = 1, n, 1
       meanX = meanX + arrXY(1, i); 
       meanY = meanY + arrXY(2, i);
    end do;
    
    meanX = meanX / n;
    meanY = meanY / n;
    
    Xpow2 = 0;
    Ypow2 = 0;

    sumX = 0;
    sumY = 0;
    sumXY = 0;
    do i = 1, n , 1
       X = (arrXY(1, i) - meanX)
       Y = (arrXY(2, i) - meanY)
       sumX = sumX + X**2;
       sumY = sumY + Y**2;
       sumXY = sumXY + X * Y;
    end do;
    RESULT = sumXY / (SQRT(sumX) * SQRT(sumY));

    print *, "RESULT = ", RESULT;
!    print *, "MeanX = ", meanX;
!    print *, "MeanY = ", meanY;
!    print *, "sumX  = ", sumX;
!    print *, "sumY  = ", sumY;
!    print *, "sumXY = ", sumXY;
    
end program meanVarianceSD