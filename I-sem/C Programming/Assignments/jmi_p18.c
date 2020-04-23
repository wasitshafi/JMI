//
//jmi_p18.c on 20-08-18
//
//program to determine perfect no's
#include<stdio.h>

int compute(int num)
{
	int i, sum = 0;
	for( i = 1 ; i < num ; i++ )
	  if( num % i == 0 ) sum += i;
}

int main()
{
	int num, sum;
	do
	{
	   printf("\nEnter an integer : ");
	   scanf("%d", &num);
	   
	   if( num < 1 ) printf("\nInvalid input...! Try Again.");
    } while( num < 1 );
   
    sum = compute(num);

	if(sum == num)
	  printf("\n%d is a Perfect number.", num);
	else if(sum < num)
	  printf("\n%d is a Deficient number.", num);
	else
      printf("\n%d is a Abundant number.", num);

   return 0;
}