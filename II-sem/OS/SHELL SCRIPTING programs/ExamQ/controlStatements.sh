#! /bin/bash

echo "Enter  three number "
read n1 n2  n3

result=0

if(($n1 > $n2))
then
    if(($n1 > $n3))
    then
    result = n1
    else
    result = n2
    fi
else
   if(($n2 > $n3))
    then
    result = n1
    else
    result = n2
fi
 



echo $n2 is greater then $n1