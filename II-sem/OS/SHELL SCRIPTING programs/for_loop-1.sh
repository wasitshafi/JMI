#! /bin/bash

read -p 'Enter value of n : ' n;

echo "Method 1 (for ((i = 0 ; i <= $n ;i++)))"
for ((i = 0 ; i <= $n ;i++))
do
echo "$i"
done

echo
echo "Method 2 ( for  i in {0..10} )"
for  i in {0..10} # {start..end..Inc}
do
  echo "$i"
done

echo
echo "Method 3 ( for  i in {10..0} )"
for  i in {10..0}
do
  echo "$i"
done



echo
echo "Method 4 ( for  i in {0..10..2} )" # {start..end..Inc}
for  i in {0..10..2}
do
  echo "$i"
done

echo
echo "Method 5 ( for  i in {10..0..-2} )"
for  i in {10..0..-2}
do
  echo "$i"
done


echo
echo "Method 6 ( for  i in 2 5 88 7 )"
for  i in 2 5 88 7
do
  echo "$i"
done
