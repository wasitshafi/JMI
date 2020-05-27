addition(_x, _y, _z):-
    _z is _x + _y.
prefix_addition(X, Y, Z):-
    Z is +(X, Y).
	
/*
    addition(2, 3, Ans).
    prefix_addition(2, 3, Ans).
*/