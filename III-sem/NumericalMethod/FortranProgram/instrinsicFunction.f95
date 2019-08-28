! for more info refer : https://pages.mtu.edu/~shene/COURSES/cs201/NOTES/chap02/funct.html
program intrinsicfunction

! CTM is most of the Mathematical function the argument must be real

print *, "abs(-5)            : ", abs(-5); ! argument can be integer/real
print *, "abs(25.14)         : ", abs(25.14);
print *, "mod(10, 2)         : ", mod(10, 2);
print *, "mod(17, 3)         : ", mod(10, 2);
print *, "sqrt(16.0)         : ", sqrt(16.0);
print *, "sqrt(13)           : ", sqrt(13.5);
print *, "exp(3)             : ", exp(3.0);    ! base e (euler e = 2.718)
print *, "log(10)            : ", log(10.0);
print *, "int(12.41)         : ", int(12.41); ! gives integer part
print *, "nint(11.43)        : ", nint(11.43);
print *, "nint(11.63)        : ", nint(11.63);
print *, "fraction(11.43)    : ", fraction(11.43);
print *, "floor(11.43)       : ", floor(11.43);
print *, "floor(11.93)       : ", floor(11.93);
print *, "real(10)           : ", real(10);
print *, "max(3, 44, 54)     : ", max(3, 44, 54);
print *, "min(3, 44, 54)     : ", min(3, 44, 54);
print *, "max(3.4, 6.1, 5.6) : ", max(3.4, 6.1, 5.6);
print *, "min(3.4, 6.1, 5.6) : ", min(3.4, 6.1, 5.6);

end program intrinsicfunction