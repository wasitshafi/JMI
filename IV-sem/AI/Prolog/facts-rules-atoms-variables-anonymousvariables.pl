male(wasit).
male(ashu).
male(rahul).

likes(wasit, ashu).
likes(ashu, wasit).
likes('Nazir', rahul).
likes('18Shaba', zain).
likes('Mohd Zahid', hamid).

friends(_x, _y):- likes(_x, _y), likes(_y, _x).

/*
Variable Query this will print all the name who are friends of wasit
 friends(wasit, _x). or friends(wasit, X).
*/

/*
Anonymous Variable Query, this will just print true if there exists any
rule, facts in knowledgebase otherwise false.
 friends(wasit, _).
*/























