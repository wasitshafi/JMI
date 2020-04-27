//compute_npr_ncp.c on 10-10-18
//
//programe to compute permutations and combinations
//

#include<stdio.h>
#include<assert.h>

int fact(int num)
{
 int fact = 1;

  while (num)
   fact *= num--; 		

 return fact; 
}

int npr(int n, int r)
{ 
  return ( fact( n ) / fact( n - r ) );	
}

int ncr(int n, int r)
{ 
  return ( fact( n ) / (fact( r ) * fact( n - r ) ) );	
}

int main()
{
	 int n, r, result;
	 
	 printf("\nEnter value of n:\t");
	 scanf("%d", &n);
	 
	 printf("\nEnter value of r:\t");
	 scanf("%d", &r);
	  
	 assert( n >= r );
	  
 	 printf("\n\nP(%d, %d) is :\t%d", n, r, npr(n, r));
	 printf("\n\nC(%d, %d) is :\t%d", n, r, ncr(n, r));
	 
     return 0;
}
