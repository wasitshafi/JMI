#include<bits/stdc++.h>
using namespace std;

/*  Problem : Suppose that the number is 8759432976 is stored in an integer type array arr[]. Write an algorithm to multiply
              number by 'x' where  1 < x < 3641, and store the result in same array and print the result.
              arr[] = |0|0|0|0|0|8|7|5|9|4|3|2|9|7|6|
*/
unsigned long long int convertToInt(int arr[], int right)
{
	int left;
	unsigned long long int num = 0, base = 1;

	for( left = 0; arr[left] == 0 ; left++);
	for( int i = right ; i  >= left ; i--)
	{
		num = num + (arr[i] * base);
		base = base  * 10;	
	}
	return num;
}

void storeResultInArray(int arr[], int right, unsigned long long int result)
{
	for(int i = 0 ; i <= right; i++, arr[i] = 0);
	while(result)
	{
		arr[right--] = result % 10;
		result = result / 10;
	}
}

void printResult(int arr[], int right)
{
	int left;
	for( left = 0 ; arr[left] == 0 ; left++);
	for( int i = left ; i <= right ; i++ ) cout << arr[i];
}

int main()
{
	int x, i, arr[15] = {0, 0, 0, 0, 0, 8, 7, 5, 9, 4, 3, 2, 9, 7, 6};
	unsigned long long int num, result;
	
	cout << endl << "Enter value of x : ";
	cin >> x;

	num = convertToInt(arr, sizeof(arr) / sizeof(arr[0]) - 1);
	result = num * x;

	storeResultInArray(arr, sizeof(arr) / sizeof(arr[0]) - 1, result);
    cout << endl << "x = " << x  << endl;

    cout << num  << " * " << x  << " = "; printResult(arr, sizeof(arr) / sizeof(arr[0]) - 1);
	
	return 0;
}