//
//jmi_p22.c on 25-08-18
//
//
#include<stdio.h> 

int main()
{
   int n, i, j;
   
   printf("\nEnter no. of lines u:\t");
   scanf("%d", &n);
   
   for(i = 1 ; i <= n; i++)
   {
   	
	for(j = 1; j <= n - i; j++)
		printf(" ");

	for(j = 1; j < i ; j++)
		printf("%d", j);		

	for( ; j >= 1; --j)
		printf("%d", j);
		
   	printf("\n");
   	
   }

   return 0;
}


