//
//
//
//
#include<stdio.h>
#include<stdlib.h>

int main()
{
 
    int *arr = (int * )malloc(3*sizeof(int));

    for(int i = 0 ; i < 3 ; i++)
        arr[i] = i;
     
    printf("Array elements are as : ");
    for(int j = 0 ; j < 3 ; j++)
        printf("%d", arr[j]);
    
    return 0;
}