//summations_of_x^0_to_x^n.c on 02-10-18
//
//programe to compute summations from x^0 to x^n
//

#include<stdio.h>
#include<assert.h>

unsigned long int summations_of_x_power_0_to_x_power_n(int x, int y)
{
   unsigned int sum = 0, term;
   int count;
   sum = 1;  // as to deal with x ^ 0 = 1 is true for all x;
   term = 1;
    
   for(count = 1 ; count <= y ; count++)
   {
   	term = x * term;
   	sum += term;
   } 
	
   return sum;
}

int main()
{
	int x, n;
	
	printf("\nEnter value of x:\t");
	scanf("%d", &x);
	
	printf("\nEnter value of n:\t");
	scanf("%d", &n);
	
	printf("\nSummation of %d^0 to %d^%d is:\t%ld", x, x, n, summations_of_x_power_0_to_x_power_n(x, n));	

    return 0;
}
