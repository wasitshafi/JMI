#! /bin/bash

function func1() {
  echo "hello from func1()"
}

read -p 'Enter your id : ' id
echo "Id = $id"
func1
readonly id ## now we can't change the value of variable
readonly -f func1

id=25 # this will not work & will generate a warning
function func1() {
  echo "creating new function with same name as previous name"
}
echo "Id = $id"
echo
echo "Default readonly variables are : "
readonly

echo
echo "readonly function are : "
readonly -f
