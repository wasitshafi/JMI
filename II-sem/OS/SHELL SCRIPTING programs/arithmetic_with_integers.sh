#! /bin/bash

#CTM : By default scripting don't support decimal/floating point numbers
echo -e "Enter Integer value of num1 :\c"
read num1

echo -e "Enter Integer value of num2 :\c"
read num2

echo
echo "Wrong way to perform arithmetic in shell scripting"
echo "\$num1 + \$num2 = $num1 + $num2"         # we can't perform arithmetic like this
echo
echo "METHOD 1"
echo "\$(( num1 + num2 )) = $(( num1+num2 ))"  #don't forget space before & after the expression
echo "\$(( num1 - num2 )) = $(( num1-num2 ))"  #i.e their must be space  after'(' and before ')'
echo "\$(( num1 * num2 )) = $(( num1 * num2 ))"
echo "\$(( num1 / num2 )) = $(( num1 / num2 ))"
echo "\$(( num1 % num2 )) = $(( num1 % num2 ))"
# or use othe format
echo
echo "METHOD 2"
echo "\$(expr $num1 + $num2) = $(expr $num1 + $num2)"
echo "\$(expr $num1 - $num2) = $(expr $num1 - $num2)"
echo "\$(expr $num1 \* $num2)= $(expr $num1 \* $num2)" # don't use $(expr $num1 * $num2)
echo "\$(expr $num1 / $num2) = $(expr $num1 / $num2)"
echo "\$(expr $num1 % $num2) = $(expr $num1 % $num2)"
