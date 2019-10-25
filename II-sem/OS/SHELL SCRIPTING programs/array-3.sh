#! /bin/bash

string="The quick brown fox jumps over to the lazy dog. Tit for Tat."
echo "string = ${string[@]}" # print via index 0
echo "string = ${string[0]}"
echo "string = ${string[3]}" #this will not print anything the whole string is assigned to index 0 position only
                             #proof that every thing is limited to index 0 only
echo "string index is : ${!string[@]}"  #only 0 index is valid
echo "string lenght is : ${#string[@]}" #only one index to store string, so lenght is 1
