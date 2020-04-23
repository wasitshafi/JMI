//
//jmi_p17.c on 20-08-18
//
//programe to find smallest number
#include<stdio.h>

int main()
{
	int num1, num2, num3, result;

	printf("Enter an number :\t");
	scanf("%d", &num1);

	printf("Enter an number :\t");
	scanf("%d", &num2);

	printf("Enter an number :\t");
	scanf("%d", &num3);

	result = num1 < num2 ? num1 < num3 ? num1 : num3 : num2 < num3 ? num2 : num3;

	printf("\n%d is smallest.", result);
	return 0;
}