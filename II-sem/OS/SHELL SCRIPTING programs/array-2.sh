#! /bin/bash

os=('Ubuntu' 'Kali-linux' 'Windows' 'Android' 'Mac')

echo "Array elements are as : "
echo "${os[@]}"
echo "Array elements indexes are as : "
echo "${!os[@]}"
echo "Total no of elements are as : ${#os[@]}"
echo
echo
os[1]='Elementary'
os[10]='Red-Hat'
os[15]='Fedora'
echo "Entered 3 new elements at indexes 1, 10, 15."
echo
echo "Array elements are as : "
echo "${os[@]}"
echo "Array elements indexes are as : "
echo "${!os[@]}"
echo "Total no of elements are as : ${#os[@]}"
echo
echo -e "Enter element index to delete from array : \c"
read indexe
unset os[$((index))] # directly unset os[3], unset os[5].....
echo
echo
echo "Array elements are as : "
echo "${os[@]}"
echo
echo "Array elements indexes are as : "
echo "${!os[@]}"
echo
echo "Total no of elements are as : ${#os[@]}"
echo
