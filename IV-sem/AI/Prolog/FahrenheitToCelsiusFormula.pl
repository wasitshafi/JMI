fahrenheit_temp(delhi, 98).
fahrenheit_temp(mumbai, 105).
fahrenheit_temp(kolkata, 120).

celcius_temperature(State, Celcius) :-
fahrenheit_temp(State, Fahrenhiet),
Celcius is  (Fahrenhiet - 32) * ( 5 / 9).

/*
        Formula
(32°F − 32) × 5/9 = 0°C

        Queries
celcius_temperature(delhi, F).
celcius_temperature(mumbai, F).
celcius_temperature(kolkata, F).
*/