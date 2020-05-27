% member() is a build in function in prolog
member(X, [X,_]).
member(X, [_|Y]):- member(X, Y).


/*
    Query(Press ';' To Continue Searching)
member(danish, [amir, danish, adil, khalid, imran, danish, huzaif]).
member(wasit, [amir, danish, adil, khalid, imran, danish, huzaif]).
*/