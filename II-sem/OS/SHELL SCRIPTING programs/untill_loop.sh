#! /bin/bash

read -p 'Enter value of n : ' n

i=0
until [ $i -gt $n ] #works only if condition is false
do
echo "$i"
((++i))
done
