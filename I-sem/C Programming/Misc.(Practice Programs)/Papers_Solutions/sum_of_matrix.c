//
//
//
//
#include<stdio.h>
#include<conio.h>

void get_matrix(int rows, int cols, int mat[rows][cols] )
{
	int i, j;

	for(i = 0; i < rows; i++)     
	{
	   for(j = 0 ; j < cols ;j++)
	   {
		 printf("\nEnter an element [%d][%d]:\t", i + 1, j + 1);
		 scanf("%d", &mat[i][j]);	
	   }
	 printf("\n\n");
	}
	
}

void put_matrix(int rows, int cols, int mat[rows][cols])
{
	int i, j;

	for(i = 0; i < rows; i++)    
	{
	   for(j = 0 ; j < cols ;j++)
	   {
		 printf("%d\t",mat[i][j]);	
	   }
	 printf("\n\n");
	}
}

void sum_of_matrix(int rows, int cols, int mat1[rows][cols], int mat2[rows][cols], int mat3[rows][cols])
{
	int i, j;
	
	for(i = 0; i < rows; i++)
	{
	   for(j = 0 ; j < cols ;j++)
	   {
		 mat3[i][j] = mat1[i][j] + mat2[i][j];
	   }
	}
}

int main()
{
	int rows, cols;
	int i , j;
	int mat1[100][100],mat2[100][100],mat3[100][100];
	
	printf("\nEnter no of rows:\t");
	scanf("%d", &rows);
	
	printf("\nEnter no of cols:\t");
	scanf("%d", &cols);
	printf("\n\nEnter matrix A:\n\n");
    get_matrix(rows,cols, mat1);
	
	printf("\n\nEnter matrix B:\n\n");
    get_matrix(rows,cols, mat2);
        
	sum_of_matrix(rows,cols,mat1,mat2,mat3);
	
	printf("\nMatrix A is as follows:\n\n");
	put_matrix(rows,cols, mat1);


	printf("\nMatrix B is as follows:\n\n");
    put_matrix(rows,cols,mat2);

	printf("\nMatrix A + Matrix B is as follows:\n\n");

    put_matrix(rows,cols, mat3);
    
	return 0;
}
