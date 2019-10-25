#! /bin/bash

echo -e "Enter a characters = \c"
read char

case $char in
   [a-z] )
   echo "You entered lower case character.";;
   [A-Z] )
   echo "You entered upper case character.";;
   [0-9] )
   echo "You entered digits";;
   ? )
   echo "You entered special character";;
   * )
   echo "You entered unknown characters";;
esac
