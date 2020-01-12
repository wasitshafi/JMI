program conditionalStatements
    implicit none
    integer a, b, c, result;
    
    print *, "Enter value of a :";
    read *, a;
    print *, "Enter value of b :";
    read *, b;
    print *, "Enter value of c :";
    read *, c;
    
    if( a < b) then
      if(a < c) then 
        result  = a;
      else
        result = c;
      endif
    else
        if(b > c) then 
           result = b;
        else
           result = c;
         endif
    endif
    
    print *, "Greatest number is : ", result;
end program conditionalStatements