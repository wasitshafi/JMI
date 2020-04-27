//
//
//
//
#include<stdio.h>

int main()
{
	char *arr_of_str[4];
    
	arr_of_str[0] ="The quick brown fox.";
    arr_of_str[1] ="Hello world.";
    arr_of_str[2] ="This is test line.";
    arr_of_str[3] ="C is low level language.";
 
	int i;
		    
    for(i = 0 ; i < 4 ; i++)
    {
    	printf("\nString %d is :\t%s", i + 1, arr_of_str[i]);
    }

}
