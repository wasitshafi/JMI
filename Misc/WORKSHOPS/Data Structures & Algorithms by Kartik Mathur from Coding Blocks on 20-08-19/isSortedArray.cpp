//
//isSortedArray.cpp
//
//program to check whether an array is sorted or not
//
#include<iostream>
using namespace std;

bool isSorted(int array[], int n)
{
    if(n == 0 || n == 1)
        return true;

    // CTM : We as passing the array address for next recursive call.
    bool flag = isSorted(array + 1, n - 1); 

    // Here array[0] & array[1] will point to 1,2 then 3,4 then 5,6... of the original elements because each time new array[] will be called which will take the incremented address as base address
    if(flag == true && array[0] <= array[1])
    return true;
    else
    return false;
}
int main()
{
    int *arr, n;

    cout << endl << "Enter no of elements : ";
    cin >> n;

    for( int i = 0 ; i < n ; i++)
    {
        cout << "Array[" << i + 1 << "]  << ";
        cin >> arr[i]; 
    }

    cout << endl << "Array elements are as : ";
    for( int i = 0 ; i < n ; i++) cout << arr[i] << " ";

    if(isSorted(arr, n - 1))
        cout << endl << "Array is sorted.";
    else
        cout << endl << "Array is not sorted.";
    
    return 0;
}