//
//
//
//
#include<stdio.h>

int main()
{
	int arr1[5] = { 1, 2, 3, 4, 5 };
	float arr2[5] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
	char arr3[5] ={'h', 'e', 'l', 'l', 'o'};
	char arr4[5] = "hello";

	printf("\nThere are %d elements in arr1.", sizeof(arr1) / sizeof(arr1[0]) );
	printf("\nThere are %d elements in arr2.", sizeof(arr2) / sizeof(arr2[0]) );
	printf("\nThere are %d elements in arr3.", sizeof(arr3) / sizeof(arr3[0]) );
	printf("\nThere are %d elements in arr4.", sizeof(arr4) / sizeof(arr4[0]) );
	
	return 0;
}
