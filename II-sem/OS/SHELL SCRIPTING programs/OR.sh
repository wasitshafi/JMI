#! /bin/bash

echo -e "Enter a positive integer less than 11 : \c"
read num
if [ $num -lt 0  -o  $num -gt 10 ]
then
  echo "Invalid input...!"
else
  echo "Test Condition Satisfied..."
 echo "num = $num"
fi
