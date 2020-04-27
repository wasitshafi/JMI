//
//
//
//
int main()
{
	int arr[5] = {0, 11, 22, 33, 44};
    int *ptr;
    
    ptr = arr;
    
    printf("%d\n", arr);
    printf("%d\n", &arr);
    printf("%d\n", &arr[0]);
    printf("%d\n", (arr + 0));
	printf("%d\n", *arr);
    printf("%d\n", arr[0]);
    printf("%d\n", *(arr + 0));
    
    return 0;
}
