//scan_octal_hexa_nos.co on 30-09-18
//
//programe to scan decimal,octal and hexa-decimal numbers
//

#include<stdio.h>

int main()
{
	int decimal, octal, hexa;
	
	printf("\nEnter a decimal no(num)):\t");
	scanf("%i", &decimal);
	
	printf("\nEnter a octal no(0num):\t");
	scanf("%i", &octal);
	
	printf("\nEnter a decimal no(0xnum):\t");
	scanf("%i", &hexa);
	
	printf("\n\n");
	
	printf("\nvalue of decimal(%%d) is:\t%d.", decimal);
	printf("\nvalue of octal(%%o & %%d) is:\t%o \t %d.", octal, octal);
	printf("\nvalue of hexa(%%x & %%d) is:\t%X \t %d.", hexa, hexa);
	
	return 0;
}
