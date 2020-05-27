boy(james).
boy(alice).
boy(harry).
girl(mary).
girl(lisa).
pairs(X, Y):- boy(X), girl(Y).

is_positive_integers(0).
is_positive_integers(X):- is_positive_integers(Y), X is Y + 1.
/*
        Query(use ';' to print all the possibilities)
pairs(X,Y).

is_positive_integers(3).
is_positive_integers(0).
is_positive_integers(-2). % it will be infinite loop
*/