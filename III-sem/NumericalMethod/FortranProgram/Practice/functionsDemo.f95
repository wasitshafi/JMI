program functionsDemo

    real :: ans;
    call sub1();
    call sub2(10, 20);

    ans = getsum(10.5, 2.2);
    print *, "sum : ", ans;

end program functionsDemo

subroutine sub1
    print *, "Hello world";
end subroutine sub1

subroutine sub2(a, b)
    integer :: a, b;
    print *, "a : ", a;
    print *, "b : ", b;
end subroutine sub2


function getsum(a, b)
    real :: getsum, a, b;
    getsum = a + b
 end function getsum