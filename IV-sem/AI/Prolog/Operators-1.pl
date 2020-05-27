% http://rigaux.org/language-study/syntax-across-languages-per-language/Prolog.html

getaddition(X, Y, Ans):-
	Ans is X + Y.

getsubtraction(X, Y, Ans):-
	Ans is X - Y.

getmultiplication(X, Y, Ans):-
	Ans is X * Y.
	
getdivision(X, Y, Ans):-
	Ans is X / Y.

getintegerdivision(X, Y, Ans):-
	Ans is X // Y.

getmod(X, Y, Ans):-
	Ans is X mod Y.

getpow(X, Y, Ans):-
	Ans is X ** Y.

getmax(X, Y, Ans):-
	Ans is max(X, Y).

getabs(X, Ans):-
	Ans is abs(X).

getnegate(X, Ans):-
	Ans is -X.

getsqrt(X, Ans):-
	Ans is sqrt(X).
	
getsin(X, Ans):-
	Ans is sin(X).

getcos(X, Ans):-
	Ans is cos(X).
	
getleftshift(X, Y, Ans):-
	Ans is X << Y.

getrightshift(X, Y, Ans):-
	Ans is X >> Y.
	
add_three_and_double(X, Ans):-
	Ans is (X + 3) * 2.

% Queries 

/*
getaddition(3, 2, A).
getsubtraction(3, 2, A).
getmultiplication(3, 2, A).
getdivision(23, 3, A).
getintegerdivision(23, 3, A).
getmod(23, 3, A).
getpow(2, 10, A).
getpow(2, 10.5, A).
getmax(20, 10, A).
getabs(-10, A).
getnegate(10, A).
getnegate(-10, A).
getsqrt(16, A).
getsqrt(20, A).

getsin(90, A).
getcos(0, A).
getsin(180, A).
getcos(90, A).

getleftshift(1024, 1, A).
getrightshift(512, 1, A).

add_three_and_double(5, A).
  so on...
*/