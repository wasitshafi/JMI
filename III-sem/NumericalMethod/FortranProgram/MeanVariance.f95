program meanVarianceSD
 
   implicit none;
   integer ,parameter:: MAX_SIZE = 50;
   integer n;
   integer i;
   real  sum, mean, variance, sd;
   real ,dimension(MAX_SIZE)::arr
  
   print *, 'Enter no of terms'
   read *, n
   
   !read input
   i = 1 
   do while(i <= n)
    read *, arr(i);
    i = i + 1
   end do
   !or read/write directly
   !read  (*,*),(arr(i),i = 1, n)
   !write (*,*),(arr(i),i = 1, n)
  
   
  ! print elements 
  ! print *, 'Array elements are as :'
  ! do i = 1 , n, 1
  !  print *, arr(i) , " *"
  ! end do
   
   
   sum = 0; 
   do i = 1, n, 1
      sum = sum + arr(i);
   end do
   
   mean = sum / n;
   
   variance = 0
   do i = 1, n, 1
      variance = variance + (arr(i) - mean)**2; ! ** === ^
   end do
   variance = variance / (n - 1)
   sd = SQRT(variance)

   print *, "Mean     : " ,mean
   print *, "Variance : " ,variance
   print *, "SD       : " ,sd
   
   end program meanVarianceSD