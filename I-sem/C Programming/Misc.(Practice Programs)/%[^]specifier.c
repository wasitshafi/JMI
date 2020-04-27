//
//%[^]specifier.c
//
//programe to explain %[^] specifier in c

#include<stdio.h>


int main()
{

	char str[40];
	
	printf("\nEnter a string :\t");
	
	scanf("%[^\t\nPpRs]", str); // it will scan the string untill '\n' or '\t' or 'P' or 'p' or 'R' or 's' occurs in string
	
	printf("\n\nGiven string is :\t%s", str);
	
	return 0;
	
}
