//
//
//
//
#include<stdio.h>

struct time{
	 int hh;
	 int mm;
	 int ss;
};

int main()
{
	struct time t1;
	
	printf("\nEnter hour(00- 23):\t");
	scanf("%d", &t1.hh);
	
	printf("\nEnter minute(1 - 60):\t");
	scanf("%d", &t1.mm);
	
	printf("\nEnter second(1 - 60):\t");
	scanf("%d", &t1.ss);
	
	
	if( t1.hh < 0 || t1.hh > 23 || t1.mm < 1 || t1.mm > 60 || t1.ss < 1 || t1.ss > 60 )
	{
		printf("Invalid input...!");
		return -1;
	}
	else
	
	printf("\n\nTime is %d:%d:%d", t1.hh,t1.mm,t1.ss);
}
