#include<stdio.h>

int main()
{
    static float table[2][3] = {{1.1, 1.2, 1.3}, {2.1, 2.2, 2.3}};
	
	static char *color[6] ={"red", "green", "blue", "white", "black", "yellow"};
	
	char *month[3] = {"jmi", "iit", "du"};
	
	printf("\nValue of *(*(talbe + 1 )) = %f", *(*(table + 1 )));
   
    printf("\nValue of %d",*(color + 2));
 
    
    printf("\nValue of *(month + 1) is %s",*(month + 1));
    
    printf("\nValue of *month + 1 is %s", *month + 1);
    
 
 
    return 0;
   
}
