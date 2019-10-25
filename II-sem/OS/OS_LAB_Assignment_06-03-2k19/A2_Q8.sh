#! /bin/bash

read -p 'Enter a number : ' n

copy_num=n;
prod=1
for (( ; copy_num >=1 ; copy_num-- ))
do
  prod=$((prod * copy_num))

done
echo "Factorial of $num  is : $prod"
