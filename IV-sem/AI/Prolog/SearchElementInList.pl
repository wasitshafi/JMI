member(X,[X|_]).
member(X,[_|T]):-
    member(X,T).

/*          Query
member(4, [11, 22, 33, 44, 55, 66, 4, 3, 2, 1]).
*/