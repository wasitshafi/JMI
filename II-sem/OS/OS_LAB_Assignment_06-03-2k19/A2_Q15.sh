#! /bin/bash
echo -e "Enter Employee name : \c"
read name

echo -e "Enter $name's Basic Salary : \c"
read basic_salary

if [ $basic_salary -lt 1500 ]
then
 hra=$((basic_salary * 10 / 100))
 da=$((basic_salary * 90 / 100))
 else
 hra=500
 da=$((basic_salary * 98 / 100))
fi

total_salary=$((basic_salary + hra + da))
echo
echo "Employee name : $name"
echo "Total Salary : $total_salary"
echo "Basic Salary : $basic_salary"
echo "HRA : $hra"
echo "DA : $da"
