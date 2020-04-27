//
//
//
//
#include<stdio.h>
#include<conio.h>

void modify(int *arr, int n)
{
	int i;
	
	for(i = 0 ; i < 3 ; i++ )
		*( arr + i ) = *( arr + i ) + 5;
	
}

int main()
{
	
	int arr[10], i, n;
	
	printf("\nEnter no of elements:\t");
	scanf("%d", &n);
	
	for( i = 0 ; i < n ; i++)
	{
		printf("\n%d > ", i + 1);
		scanf("%d", &arr[i]);
	}
	
	system("cls");
	
	printf("\nValues before calling 'modify' function:\n");
	
	for(i = 0 ; i < 3 ; i++)
	 printf("\n%d > %d", i + 1, arr[i]);

    modify(arr, n);

	printf("\n\nValues after calling 'modify' function:\n");
 	
	for(i = 0 ; i < 3 ; i++)
	 printf("\n%d > %d", i + 1, arr[i]);

	return 0;		
}
