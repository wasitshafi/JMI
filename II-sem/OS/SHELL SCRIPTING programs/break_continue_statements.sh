#! /bin/bash

echo -e "Enter value of n : \c"
read n

for ((i=0 ; i<=n ; i++))
do

echo "$i"

if [ $i -eq $((n/2)) ] # if half reached then break
then
 break
fi

done

echo
echo -e "Enter value of n : \c"
read n

for ((i=0 ; i<=n ; i++))
do

if [ $i -eq 2 -o  $i -eq 4 ] #this will skip the 2 and 4
then
 continue
fi
echo "$i"

done
