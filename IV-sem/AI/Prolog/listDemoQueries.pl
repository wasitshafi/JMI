% CTM : A list may contain numbers, string, atoms, facts, emptylist, nestedlist etc.
% prolog tries to unify the list elements as [H|T]
[X|Y] = [1, wasitshafi, 3, likes(wasit, xyz), 5, hates(wasit, pqrst)].
/*
OUTPUT:
X = 1,
Y = [wasitshafi, 3, likes(wasit, xyz), 5, hates(wasit, pqrst)].
*/

[X, Y| Z] = [1, 2, 3, 4, 5].
/*
OUTPUT:
X = 1,
Y = 2,
Z = [3, 4, 5].
*/

[X, Y, Z | W] = [1, [AMIR, 3, 4], [], 5, 6, 7, 8].
/*
OUTPUT:
X = 1,
Y = [2, 3, 4],
Z = [],
W = [5, 6, 7, 8].
*/
% It doesn't matter from where you put thing as LHS = RHS == RHS = LHS
[1, [AMIR, 3, 4], [], 5, 6, 7, 8] = [X, Y, Z | W].
[1, Y, [] | W] = [X, [amir, 3, 4], Z, 5, 6, hates(wasit, qwerty), 8, max(10)].


/*OUTPUT(2):
Y = [amir, 3, 4],
W = [5, 6, hates(wasit, qwerty), 8, max(10)],
X = 1,
Z = [].
*/
% we can also include don't care in list
[_, Y, Z |W] = [11, likes(wasit, xyz), asif, hates(wasit, pqrst), 1, 2, [11,22,33, friends(wasit, qwerty)], 3].
/*
OUTPUT :
Y = likes(wasit, xyz),
Z = asif,
W = [hates(wasit, pqrst), 1, 2, [11, 22, 33, friends(wasit, qwerty)], 3].
*/

% we can use don't care with tail of list as well
[_, _, [_ | X] | _ ] = [[], dead(2), [2, [b,c]], [], z,[2,[b,c]]]
/*
OUTPUT:
X = [[b, c]]
*/

%Member() it prints true if elements belongs in either in head or tails of the list

member(1, [2, 3, 4, 5, [], 6]).
 % false

member(4, [2, 3, 4, 5, [], 6]).
% true

member(1, [2, 3, 4, 5, [1], 6]).
% false

member([1], [2, 3, 4, 5, [1], 6]).
% true

member([1], [2, 3, 4, 5, [1, 22, 33, 44, 55], 6]).
% true

member(X, [1, 2, 3, 4, 5, 6]), Y is X * X.
member(X, [1, 2, 3, 4, 5, 6]), Y is X * X, Y > 5.
/*
this will not print all the number, but only the first one , where it found the first true condition, press ';' after one output to print next output that satisfies the condition and so on
OUTPUT:
X = 3,
Y = 9
*/