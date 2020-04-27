//variadic_args.c on 28-09-18
//
//programe to create variadic function
//

#include<stdio.h>
#include<stdarg.h>

int sum(int n,...)
{
	 int i, val, sum = 0;
	 
	 va_list args;
	 
	 va_start(args, n);
	 
	 for(i = 0 ; i < n ; i++)
	 {
	 	val = va_arg(args, int);
	 	sum += val;
	 } 
	
	 va_end(args);
	 return sum;
}

int main()
{	
   printf("\nsum(2, 2, 3) = %d", sum(2, 2, 3));
   printf("\nsum(4, 2, 3, 2, 3) = %d", sum(4, 2, 3, 2, 3));
   printf("\nsum(4, 2, 3, 6, 7) = %d", sum(4, 2, 3, 6, 7));
   printf("\nsum(7, 2, 3, 0, 0, 0, 0, 1) = %d", sum(7, 2, 3, 0, 0, 0, 0, 1));
   printf("\nsum(3, 5, 0, -3) = %d", sum(3, 5, 0, -3));
	
   return 0;	

}
