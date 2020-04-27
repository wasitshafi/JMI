//
//jmi_p22.c on 25-08-18
//
//
#include<stdio.h> 
void spaces(int n)
{
	int i;
	for(i = 0; i < n; i++)
		printf(" ");
}

void inc(int n)
{
	int i;
	for(i = 1; i <= n ; i++)
		printf("%d", i);
}

void dec(int n)
{
	int i;
	
	for(i = n; i >= 1; i--)
	{
		printf("%d", i);
	}
}
int main()
{
   int n, i, j;
   
   printf("\nEnter no. of lines u:\t");
   scanf("%d", &n);
   
   for(i = 1 ; i < n; i++)
   {
   	spaces(n - i);
   	inc(i);
    dec(i - 1);
   	printf("\n");
   }

   return 0;
}

