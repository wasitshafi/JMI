#! /bin/bash

# pass 3 arguments while executing eg ./pass_args_to_bash.sh arg1 arg2 arg3
echo "The script name is by default stored in \$0 variable."  # Using \ to escape characters
echo "The passed arguments are then store in \$1, \$2,\$3,.... variables."
echo "\$# store the no. of arguments passed execution time."
echo "\$@ store the arguments passed execution time as an array."
echo
echo "Total no of arguments passed $#"
echo
echo "\$0 : $0"
echo "\$1 : $1"
echo "\$3 : $3"
echo "\$2 : $2"

#CTM $@ the arguments as an array so we can move those to user defined array
echo
arr=($@) # it does  not store program name
echo "\${arr[0]} = ${arr[0]}"
echo "\${arr[1]} = ${arr[1]}"
echo "\${arr[2]} = ${arr[2]}"
