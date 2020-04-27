//
//
//
//
#include<stdio.h>
#include<limits.h>

int main()
{
	unsigned int num;
	
	printf("\nEnter a number [ 0 <= N <= %u ]:\t", UINT_MAX);
	scanf("%d", &num);
	
	if(num & 1)                     // bitwise and
		printf("\n%d is odd.", num);
	else
        printf("\n%d is even.", num);
        
	return 0;
}
