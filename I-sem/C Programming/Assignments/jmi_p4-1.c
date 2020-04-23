//
//jmi_p4-1.c on 09-08-18
//
//program to print decimal,octal & hexa-decdimal equiv. of a character.

#include<stdio.h>

int main()
{
    char ch;
    int num;

    do{
        printf("Enter a character ( 0 - 9 ) : ");
        scanf("%c", &ch);

        if( ch < 48 || ch > 57 ) printf("Invalid input (NaN)...! Try again.\n");
      }while( ch < 48 || ch > 57 );

    num = ch - '0';  // or num = ch - '48'

    printf("\nDecimal      = %d", num);
    printf("\nOctal        = %o", num);
    printf("\nHexa-deciaml = %x", num);  // use %X to print in upper case

    return 0;
}