//
//
//
//
#include<stdio.h>

int add(int a, int b, int c)
{
  return (a + b + c);
}

int main()
{
	int a, b, c, sum, sum2, sum3;
	
	int (*ptr1)(int, int, int) = add;   // ptr1 = add
	int (*ptr2)(int, int, int) = &add;  // ptr2 = &add
	                                    // both are the same thing
		
	printf("\nEnter value of a, b & c :\t");
	scanf("%d%d%d", &a, &b, &c);
	
	sum =  add(a, b, c);
	sum2 = ptr1(a, b, c);
	sum3 = ptr2(a, b, c);

    printf("\nAddress of sum(&sum) is : %p.", &add);
    printf("\nAddress of sum is(ptr1) : %p.", ptr1);
    printf("\nAddress of sum is(ptr2) : %p.", ptr2);

	printf("\n%d + %d + %d is :\t %d.", a, b, c, sum); 
	printf("\n%d + %d + %d is :\t %d.", a, b, c, sum2); 
	printf("\n%d + %d + %d is :\t %d.", a, b, c, sum3); 

    
	return 0;
}
