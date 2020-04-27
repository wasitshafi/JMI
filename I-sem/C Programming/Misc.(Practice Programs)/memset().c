//
//memset().c
//
//program to show how to initilize dynamic memory using memset().
//
//for more info read : https://www.geeksforgeeks.org/memset-c-example/
#include<stdio.h>
#include<stdlib.h>
#include<string.h> // for memset();

int main()
{
    int *arr, n, i;

    printf("\nEnter no of elements you want : ");
    scanf("%d", &n);
    
    arr = (int *)malloc(n * sizeof(int));

    printf("Value before memset(): ");
    for(i = 0 ; i < n ; i++)
        printf("%d  ", arr[i]);

    memset(arr + 2, 0, n * sizeof(int));    // using memset(starting_address, value, no_of_bytes);
    printf("\nValue After memset(): ");
    for(i = 0 ; i < n ; i++)
        printf("%d  ", arr[i]);

    printf("\n\n");
    for(i = 0 ; i < n ; i++)
    {
        printf("arr[%d] <<: ", i + 1);
        scanf("%d", &arr[i]);
    }

    printf("\nElements are as follows : ");
    for( i = 0 ; i < n ; i++)
        printf("%d ", arr[i]);

    return 0;
}