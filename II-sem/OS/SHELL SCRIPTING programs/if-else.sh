#! /bin/bash


read -p 'Enter num1 : ' num1
read -p 'Enter num2 : ' num2

echo
if(( num1 > 0 ))
then
echo "$num1 is positive no."
else
echo "$num2 is negative no."
fi

#Nested if else
echo
if(( $num1 < $num2 )) #Must use 2 parenthesis
then
echo "$num1 is less than $num2"
elif (( $num2 < $num1 ))
then
echo "$num2 is less than $num1"
else
echo "Both are equal"
fi
