//
//jmi_p2.c on 09-18-18
//
//program to compute sum, average, product, smallest & greatest among 3 given numbers

#include<stdio.h>

int min(int x, int y)
{
    if(x <= y) return x;
    return y; 
}

int max(int x, int y)
{
    if(x >= y) return x;
    return y; 
}

int main()
{
      int num1, num2, num3;
      int result;
      
      printf("Enter a number:\t");
      scanf("%d", &num1);
      printf("Enter a number:\t");
      scanf("%d", &num2);
      printf("Enter a number:\t");
      scanf("%d", &num3);

      printf("\nSum (%d + %d + %d)         = %d", num1, num2, num3, (num1 + num2 + num3));
      printf("\nProduct (%d * %d * %d)     = %d", num1, num2, num3, (num1 * num2 * num3));
      printf("\nAverage (%d + %d + %d) / 3 = %.2f", num1, num2, num3, (float)(num1 + num2 + num3) / 3);
      printf("\nSmallest (%d, %d  %d)      = %d", num1, num2, num3, min(num1, min(num2, num3)));     
      printf("\nLargest (%d, %d, %d)       = %d", num1, num2, num3, max(num1, max(num2, num3)));     
      return 0;
}