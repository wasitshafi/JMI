//
//jmi_p50.c
//
//program to rename a file

#include<stdio.h>

int main()
{
  char old_file_name[20], new_file_name[20];
  int status, i;

  printf("Enter file name you want to rename : ");
  scanf("%s", old_file_name);  

  printf("Enter new file name : ");
  scanf("%s", new_file_name);

  status = rename(old_file_name, new_file_name);  // return 0 if file/dir found
  if(!status)
   	 printf("\nFile name changed successfully");
  else
     perror("\nError:");
  
  return 0;
}