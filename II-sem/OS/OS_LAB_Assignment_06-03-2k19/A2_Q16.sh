#! /bin/bash
xpowery()
{
   prod=1
   for (( i = 1 ; i <= $2 ; i++ ))
   do
   prod=$((prod * $1))
   done

   echo "Result($1^$2) = $prod"
}
echo -e "Enter base(x) : \c"
read x

echo -e "Enter power(y) : \c"
read y

xpowery $x $y
