// summation of factorials.c
//
// programe to compute summation of factorial from 0 to n
//

#include<stdio.h>
#include<assert.h>

unsigned long int summmation_of_factorials(int n)
{
	int  count = 0 ;
    unsigned long int sum = 0, fact = 1;
 
 	if(n == 0 || n == 1)
 	  return 1;
	    	  
	else
 	{
 		while(count <= n)
 		{
	      sum += fact;
		  count ++;        // to compute 0! and to skip from beign multiplied by 0  	  
		  fact = fact * count;	 
		}	
   }
   return sum;
}

int main()
{
	int n;
	
	printf("\nEnter value of n (n >= 0):\t");
	scanf("%d", &n);

	assert(n >= 0);
	
	printf("\nSum of factorials from 0! to %d !  is :\t %ld.", n, summmation_of_factorials(n));
   
    return 0;
}
