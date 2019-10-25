#! /bin/bash

echo "All directory names :"
echo
for item in * # here '*' denotes that we want to iterate for all the thing in PWD. CTM: '*' is a Wild-Card character
do
  if [ -d $item ]
  then
  echo $item
  fi
done
echo
echo
echo "All file names :"
for item in *
do
  if [ -f $item ]
  then
  echo $item
  fi
done
