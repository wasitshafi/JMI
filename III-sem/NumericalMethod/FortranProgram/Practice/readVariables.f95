program readVariables
    implicit none;
    
    integer i;
    real r;
    
    print *, "Enter value of integer : ";
    read *, i;
    
    print *, "Enter value of real : ";
    read *, r
    
    print *, "Value of i = ", i , char(10),"Value of r = ", r;
end program 