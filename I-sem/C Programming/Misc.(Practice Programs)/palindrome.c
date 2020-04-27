//
//
//
//

#include<stdio.h>
#include<string.h>

int main()
{
	int len, i, j, is_palindrome = 1;
	char str[100];
	
	printf("\nEnter string:\t");
	scanf("%[^\n]", str);
	
	len = strlen(str);
	
	for( i = 0 , j = len - 1 ; i < len / 2 ; i++, j-- )
	{
		if(str[i] != str[j] )
		{
		  is_palindrome = 0;
		   break;
		}
	}
	if( is_palindrome)
	 printf("\nString is palindrome.");
	else
	 printf("\nString is not palindrome.");
	return 0; 
}
