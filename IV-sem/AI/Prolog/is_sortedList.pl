is_sorted([]).                % Empty List.
is_sorted([_]).               % Single Element.
is_sorted([X, Y | T]):-       % More Than One Element.
    X =< Y, is_sorted([Y|T]). % we are are not passing the head of list to the next recursion call, so to reduce it by first element.

/*
        Query
is_sorted([1, 2, 5, 9, 13, 16, 19]).
is_sorted([1, 2, 5, 9, 3, 16, 19]).
is_sorted([1, 2, 5, 5 ,12, 16, 19, 19]).
*/