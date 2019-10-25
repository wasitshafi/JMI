#! /bin/bash

echo -e"Enter a number"
read num

remainder=$(( num % 2 ))

if [ $remainder -eq 0 ]
then 
echo "number is even"
else
echo "number is odd"
fi



