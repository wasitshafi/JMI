// jmi_p1.c on 27-04-2020
// Write a program that reads in two interger and determines and prints the first is multiple of second(Note : use only operators and functions).

#include<stdio.h>
int main()
{
    int n1, n2;

    printf("Enter integer 'n1' : ");
    scanf("%d", &n1);

    printf("Enter integer 'n2' : ");
    scanf("%d", &n2);

    if(n1 % n2 == 0)
        printf("\nYes, %d is multiple of %d.", n1, n2);
    else
        printf("\nNo, %d is not multiple of %d.", n1, n2);

    printf("\n");
    return 0;
}