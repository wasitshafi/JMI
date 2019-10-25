#! /bin/bash

read -p 'Enter value of n : ' n

i=0
while [ $i -le $n ]
do

echo "$i"
i=$((i+1))

done
