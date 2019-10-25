#! /bin/bash

read -p "Enter file name" filename

if [ -e  $filename ]
then
echo $filename "File exists"
else
echo $filename "File not exits"
fi

echo -e "Enter directory name : \c" 
read dirname

if [ -e $dirname ]
then
echo "Directory exists"
else
echo "Directory does't exists"
fi