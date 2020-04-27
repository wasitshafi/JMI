#include<stdio.h>

int main()
{
	
  unsigned int x = 9;
  int z =0;
  
  while(x)
  {
  	z++;
  	x = x &(x - 1);
  	
  }

  printf("\nz =%d", z);
 
  return 0;	
}
