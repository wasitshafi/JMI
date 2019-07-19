//
//
//
//program to show how to initlize memory to 0 using stack as well as heap memory
//
#include<iostream>
using namespace std;

int main()
{
    int n, i;
    cout << "Enter no. of elements (Initialize to 0) : ";
    cin >> n;
    
    // CTM : we can only initilize memory to 0 , suppose if you put some other value inside braces like {4} then it will initilize the first element to 4 and rest other elements to 0
    int arr1[n] = {0};           // using stack;
    int arr2[n] = {};

    int *arr3 = new int[n]{0};   // using heap
    int *arr4 = new int[n]{};    // or this will also initilize elements to 0

    cout << endl << endl << "arr1 = ";
    for( i = 0 ; i < n ; i++) cout << arr1[i] << " ";

    cout << endl << endl << "arr2 = ";
    for( i = 0 ; i < n ; i++) cout << arr2[i] << " ";

    cout << endl << endl << endl << "arr3 = ";
    for( i = 0 ; i < n ; i++) cout << arr3[i] << " ";

    cout << endl << endl << "arr4 = ";
    for( i = 0 ; i < n ; i++) cout << arr4[i] << " ";

    delete arr3;
    delete arr4;

    return 0;
}