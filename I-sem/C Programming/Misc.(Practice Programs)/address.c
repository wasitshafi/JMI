//
//
//
//
#include<stdio.h>

int main()
{
	int num = 10 , add = &num;
	
	printf("\n&num (%%d) = %d." , &num);
	printf("\n&num (%%x) = %x." , &num);
	printf("\n&num (%%p) = %p." , &num);

    return 0;
}
