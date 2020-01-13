program readMatrix
    integer i, j;
    integer, parameter :: rows = 3;
    integer, parameter :: cols = 3;
    integer, dimension(rows, cols) :: a;

    do i = 1, rows
        do j = 1, cols
            print *, "Enter element a(", i, ", ", j, ") : ";
            read *, a(i, j);
        end do
    end do

    print *, "Marix Elements are as as : ";
    do i = 1, rows
        do j = 1, cols
            print *, a(i, j);
        end do
        print *, "";
    end do
end program readMatrix