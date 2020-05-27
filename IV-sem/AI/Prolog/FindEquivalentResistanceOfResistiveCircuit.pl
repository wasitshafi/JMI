/*
                      R1
-------------------/\/\/\/\-------------------------
|                   30 Ohm                         |
|                                                  |
|                                                  |
|                                                  |
|             R2                       R3          |
-----------/\/\/\/\-----------------/\/\/\/\--------
|           10 Ohm            |      12 Ohm
|                             |
|                             |
|                             |
|                             |
|             R4              |
-----------/\/\/\/\------------
            40 Ohm

Ref : https://www.youtube.com/watch?v=1SHrI2lMK4A&list=PLWPirh4EWFpFLjsd3IUqymnCVBaz1Yagg&index=15
FindEquivalentResistanceOfResistiveCircuit
*/


series(X, Y, Z):- Z is (X + Y).
parallel(X, Y, Z):- Z is ((X * Y) / (X + Y)).


/*
        Query
parallel(40, 10, X),series(X, 12, Y), parallel(Y, 30, Z).

CTM : Answer is in Z variable
*/