//jmi_p43.c on 01-10-18
//
//program to count no of white spaces in string
//
//https://stackoverflow.com/questions/3091524/what-are-carriage-return-linefeed-and-form-feed

#include<stdio.h>
#include<string.h>

int count_white_spaces(char *str)
{
	int i, white_spaces = 0;

	// In ASCII, whitespace characters are space ( ' ' ), tab ( '\t' ), carriage return ( '\r' ), newline ( '\n' ), vertical tab ( '\v' ) and formfeed ( '\f' ).
	for(i = 0 ; *(str + i) != '\0'; i++)
	{
		if(*(str + i) == 32) white_spaces++;        // space
		else if(*(str + i) == 9) white_spaces += 8; // tab
		else if(*(str + i) == 10) white_spaces++;   // new line
		else if(*(str + i) == 11) white_spaces++;   // vertical tab
		else if(*(str + i) == 12) white_spaces++;   // form feed tab
		else if(*(str + i) == 13) white_spaces++;   // carriage return

	}
	
	return white_spaces;
}

int main()
{
	char str[100];
	
	printf("Enter string : ");
    scanf("%[^\n]", str);
	
	printf("\nTotal white spaces in string is %d.", count_white_spaces(str));
    
    return 0;
}