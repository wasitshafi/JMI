#include<stdio.h>
#include<stdlib.h>
int main()
{
    int totalnoofbooks = 0;
    int *arr;

 /*   if (totalnoofbooks == 0)
    {
     arr= (int *) malloc(sizeof(int));
    } 
    arr[0] = 11;

   totalnoofbooks++;

   printf("Array elements are as : ");
   for( int i = 0 ; i < totalnoofbooks ; i++)
   {
     printf("%d  ", arr[i]);
   }
   
/*   totalnoofbooks++;
   if(totalnoofbooks!= 1)
   {
    arr = (int *)realloc(arr, totalnoofbooks);
   }

   arr[1] = 22;*/

   arr = (int *)calloc(50,sizeof(int));
   printf("\n\nArray elements are as : ");
   for( int i = 0 ; i < 50 ; i++)
   {
     printf("%d  ", arr[i]);
   }
  
   return 0;
}
