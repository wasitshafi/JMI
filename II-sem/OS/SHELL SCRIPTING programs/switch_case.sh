#! /bin/bash

echo -e "Enter day 0 - 6 = \c"
read day

case $day in
   0 )
   echo "You choose Sunday.";;
   1 )
   echo "You choose Monday.";;
   2 )
   echo "You choose Tuesday.";;
   3 )
   echo "You choose Wednesday.";;
   4 )
   echo "You choose Thursday.";;
   5 )
   echo "You choose Friday.";;
   6 )
   echo "You choose Saturday.";;
   * )
   echo "Invalid Input....!";;
esac

echo -e "Enter day (sun, mon, tue, wed, thur, fri, sat) = \c"
read day

case $day in
  "sun" )
  echo "You chosose Sunday";;
  "mon" )
  echo "You chosose Monday ";;
  "tue" )
  echo "You chosose Tuesday ";;
  "wed" )
  echo "You chosose Wednesday";;
  "thru" )
  echo "You chosose Thursday";;
  "fri" )
  echo "You chosose Friday";;
  "sat" )
  echo "You chosose Saturday";;
  * )
  echo "Invalid Input....!";;
esac
