//
//
//
//

#include<stdio.h>
#include<conio.h>

void concatinate_string(char *str1, char *str2, char *str3)
{
   int i , j;
   
   for(i = 0;*(str1 + i) != '\0'; i++)
   {
	 *(str3 + i) = *(str1 + i);
   }

   for(j = 0;*(str2 + j) != '\0'; j++, i++)
   {
	 *(str3 + i) = *(str2 + j);
   }
   
    *(str3 + i) = '\0';
}

int main()
{
	char str1[100], str2[100], str3[200];
		
	printf("\nEnter string 1:\t");
	gets(str1);
	
	printf("\nEnter string 2:\t");
	gets(str2);
	
	concatinate_string( &str1, &str2, &str3);
	
	printf("\nstring 1  is as follows:\t%s", str1);
	printf("\nstring 2  is as follows:\t%s", str2);
	printf("\nstring 1 + string 2  is as follows:\t%s", str3);
	
	return 0;
}

