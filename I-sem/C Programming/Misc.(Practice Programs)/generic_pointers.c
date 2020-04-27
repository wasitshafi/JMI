#include<stdio.h>

int main()
{
	int num;
	char ch;
	void *gp;
		
	printf("\nEnter num:\t");
	
	gp = &num;
	
	scanf("%d", gp);
	
	printf("Num = %d", *(int *)gp );
	
	gp = &ch;
	
	fflush(stdin);
	
	printf("\n\nEnter char:\t");
	scanf("%c", gp);
	
	printf("ch = %c", *(char *)gp );
	
	
	printf("\n\n\nNum = %d \t ch = %c", num, ch);
	
	
	return 0;
}
