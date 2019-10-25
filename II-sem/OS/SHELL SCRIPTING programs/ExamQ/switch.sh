#! /bin/bash

echo -e " enter vowel : \c"
read v

case $v in 
"a" ) echo "a";;

"e" ) echo "e";;

"i" ) echo "i";;

"o" ) echo "o";;

"u" ) echo "u";;

* ) echo "not a vowel";;

esac