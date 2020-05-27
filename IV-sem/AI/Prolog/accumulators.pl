% Its like Tail Recursion...
listlen(L, N):- lenacc(L, 0, N).    % Initialy the length is 0
lenacc([], A, A).                   % If we reached the empty list then we simply return the 'A'(third arg.) itself.
lenacc([H | T], A, N):- A1 is A + 1, lenacc(T, A1, N).

/*      Query

listlen([1,2,3,4,5,6],N).
*/