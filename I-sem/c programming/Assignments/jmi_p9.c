//
//jmi_p9.c on 09-08-18
//
//program to check whether a number is a palindrome or not.

#include<stdio.h>

int main()
{
    long int num, numCopy, reverse, rem;

    printf("Enter a number : ");
    scanf("%ld", &num);

    numCopy = num;
    reverse = 0;

    while(numCopy) // or while(temp != 0 )
    {
        rem = numCopy % 10;
        reverse = ( reverse * 10 ) + rem;
        numCopy = numCopy / 10;
    }

    if(num == reverse)
        printf("\n%ld is palindrome.", reverse);
    else
        printf("\n%ld is not palindrome.", reverse);

    return 0;
}
