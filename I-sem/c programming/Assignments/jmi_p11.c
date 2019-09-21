//
//jmi_p11.c on 10-08-18
//
//Program to compute a frequency of a specified digit in a no.

#include<stdio.h>

int main()
{
    long int num, numCopy;
    short int key, rem, count = 0;

    printf("Enter a number : ");
    scanf("%ld", &num);
    numCopy = num;
    do{
        printf("Enter a key digit : ");
        scanf("%d", &key);

        if( key < 0 || key > 9 )
          printf("\nInvalid Input...! Try Again.");

      }while( key < 0 || key > 9 );

    while(numCopy)
    {
      rem = numCopy % 10;
      if(rem == key) count++;
      numCopy = numCopy / 10;
    }

    printf("value of num is %d", num);

    
    if( count != 0 )
      printf("\n%hd occurs %hd times in %ld.\n", key, count, num);
    else
      printf("\n%hd does't occur in %ld.\n", key, num);
    return 0;
}