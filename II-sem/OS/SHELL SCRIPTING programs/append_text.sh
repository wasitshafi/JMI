#! /bin/bash

read -p 'Enter file name : ' file_name

if [ -e $file_name ]
then
  echo "$file_name : File found found."
   if [ -w $file_name ]
   then
    echo "Enter some text to append on file (press ctrl + d to quit)"
    cat >> $file_name
    echo "Text Appended."
   fi
else
  echo "$file_name : File not found."
fi
