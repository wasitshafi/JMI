#! /bin/bash

echo "enter string"
read string

len=${#string}      #stores the lenght of string
for((i=len-1;i>=0;i--))
do
reverseString="$reverseString${string:$i:1}"   #this is equal to reverseString = reverseString + string[i]
done

if [ "$string" == "$reverseString" ]
then
 echo "String is palindrome"
else
 echo "String is not palindrome"
fi

echo $reverse
