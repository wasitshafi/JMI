//
//
//
//

#include<stdio.h>

void str_copy(char *str1, char *str2)
{
  while((*str2++ = *str1++) != '\0');	  
}

int main()
{
	char *ptr1, *ptr2;
	char str1[20], str2[20];

    printf("\nEnter string 1:\t");
	scanf("%[^\n]", str1);
     
    str_copy(str1,str2);
    
	printf("str1 = %s\nstr2 = %s", str1, str2);
	return 0;
}
