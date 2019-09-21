//
//jmi_p19.c on 20-08-18
//
//program to print prime no's upto n

#include<stdio.h>

void check_prime(int num)
{
	int i;
	int is_prime = 1;
	
    for( i = 2 ; i * i <= num ; i++) // or for(  ; i <= sqrt(num) ; )
    {
	   if(num % i == 0)
   	   {
    	   is_prime = 0;
   		   break;
   	   }	
    }
   
    if(is_prime)
       printf("%d  ", num);
}

int main()
{
	int num, i;
	
	printf("\nEnter a integer greater that 1:\t");
	scanf("%d", &num);
	
	if(num <= 1 )
	{
		printf("\nInvalid input....!\n");
	    return -1;    
	}

	printf("\nPrime no's upto %d are as : ", num);
	for(i = 2; i <= num ; i++)
	    check_prime(i);
     return 0;
}
