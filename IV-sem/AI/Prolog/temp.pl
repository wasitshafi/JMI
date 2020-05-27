male(dan).
male(bob).
male(jhon).
female(sally).
female(brittney).
female(zia).

likes(dan, sally). % each fact must end with period
likes(dan, bob).
likes(dan, zia).
likes(jhon, brittney).
likes(sally, dan).

dating(X, Y) :-  % X is dating to Y if and only if X likes Y and Y likes X as well
likes(X, Y),
likes(Y, X).

friends(X, Y) :- % X is of Y if and only if X likes Y or  Y likes X
likes(X, Y);
likes(Y, X).

male(dan).
male(bob).
male(jhon).
female(sally).
female(brittney).
female(zia).

likes(dan, sally). % each fact must end with period
likes(dan, bob).
likes(dan, zia).
likes(jhon, brittney).
likes(sally, dan).

dating(X, Y) :-  % X is dating to Y if and only if X likes Y and Y likes X as well
likes(X, Y),
likes(Y, X).

%The Scope of variables is only upto dot(.) of the rule
friends(X, Y) :- % X is of Y if and only if X likes Y or  Y likes X
likes(X, Y);
likes(Y, X).