getmax(X, Y, X):- X >= Y.
getmax(X, Y, Y):- X < Y.

getmin(X, Y, X):- X =< Y.   % CTM: less than equal is '=<' not '<='
getmin(X, Y, Y):- X > Y.

/*
		Query
getmax(2,2, MX).
getmax(2,3, MX).
getmax(3,2, MX).

getmin(2,2, MN).
getmin(2,3, MN).
getmin(3,2, MN).
*/