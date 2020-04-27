//fib.2c
//
//sum of last 3 terms is next term.
//
#include<stdio.h>

int main()
{
	int t1 = 1, t2 = 2, t3 = 3, t, n = 3 ,i;
	
	printf("\n\nEnter no of terms ( n > 3 ):\t");
	scanf("%d", &n);
	
	assert(n > 3);
	
	printf("%d\t%d\t%d", t1, t2, t3);
	
	for(i = 3 ; i < n ; i++)
	{
		t = t1 + t2 + t3;

		printf("\t%d" ,t);		
        
        t1 = t2;
        t2 = t3;
        t3 = t;
	}
	
}
