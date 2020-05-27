vertical_line(seg(point(X,_),point(X,_))).
horizontal_line(seg(point(_,Y),point(_,Y))).
oblique_line(seg(point(X1,Y1),point(X2,Y2))):-
	X1 =\= X2,
	Y1 =\= Y2.

/*
		Queries
vertical_line(seg(point(10, 20),point(10, 50))).		
vertical_line(seg(point(10, 20),point(30, 50))).

horizontal_line(seg(point(45, 20),point(45, 20))).
horizontal_line(seg(point(45, 20),point(45, 50))).

oblique_line(seg(point(10, 20),point(20 , 30))).
oblique_line(seg(point(10, 20),point(10 , 20))).
*/