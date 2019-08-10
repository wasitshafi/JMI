#include<stdio.h>
#include<stdlib.h>

int main()
{
    int arr[5];

    // There is no bound checking in c so we can access memory that are out of bound

    arr[5] = 5;  // overruns
    arr[6] = 5;
/*    arr[7] = 5;
    arr[8] = 8;
/*
    arr[-1] = -1;  // underruns
    arr[-2] = -2;
    arr[-3] = -3;
    arr[-4] = -4;
*/
    printf("Array elements are as : ");
    for(int i = 0 ; i < 4 ; i++)
        printf("%d ", arr[i]);

    return 0;
}