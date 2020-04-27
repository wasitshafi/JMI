#include<stdio.h>

void sumton(int n)
{
	static int sum = 0;
	
	if(n == 0)
	{
		printf("sum = %d.", sum);
		return;
	}
	
	sum += n;
	
	sumton(--n);
}

int main()
{
	int n;
	
	printf("\nEnter value of n:\t");
	scanf("%d", &n);
	
	sumton(n);
	return 0;
}
