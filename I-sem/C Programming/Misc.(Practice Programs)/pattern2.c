#include<stdio.h>

int main()
{
	int lines, i, j;
	
	printf("\nEnter no of line:\t");
	scanf("%d", &lines);
    
    for(i = lines; i >= 1; i--)
    {
    	for(j = 1; j <= i; j++)
    	{
    		printf("%d", i);
		}
	 printf("\n");
	}
 return 0;
}
