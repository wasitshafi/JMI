#! /bin/bash

read -p 'Enter file name (HINT: You can also enter name like /dir1/newfile.c): ' file_name
echo
echo "Reading file data using method 1"
while read line #reads line by line from file whose name is stored in file_name variable.
do
echo $line
done < $file_name


echo
echo
echo "Reading file data using method 2"
cat $file_name | while read all_lines
do
echo "$all_lines"
done


echo
echo
echo "Reading file data using method 3"
while IFS=' ' read -r lines
do
  echo "$lines"
done < $file_name
