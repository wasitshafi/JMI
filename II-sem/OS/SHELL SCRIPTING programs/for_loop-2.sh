#! /bin/bash

for cmd in ls pwd date
do
echo "Selected command : $cmd"
$cmd #executing command stored in variable 'cmd'
echo
echo
done
