owns(jhons, book(java, 'Cay Hostman')).
owns(mary, book(c, balagruswamy)).
owns(mary, book('Java', author('Cay', 'Horstman'))).

/*
 *            Query
owns(jhons, book(X, Y)).
owns(mary, book(_x, _y)).
owns(mary, book(X, author(Y,_))).
owns(mary, book(_x, author(_y,_z))).

     Anonymous Variable Queries
owns(mary,book(c,_)).
*/

