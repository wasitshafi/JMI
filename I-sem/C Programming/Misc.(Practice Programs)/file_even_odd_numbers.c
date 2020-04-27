//
//reading data from a file on 07-10-18
//
//program to  copy the content of one file to anothe file

#include<stdio.h>

int main()
{
	FILE *data_fptr, *even_fptr, *odd_fptr;
	
	char ch, input_file_name[20];
	int num;
	
	
	printf("\nEnter file name from you want to copy data:\t");
	scanf("%[^\n]", input_file_name);
	
	data_fptr = fopen(input_file_name, "r");
	
	if(!data_fptr)
	{
		perror("Error occurred :");
		return -1;
	}
	else
	{ 
	 even_fptr = fopen("even_data.txt","w");
	 odd_fptr = fopen("odd_data.txt","w");
	 
	 while((ch = fgetc( data_fptr ))  != EOF)
	 {	  
	  if(ch >= '0' && ch <= '9' )
	  {
	 	num = ch - '0';
		 
		if(num % 2 == 0)
		 fputc(ch, even_fptr), fputc(',', even_fptr);
		else
	     fputc(ch, odd_fptr), fputc(',', odd_fptr);
	  } 		
	 } 
	 printf("data copied successfully.\n");		  
	}
	return 0;
}
