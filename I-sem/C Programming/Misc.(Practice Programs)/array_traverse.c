//array_traverse.c
//
//programe to access array elements as i[arr] instead of arr[i]
//
#include<stdio.h>
#include<assert.h>

int main()
{
	int arr[100], n, i;
	
	printf("\nEnter no of elements:\t");
	scanf("%d", &n);
	
	assert(n > 0);
	
	printf("\n\nEnter %d elements.", n);
	
	for(i = 0 ; i < n ; i++)
	{
		printf("\n%d > ", i + 1);
		scanf("%d", &i[arr]); // arr[i] == i[arr]
	}

    printf("\nElements of array are as :\n\n");

	for(i = 0 ; i < n ; i++)
	{

	 printf("\n%d > %d.", i + 1, i[arr] );

    }
    return 0;
}
