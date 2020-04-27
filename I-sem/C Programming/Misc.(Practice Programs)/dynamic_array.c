//
//dynamicArray.c
//
//program to dynamic array in c
//
#include<stdio.h>  
#include<stdlib.h> 
int main()
{
    int **matrix;
    int rows, cols, i, j;

    printf("Enter no of rows : ");
    scanf("%d", &rows);

    printf("Enter no of cols : ");
    scanf("%d", &cols);
        
    matrix = (int **)malloc(rows * sizeof(int));

    for( i = 0 ; i < rows ; i++ )
       matrix[i] = (int *)malloc(cols * sizeof(int));
    
    printf("\nEnter %d elements : \n", rows * cols);
    for( i = 0 ; i < rows ; i++ )
     {
       for( j = 0 ; j < cols ; j++ )
       {
        printf("M[%d][%d]  << ", i + 1, j + 1);
        scanf("%d", &matrix[i][j]);
       }   
       printf("\n");
     }

    printf("Matrix is as follows : \n");
    for( i = 0 ; i < rows ; i++ )
      {
       for( j = 0 ; j < cols ;j++ )
           printf("%d  ", matrix[i][j]);
       printf("\n");
      }


      // free memory
      for(i = 0; i < rows; i++)
          free(matrix[i]); // first delete all the pointer stored in 'array of pointers to int'
     
      free(matrix); // at last delete the 'array of pointers'

    return 0;
}