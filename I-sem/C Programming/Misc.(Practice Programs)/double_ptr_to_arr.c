//
//
//
//

#include<stdio.h>
#include<assert.h>
#include<stdlib.h>

int main()
{
	
	int *arr1, *arr2, *arr3;
	int no_of_elements_in_each_arr[3] ,i , j;
	int no_of_arrays = 3;
        
        
	int *arr_ptr[no_of_arrays];
	
	
//	int **ptr_to_ptr_to_int = &arr_ptr;
	 	
	printf("\nEnter no of elements for array 1 :");
	scanf("%d", &no_of_elements_in_each_arr[0]);
	
	printf("\nEnter no of elements for array 2 :");
	scanf("%d", &no_of_elements_in_each_arr[1]);
	
	printf("\nEnter no of elements for array 3 :");
	scanf("%d", &no_of_elements_in_each_arr[2]);
	
	arr1 = ( int  * ) malloc ( no_of_elements_in_each_arr[0] * sizeof(int));
	arr2 = ( int  * ) malloc ( no_of_elements_in_each_arr[1] * sizeof(int));
	arr3 = ( int  * ) malloc ( no_of_elements_in_each_arr[2] * sizeof(int));
	
	arr_ptr[0] = arr1; 
	arr_ptr[1] = arr2;
	arr_ptr[2] = arr3;
	
	
	system("cls");
	
	printf("\nEnter %d elements for array 1", no_of_elements_in_each_arr[0]);

	for( i = 0 ; i < no_of_elements_in_each_arr[0] ; i++)
	{
		printf("\n%d > ", i + 1);
		scanf("%d", arr1 + i );
	}


	printf("\nEnter %d elements for array 2", no_of_elements_in_each_arr[1]);

	for( i = 0 ; i < no_of_elements_in_each_arr[1] ; i++)
	{
		printf("\n%d > ", i + 1);
		scanf("%d", arr2 + i );
	}

	printf("\nEnter %d elements for array 3", no_of_elements_in_each_arr[2]);

	for( i = 0 ; i < no_of_elements_in_each_arr[2] ; i++)
	{
		printf("\n%d > ",  i + 1);
		scanf("%d", ( arr3 + i ) );
	}
	
   for( i = 0 ; i < 3 ; i++ )
   {
     printf("\n\n\nArray no %d is as follows:\n\n", i + 1 );
     
   	 for( j = 0 ; j  < no_of_elements_in_each_arr[i] ; j++ )
     	printf("\n%d > %d", j + 1 , * ( arr_ptr[i] + j) );    
   }
	return 0;
}
