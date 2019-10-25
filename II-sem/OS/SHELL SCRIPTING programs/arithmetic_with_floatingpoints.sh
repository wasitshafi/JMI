 #! /bin/bash

#CTM : for more info(Default Manual) on 'bc' command type 'man bc' on terminal

echo -e "Enter real value of num1 :\c"
read num1

echo -e "Enter real value of num2 :\c"
read num2
echo
echo "METHOD 1"
echo -e "2.5 + 3.4 | bc           => \c"
echo "2.5 + 3.4" | bc # This basically mean whatever is on left hand side of '|' will be treated as input for bc command

echo -e "scale = 4;9.40 / 4 | bc  => \c"
echo "scale = 4;9.40 / 4" | bc #scale  = 4 means 4 digits after decimal point

echo -e "scale=3;sqrt(2.5) | bc         => \c"
echo "scale=3;sqrt(2.5)" | bc


echo
echo "METHOD 2"
echo -e "\$num1 + \$num2 = \c"
echo "$num1 + $num2" | bc

echo -e "\$num1 - \$num2 = \c"
echo "$num1 - $num2" | bc

echo -e "\$num1 * \$num2 = \c"
echo "$num1 * $num2" | bc

echo -e "scale=4;\$num1 / \$num2 = \c"
echo "scale=4;$num1 / $num2" | bc

echo -e "\$num1 % \$num2 = \c"
echo "$num1 % $num2" | bc

echo -e "scale=3;sqrt(\$num1) | bc         => \c"
echo "scale=3;sqrt($num1)" | bc

echo -e "scale=3;\$num1 ^ \$num2 | bc       => \c"
echo "scale=4;$num1 ^ $num2" | bc
