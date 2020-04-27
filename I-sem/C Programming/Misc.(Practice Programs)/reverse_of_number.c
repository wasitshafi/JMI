//
//
//
//
#include<stdio.h>
#include<conio.h>

int main()
{
	int num, sum;
		
	printf("\nEnter number:\t");
	scanf("%d", &num);
	
	while( num != 0 )
	{
	    sum = sum * 10 + num % 10; // we don't need to store remainder in a variable.
	    num = num / 10;
	}
	
	printf("\nReverse is %d.", sum);
	
    return 0;
}
