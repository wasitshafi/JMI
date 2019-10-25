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

    for(int i = 1 ; i <= n ; i++)
        for(int j = 1 ;  j <= 3 ; j++)
            arr[index++] = i;
    
    cout << endl << "arr[] = ";
    for( int i = 0  ; i < n * 3 ; i++)
        cout << arr[i];

    return 0; 
}