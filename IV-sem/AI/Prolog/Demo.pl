/* Use cmd "swipl -s Demo.pl" or (use cmd "swipl" then "[Demo].") to load program, to exit use cmd "halt." */
% fact
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

/* Try the following queries
likes(dan, sally).          => does dan likes sally
likes(X, sally).            => Who likes sally
likes(dan, X).              => dan likes to whome(datesplz press tab to get names one by one)

dates(dan, sally).          => is dan dating sally
dates(jhon, brittney).      => is jhon datin brittney  

%don't cares
likes(Person, _).
likes(_, Person).
*/