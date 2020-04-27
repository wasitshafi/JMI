//
//jmi_p5-1.c on 09-08-18
//
//
#include <stdio.h>

int main()
{
	char name[30];

	int gross_sales, net_income;

	printf("Enter name of Employee : ");
	scanf("%[^\n]", name);

	printf("Enter gross sales of %s : ", name);
	scanf("%d", &gross_sales);

	net_income = 1000 + ( gross_sales * 10 / 100 );

	printf("\n*****************************");
	printf("\n*Name\t\tTotal Income*");
	printf("\n*****************************");

	printf("\n%s\t\t%d", name, net_income);

	return 0;
}