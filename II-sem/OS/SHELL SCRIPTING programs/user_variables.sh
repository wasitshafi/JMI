# /bin/bash

# this is comment line

p_name="user_variables.sh"       # p_name = user_variables.sh will be error ;;there must be no space on the left side and on the right side

echo "Program name is $p_name"
echo "Enter your id"
read id
echo "Enter your name"
read name
echo "Enter 3 subjects(Seperated by space)"
read subject1 subject2 subject3
read -p 'Enter your email-id' email   #it will read email-id inline not on next line
read -sp 'Enter password :' psswd    #it will silent the password
echo # new line as password will be silent so when pressing enter key it will not have effect of that.
# or use for inline read

echo -e "Enter phone no : \c"
read phno
echo  # as a newline
echo
echo "ID = $id"
echo "Name = $name"
echo "Email-ID = $email"
echo "Password = $psswd"
echo "Phone no = $phno"
echo "Subjects = " $subject1, $subject2, $subject3
