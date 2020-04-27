#include<stdio.h>

int main()
{
	int even_sum = 0, odd_sum = 0, i;
	
	for(i = 1 ; i <= 10 ; i++)
	{
		if( i % 2 == 0)
		even_sum += i;
		else
	    odd_sum += i;
	}
	
	printf("\nEven sum upto 50 is :%d", even_sum);
	printf("\nOdd sum upto 50 is :%d", odd_sum);
	
	getch();	
}
