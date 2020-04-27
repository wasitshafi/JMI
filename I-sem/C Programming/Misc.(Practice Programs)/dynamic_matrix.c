//dynamic_matrix.c
//
//programe to allocate run time memory for matrix
//

#include<stdio.h>
#include<stdlib.h>

int main()
{
	int *arr, rows, cols, i, j;
	
	printf("\nEnter no of rows :\t");
	scanf("%d", &rows);
	
	printf("\nEnter no of cols :\t");
	scanf("%d", &cols);
	
	arr = malloc(rows * cols * sizeof(int));
	
	for(i = 0 ; i < rows ; i++)
	{
		for(j = 0 ; j < cols ; j++)
		{
			printf("\nEnter element a[%d][%d] : ", i + 1, j + 1);
			scanf ("%d", (arr + i * cols + j));
		}
		printf("\n\n");
	}	
	for(i = 0 ;i < rows ; i++)
	{
		for(j = 0 ;j < cols ; j++)
		{
			printf("%d\t",*(arr + i * cols + j) );
	    }
		printf("\n");
	}
	return 0;
}
