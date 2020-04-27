//
//
//
//


#include<stdio.h>
#include<string.h>

int main()
{
	char str[100], sub_str[20], i, j ,k,len;
	
	int flag = 0 ;

	printf("\nEnter string:\t");
	scanf("%[^\n]", str);
	
	fflush(stdin);
	
	printf("\nEnter sub string:\t");
	scanf("%[^\n]", sub_str);
   
     j = 0;
    for( i = 0 ; str[i]; i++)
    {
    	
    	if(str[i] == sub_str[j])
    	{
    		j++;
		}
		else if(str[i] == sub_str[0])
		{
			j = 1;
		}
		else
		j = 0;
		
		if(sub_str[j] == '\0')
		{
			flag = 1;
			break;
		}	
	}
	
	if(flag)
	{
		printf("\nSub string  found.");
	}
	else
	{
		printf("\nsub string not string.");
	}
	
	
}
