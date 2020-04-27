//
//
//
//
#include<stdio.h>
#include<conio.h>

int main()
{
	int rows, cols;
	int i , j;
	int mat1[100][100];
	int sum_rows[10] ,sum_cols[10] , cindex = 0;
	
	printf("\nEnter no of rows:\t");
	scanf("%d", &rows);
	
	printf("\nEnter no of cols:\t");
	scanf("%d", &cols);
	
	for(i = 0; i < cols; i++)  
	{
		sum_cols[i] = 0;
	}
	
	for(i = 0; i < rows; i++)     // scanning values
	{
	 sum_rows[i] = 0;
	
	   for(j = 0 ; j < cols ;j++)
	   {
		 printf("\nEnter an element [%d][%d]:\t", i + 1, j + 1);
		 scanf("%d", &mat1[i][j]);	
		 sum_rows[i] += mat1[i][j]; // sum of rows
	 	 sum_cols[j] += mat1[i][j]; // sum of columns
	   }
	 printf("\n\n");
	}
	
	for(i = 0; i < rows; i++) // printing values
	{
	  for(j = 0; j < cols; j++)
	  {
	    printf("%4d\t", mat1[i][j]);
      }
  	 printf("[%4d]\n\n", sum_rows[i]); // printing sum of rows
	}
	
	for(i = 0; i < cols; i++) // printing sum of columns
	{
	 printf("[%d]\t", sum_cols[i]);
	}
	
	return 0;
}
