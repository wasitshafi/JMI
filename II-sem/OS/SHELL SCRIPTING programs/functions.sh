#! /bin/bash

#Method 1 to define function
function func1()
{
  echo "Hello from func1()"
}
func1()
{
  echo "Hello from new func1()"
}
func2()
{
  echo "Hello from func2()"

}
func3()
{
  echo "Hello from func3()"
  echo "  Total no of Arguments passed is  [$#] "
  echo "  Arguments passed is  [$@] "
  echo "    Argument1 : $1"  #argument passed to function are stored in default variables
  echo "    Argument2 : $2"
  echo "    Argument3 : $3"

}
quit_fun()
{
   exit
}


func1
func2
func3 hello world 125 # passing arguments

func1() # CMT : we can overload functions as well. i.e. we can rewrite the same function again & again
{
  echo "Hello from new func1()"
}

func1
quit_fun
echo "This will not print on gnome terminal."
