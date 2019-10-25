#! /bin/bash

read -p 'Enter no. of instance you want of gnome-terminal : ' n

i=0
while [ $i -lt $n ]
do

gnome-terminal &
((i++))
done
