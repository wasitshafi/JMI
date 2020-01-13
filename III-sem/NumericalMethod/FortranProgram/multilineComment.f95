program multilineComment
    implicit none;
    integer i /10/;
    real , dimension(2, 4) :: arr;

    print *, "i = ", i;

    goto 100;
    print *, "Hello World";
    print *, "Hello World";
    print *, "Hello World";
    print *, "Hello World";
    100;
    print *, "End of program";
end program multilineComment