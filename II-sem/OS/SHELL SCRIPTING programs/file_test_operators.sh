#! /bin/bash

read -p 'Enter filename' file_name

if [ -e $file_name ]
then
echo "$file_name : File found."

      if [ -f $file_name ]
      then
      echo "$file_name : is regular file(type file)."
      else
      echo "$file_name : is not a regular file."
      fi

      if [ -b $file_name ]
      then
      echo "$file_name : is block special (Binary) file"
      else
      echo "$file_name : is not a block special file."
      fi

      if [ -c $file_name ]
      then
      echo "$file_name : is chatacter special file."
      else
      echo "$file_name : is not a character special file."
      fi

      if [ -s $file_name ]
      then
      echo "$file_name : is empty file."
      else
      echo "$file_name : is not an empty file"
      fi

      if [ -d $file_name ]
      then
      echo "$file_name : is a directory."
      else
      echo "$file_name : is not a directory."
      fi

      if [ -r $file_name ]
      then
      echo "$file_name : has read permission."
      else
      echo "$file_name : does't have read permission."
      fi

      if [ -w $file_name ]
      then
      echo "$file_name : has write permission."
      else
      echo "$file_name : does't have write permission."
      fi

      if [ -x $file_name ]
      then
      echo "$file_name : has execute permission."
      else
      echo "$file_name : does't have execute permission."
      fi
else
echo "$file_name : File not found."
fi
