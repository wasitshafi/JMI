//
//
//
//

#include<stdio.h>

int main()
{
	int arr[10] = {00, 11, 22, 33, 44, 55, 66, 77, 88, 99};
	int *p_arr[10]; // arr is an array of 10 pointer of type int
	int *pp_arr[10];
	int i;
	
	for(i = 0 ; i < 10 ; i++)
	{
		p_arr[i] = &arr[i];
        pp_arr[i] = &p_arr[i];		
	}
	
	printf("\n\nElements & Address of arr[]:\n");
	for(i = 0 ; i < 10; i++)
	  printf("\n%d >val =  %d add = %d", i + 1, arr[i], &arr[i]);
	
	
	printf("\n\nElements & Address of *p_arr[]:\n");
	for(i = 0 ; i < 10; i++)
	  printf("\n%d >val =  %d add = %d", i + 1, p_arr[i] ,&p_arr[i]);
	
	
	printf("\n\nElements & Address of **pp_arr[]:\n");
	for(i = 0 ; i < 10; i++)
	  printf("\n%d >val =  %d add = %d", i+ 1, pp_arr[i] , &pp_arr[i]);
	
}
