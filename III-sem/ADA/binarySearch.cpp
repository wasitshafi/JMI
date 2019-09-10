#include<iostream>
using namespace std;

int binarySearch(int arr[], int low, int high, int key)
{
    if(low == high)
    {
        if(arr[low] == key)
          return low;
        else
          return -1;
    }
    else
    {
        int mid = (low + high) / 2;
        if(arr[mid] == key)
          return mid;
        else if(key < arr[mid])
          binarySearch(arr, low, mid-1, key);
        else
          binarySearch(arr, mid + 1, high, key);
    }
}

int main()
{
    int *arr , n, key, index;

    cout << "Enter no. of elements : ";
    cin >> n;

    arr = new int[n];

    cout << endl << "Enter  " << n << " elements in sorted order : " << endl;
    for( int i = 0 ; i < n ; i++)
    {
        cout << "Arr[" << i + 1 << "] << ";
        cin >> arr[i];
    }
    cout << endl << endl << "Array elements are as follows :";
    for ( int i = 0 ; i < n; i++) cout << arr[i] << " ";

    cout << endl << "Enter element to search :";
    cin >> key;

    index = binarySearch(arr, 0, n-1, key);
    
    if(index != -1)
        cout << "Search Successful...! Element Found at index " << index << ".";
    else
        cout << "Search Unsucessful.";

    return 0;
}