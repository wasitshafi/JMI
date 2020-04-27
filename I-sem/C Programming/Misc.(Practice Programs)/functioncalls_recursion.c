//
//functioncallsNrecursionNaddress
//
//programe to 
#include<stdio.h>
int count = 0;
int main()
{
	int num;
	
	printf("\nEnter a number:\t");
	scanf("%d", &num);
	
	printf("\nFactorial of %d is %d.", num, fact(num));
	
	return 0;
}

int fact(int num)
{
	printf("\nFunction call %d :Function address %X :  Address of num is %d Created.", ++count, &fact, &num);
	int local_count = count;
	if(num == 1) return num;
	
	else
	
{

//	return(num * fact(num - 1));
  
  
    num = num * fact(num - 1);

//	printf("\nFunction call %d : Address of num is %X Destroyed.", local_count, &num);

}


}
