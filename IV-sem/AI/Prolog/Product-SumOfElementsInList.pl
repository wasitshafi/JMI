sum([], 0).
sum([H|T], N):-
    sum(T, Temp), N is Temp + H.

product([], 1).
product([H|T], N):-
    product(T, Temp), N is Temp * H. 

/*
        Query
sum([1, 2],N).
sum([1, 2, 3, 4, 5, 6, 7],N).

product([1, 2],N).
product([1, 2, 3, 4],N).
*/