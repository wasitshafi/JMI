//place_value_of_number.c
//
//programe to form a no from place value of a no.
//
#include<stdio.h>
#include<conio.h>
#include<assert.h>

int check_digit(int n)
{
	assert( n >= 0  && n <= 9);	
}

int main()
{
	int o, t, h, th, num;
	
	printf("\nEnter thousandths place digit:\t");
	scanf("%d", &th);
    check_digit(th);

	printf("\nEnter hundredths place digit:\t");
	scanf("%d", &h);
    check_digit(h);

	printf("\nEnter tenths place digit:\t");
	scanf("%d", &t);
    check_digit(t);
	
	printf("\nEnter ones place digit:\t");
	scanf("%d", &o);	
    check_digit(o);

    num = th * 1000 + h * 100 + t * 10 + o * 1;
    
	printf("\nNumber is :\t%d", num);
    
    return 0;
}
