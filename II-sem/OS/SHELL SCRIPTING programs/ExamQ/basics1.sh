#! /bin/bash

echo "Enter student id : "
read id

echo "Enter student name"
read name

echo "Enter student 3 subjects name"
read sub1 sub2 sub3

echo "Enter student n best friends"
read -a friends



echo
echo
echo "Student id is : " $id
echo "Student name is : " $name
echo "Student subjects are as : " $sub1, $sub2, $sub3,
echo "Student first 4 best friends are as : " ${friends[0]} ,${friends[1]} ,${friends[2]]} ,${friends[3]}







