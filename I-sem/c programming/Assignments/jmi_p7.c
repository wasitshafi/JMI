//
//jmi_p10.c on 11-08-18
//
//program to determine the winner of sales contest

#include<stdio.h>
#include<limits.h>

int main()
{
	int n, sales[50], max = INT_MIN;
	char emp[30][15], i;
	
	printf("\nEnter no. of employee : ");
	scanf("%d", &n);
	
	if(n < 1 )
	{
		printf("\nInvalid input....");
		return -1;
	}
	else
	{
		for(i = 0 ; i < n ; i++)
		{
            char null; scanf("%c", &null); // clear buffer

			printf("\nEnter name of employee %d : ", i + 1);	     
		    scanf("%[^\n]", emp[i]);
	
			printf("Enter units sold         : ");
			scanf("%d", &sales[i]);
			
			if(sales[i] > max)
			  max = sales[i];
		}
	}

    for(i = 0 ; i < n ; i++)
    	if(sales[i] == max)
    		printf("\n%d) %s is winner(%d units sold).", i + 1, emp[i], max);		
	
	return 0;
}