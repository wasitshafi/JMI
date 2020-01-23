#include<iostream>
using namespace std;

/*  Problem : Suppose that the number is 8759432976 is stored in an integer type array arr[]. Write an algorithm to multiply
              number by 'x' where  1 < x < 3641, and store the result in same array and print the result.
              arr[] = |0|0|0|0|0|8|7|5|9|4|3|2|9|7|6|
*/

int getNoOfDigits(int arr[], int n)
{
    int i;
    for( i = 0 ; arr[i] == 0 ; i++);
    return n - i + 1;
}

void multiply(int arr[], int n, int x)
{
    long int temp, carry = 0;   // it can store value 9 * 3641 + carry === 32769 + carry 
    short int noOfDigits = getNoOfDigits(arr, n);
    int i;
    for(i = n ; i > n - noOfDigits ; i-- )
    {
        temp = arr[i] * x + carry;
        arr[i] = temp % 10;
        carry = temp / 10;
    }

    while(carry)
    {
        arr[i--] = carry % 10;
        carry = carry / 10; 
    }
}

void printArray(int arr[], int n)
{
    int i;
	for( i = 0 ; arr[i] == 0 ; i++);
	while(i <= n) cout << arr[i++];
}

int main()
{
	int x, i, arr[15] = {0, 0, 0, 0, 0, 8, 7, 5, 9, 4, 3, 2, 9, 7, 6}; // we assume the size of array is large enough to hold the result
	
	cout << endl << "Enter value of x : ";
	cin >> x;
    
    cout << endl <<  x << " * "; printArray(arr, sizeof(arr) / sizeof(arr[0]) - 1); cout << " : "; multiply(arr, sizeof(arr) / sizeof(arr[0]) - 1, x);printArray(arr, (sizeof(arr)/sizeof(arr[0])) - 1);

	cout << endl; return 0;
}