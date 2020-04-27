//
//
//
//

#include<stdio.h>
#include<assert.h>
#include<stdlib.h>

int main()
{
	int *ptr, i , n, mvalue, flag, k;
	
	printf("\nEnter no of elements :\t");
	scanf("%d", &n);
	
	ptr = (int *)malloc(n * sizeof(int));
	
	assert(ptr != NULL);
	
	
	printf("\nEnter %d elements:\n\n", n);
	
	for( i = 0 ; i  < n ; i++ )
	{	
		printf("\n%d > ", i + 1);
		scanf("%d", ptr + i );
	}

    system("cls");
	
	printf("Maximum and Minimum elements are as:\n");	
	
	flag = 1;
	
	for(k = 1 ; k <= 2 ; k++)
	{
		mvalue = *(ptr);
		
		for(i = 1 ; i < n ; i++)
		{
			if(flag * mvalue < flag * (*(ptr + i)) )
             mvalue = *(ptr + i);
		}
		
		printf("%d\t", mvalue);
		flag = -flag;
	}
	
	return 0;
}
