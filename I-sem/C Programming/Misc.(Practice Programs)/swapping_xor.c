//swapping_xor.c
//
//programe to swap variable using bitwise xor(^)
//
#include<stdio.h>
#include<conio.h>

int main()
{
	int x, y;
	
	printf("\nEnter value of x :\t");
	scanf("%d", &x);
	
	printf("\nEnter value of y:\t");
	scanf("%d", &y);
	
	printf("\n\nValues before swapping:")
	printf("\nX = %d\t\tY = %d", x, y);

	x = x ^ y;
	y = x ^ y;
	x = x ^ y;

	printf("\n\nValues after swapping:")
	printf("\nX = %d\t\tY = %d", x, y);
	
	}
