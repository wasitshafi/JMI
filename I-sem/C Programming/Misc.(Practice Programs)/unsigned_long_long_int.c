//
//
//
//

#include<stdio.h>
#include<conio.h>

int main()
{
   unsigned long long int ulli;
   unsigned long int uli;
   long int li;
   
   ulli =186744073709551614;
   uli = -10000000000;
   li = 10000000000;
   
   printf("\nValue of ulli is :\t %ulld", ulli);
   printf("\nValue of uli is :\t %uld", uli);
   printf("\nValue of ulli is :\t %ld", li);
    
   printf("\n\n");
    
   printf("\nsizeof(ulli) %u", sizeof(ulli) );
   printf("\nsizeof(uli) %u", sizeof(uli) );
   printf("\nsizeof(li) is %u.", sizeof(li) );
      	
   return 0;
}
