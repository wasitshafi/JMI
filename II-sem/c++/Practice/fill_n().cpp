//
//fill_n().h
//
//program to fill the array with some default value
//
#include<iostream>
#include<algorithm>
using namespace std;

int main()
{
    int arr1[10] = {0}; // It will set all the elements with 0
    int arr2[10] = {5}; // It will set only first elements to 5 and rest all to 0
    int arr3[10] = {7}; // It will set only first elements to 7 and rest all to 0
    int arr4[10];
    fill_n(arr4, 10, 4); // will set all the 10 elements with default value of 4;// fill_n() is defined in <algorithm> header
    
    cout << "arr1 = ";
    for( int i = 0 ; i < 5 ; i++)
        cout << arr1[i] << " ";

    cout << endl << "arr2 = ";
    for( int i = 0 ; i < 5 ; i++)
        cout << arr2[i] << " ";

    cout << endl << "arr3 = "; 
    for( int i = 0 ; i < 5 ; i++)
        cout << arr3[i] << " ";

    cout << endl << "arr4 = "; 
    for( int i = 0 ; i < 5 ; i++)
        cout << arr4[i] << " ";
    return 0;
}