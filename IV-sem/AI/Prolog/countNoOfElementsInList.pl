size([], 0).
size([_|T], N):-
    size(T, N1), N is N1 + 1. 

/*
        Query
size([11, 22, 33, 44, 55, 66, 77],N).
*/
