//
//jmi_p10.c on 09-08-18
//
//programe to compute decimal, octal & hexadecimal equivalent of a binary no.

#include<stdio.h>
#include<string.h>

long int convert_to_decimal(char *str)
{
 long int  len, sum = 0, rem, p_of_2 = 1, i;
 
 for(i = 0; str[i] != '\0' ; i++); //compute length of string
 
 i--;
 
 for( ; i >= 0 ; i--)
 {
    if(str[i] != '0' && str[i] != '1')
     {
    	
       printf("\nInvalid invalid input....!");
       return 1;
     }
     else if(str[i] == '1')
     {
	   sum = sum + p_of_2;
     }
 
   p_of_2 = p_of_2 * 2;

 }	
  return sum;
}

void convert_to_octal(char *str)
{

 long int  len, sum = 0, rem, p_of_2 = 1, i, count;
 
 for(i = 0; str[i] != '\0' ; i++); //compute length of string
 
 rem = i % 3;
 len = i;

 if(rem == 0)
 {
  p_of_2 = 1;
 
  for( i = 0, count = 1 ; i < len ; i++, count++)
  { 
    if(str[i] != '0' && str[i] != '1')
     {
    	
       printf("\nInvalid invalid input....!");
       return 1;
     }
     else if(count == 3)
     {
     	printf("%d", sum);
     	count = 1;
     	sum = 0;
     	p_of_2 = 1;
	 }
     else if(str[i] == '1')
     {
	   sum = sum + p_of_2;
     }
 
     p_of_2 = p_of_2 * 2;

 }
 
  	
  	
	
}
}

int convert_to_hexa(char *ch)
{
	
}

int main()
{
 char str[20];
 
 printf("\nEnter a binary number:\t");
 gets(str);

 printf("\n\nBinary : %s", str);
 printf("\nDecimal : %ld", convert_to_decimal(str));
 printf("\nOctal : ");
 convert_to_octal(str);
 
 
 //printf("\nHexa-decimal : %X \n", convert_to_hexa(str));
 


 return 0;
}
