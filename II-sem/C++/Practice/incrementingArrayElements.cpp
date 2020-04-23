//
//incrementingArrayElements.cpp
//
//program to incrementing the elements unlike traditional approach
//
#include<iostream>
using namespace std;

int main()
{
    int n, i;
    int *arr;

    cout << endl << "Enter size of array : ";
    cin >> n;

    arr = new int[n];

    cout << endl << "Enter array " << n << "elements : " << endl;

    for(i = 0 ; i < n ; i++)
    {
        cout << "Arr[" << i + 1 << "] << ";
        cin >> arr[i];
    }

    cout << endl << "Array elements are as  : ";
    for( i = 0 ; i < n ; i++)
    {
        cout << arr[i];
        if(i != n - 1)cout << ", "; 
    }

    for(i = 0 ; i < n ; i++) arr[i]++; // Incrementing array elements Alternate : arr[i] = arr[i] + 1;

    cout << endl << "Array elements after incrementing are as  : ";
    for( i = 0 ; i < n ; i++)
    {
        cout << arr[i];
        if(i != n - 1)cout << ", "; 
    }

    return 0;    
}