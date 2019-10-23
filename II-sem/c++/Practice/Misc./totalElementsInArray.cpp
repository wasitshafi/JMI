#include<iostream>
using namespace std;

void printIntArray( const int arrI[], int n) // constant reference just to make is faster
{
    for(int i = 0 ; i < n ; i++)
        cout << arrI[i] << " ";
    cout << endl;
}

int main()
{
    int arrI[] = {1, 2, 3, 4, 5, 6, 7};
 
    printIntArray( arrI, sizeof(arrI) / sizeof(int));
    printIntArray( arrI, sizeof(arrI) / sizeof(arrI[0]));  // More flexible
    
    return 0;
}