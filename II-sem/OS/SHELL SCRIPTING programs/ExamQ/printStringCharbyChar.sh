#! /bin/bash

echo "Enter value of n :"
read n
x=0

while(( $x < $n ))
do
 echo $x
 x=$(( x + 1 )) 
done