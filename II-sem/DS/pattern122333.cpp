//
//
//
//
#include<iostream>
using namespace std;

int main()
{
    int n, index;
    int *arr;

    cout << endl << "Enter value of n : ";
    cin >> n;
    arr = new int[n];
    index = 0;

   for( int i = 1 ; i <= n ; i++)
    for( int j = 1; j <= i ; j++)
     arr[index++] = i;

    for( int i = 0  ; i <= (n * n + 1) / 2 ; i++)
        cout << arr[i] << " ";

    return 0; 
}