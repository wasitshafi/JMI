#! /bin/bash

echo -e "Enter an even positive integer less than 11 : \c"
read num

rem=$(( $num % 2 ))

if [ $rem -eq 0  -a  $num -lt 11 -a $num -gt -1  ]
then
  echo "$num : is even & is less than 11"
else
  echo "Invalid input...!"
fi
