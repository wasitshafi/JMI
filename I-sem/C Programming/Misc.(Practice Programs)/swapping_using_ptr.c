//swapping_using_ptr.c
//
//programe to swap values using pointer
//

int main()
{
	int n1, n2, temp;
	int *ptr1 = &n1, *ptr2 = &n2;
	
	printf("Values before swapping:\n\n");
	printf("n1 = %d \t n2 = %d", n1, n2);
	
	temp = *ptr1;
	*ptr1 = *ptr2;
	*ptr2 = temp;
	
	printf("\n\nValues after swapping:\n\n");
	printf("n1 = %d \t n2 = %d", n1, n2);

    return 0;
}
