% weather(city, season, temp)

weather(delhi, summer, hot).
weather(kashmir, summer, warm).
weather(kolkata, summer, hot).
weather(delhi, winter, warm).
weather(kashmir, winter, cold).

warmerThan(X, Y):-
weather(X, summer, hot),
weather(Y, summer, warm),
write(X), write(' is warmer than '), write(Y), nl.

%code organizing
% the same is available on roomno03 and also on roomno04
course(
    cse101,
    day(mon, wed),
    time(11, 12),
    prof(khalid, nazir),
    roomno03
).

course(
     cse101,
    day(mon, wed),
    time(11, 12),
    prof(khalid, nazir),
    roomno04
).
