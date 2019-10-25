#! /bin/bash

#Method 1 to define function
function func1()
{
  local name=$1 # if we don't write local before variable name then if will have effect on global
                 # variables named same as local variable 'name'
  echo "Hello from func1()"
  echo "Argument1 = $name"
}
name="john" # by default variables are declared as global
echo "value ( BEFORE FUNCTION CALL ) of name = $name"
func1 "james"
echo "value ( AFTER FUNCTION CALL ) of name = $name"
