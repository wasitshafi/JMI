#! /bin/bash

echo "Enter 5 names seperated by space"
read -a names #-a flags refer we are reading array

echo "Enter 5 ID seperated by space"
read -a id
echo  # for empty newline
echo
echo "Name = ${names[0]}, ${names[1]}, ${names[2]}, ${names[3]}, ${names[4]}"
echo "ID = ${id[0]}, ${id[1]}, ${id[2]}, ${id[3]}, ${id[4]}"
