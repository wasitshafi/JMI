//disp_source_code.c
//
//programe to print source code on console

#include<stdio.h>
#include<conio.h>

int main()
{
   FILE *fp = fopen(__FILE__,"r");
   char c;
   
   do{
   	c = getc(fp);
   	putchar(c);	
   }while(c != EOF);  	
}
