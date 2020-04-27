//
//
//
//
#include<stdio.h>

int main()
{
	int *arr, smallest, greatest, i, n;
	
	
	printf("\nEnter no of elements :\t");
	scanf("%d", &n);
	
	arr =(int *) malloc(n * sizeof(int));
	
	for(i = 0 ; i < n ; i++)
	{
		printf("\nEnter element no %d : ", i + 1);
		scanf ("%d", arr  + i);
	}

    greatest = *(arr + 0);
    smallest = *(arr + 0);
    
	for(i = 1 ; i < n ; i++)
	{
		 if( *(arr + i) > greatest)
		 greatest = *(arr + i);
		 
		 if( *(arr + i) < smallest)
		 smallest = *(arr + i);	     
	}
	
	printf("\nSmallest elements is :\t%d", smallest);
	printf("\nGreatest elements is :\t%d", greatest);
	
	return 0;
}
