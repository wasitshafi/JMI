//
//
//
//

#include<stdio.h>

int main()
{
	char str[100], ch;
	int i = 0;
	
	printf("\nEnter string :\t");
	
	while((ch = getchar()) != EOF)
	{
		str[i] = ch;
	   i++;
	}
	
	str[i] = '\0';
	
	printf("\nGiven string is :\t %s.", str);
    
    return 0;
}
