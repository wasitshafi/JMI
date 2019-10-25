#! /bin/bash

echo "Select your choice :"

select item in Pen Pencil Eraser Sharpner Glue-Stick
 do
  case $item in
    "Pen" )        echo "You selected Pen.";;
    "Pencil" )     echo "You selected Pencil.";;
    "Eraser" )     echo "You selected Eraser.";;
    "Sharpner" )   echo "You selected Sharpner.";;
    "Glue-Stick" ) echo "You selected Glue-stick.";;
    * )            echo "Invalid Input...!"
  esac

done
