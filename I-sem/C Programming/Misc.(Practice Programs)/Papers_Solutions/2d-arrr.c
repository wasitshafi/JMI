#include<stdio.h>
int main()
{	
	int a[2][3] = {1,2,3,4,5,6};
	
	printf("\nValue of a is %d.", a);
	printf("\nValue of ( a + 1 ) is %d.", a + 1);
    printf("\nValue of *( a + 1 ) is %d.", *(a + 1));
    printf("\nValue of *(*( a + 1 ) + 1) is %d.", *(*(a + 1) + 1));
    printf("\nValue of ( *(a)+ 1 ) is %d.", *(a)+ 1);

    printf("\n\n");
    
    printf("\nAddress of a[0][0] is %d",&a[0][0]);
    printf("\nAddress of a[1][0] is %d",&a[1][0]);  
    printf("\nAddress of a[1][0] is %d",&a[1][0]);
    printf("\nValue of a[1][1] is %d",a[1][1]);
    printf("\nAddress of a[0][1] is %d",&a[0][1]);

    return 0;
}
