//pascal_triangle.c
//
//program to printpascal series
//

#include<stdio.h>
#include<assert.h>

int main()
{
	int lines, i, j, coef;
	
	printf("\nEnter no of lines you want:\t");
	scanf("%d", &lines);
	
	for( i = 0 ; i < lines ; i++ )
	{
		for( j = 0 ; j <= lines - i ; j++ )
		printf(" ");
		
		for( j = 0 ; j <= i ; j++ )
		 {
		 	if( j == 0  )
		 	 coef = 1;
		 	 else
		 	 coef = (coef * ( i - j + 1)) / j;
		 	 
		   printf("%d ", coef);
		 }
		 
	    printf("\n");	
	} 
}
