//
//
//
//
#include<bits/stdc++.h>
using namespace std;

void* operator new(size_t size)
{
    void* p = malloc(size);
    return p;
}

void operator delete(void* p)
{
    free(p);
}

int main()
{
    int n;

    cout << endl << "Enter no of elements : ";
    cin >> n;

    int *array = new int [n];
    cout << endl << endl ;
    
    for( int i = 0 ; i < n ; i++)
     cout << "Enter element no " << i + 1 << " : ", cin >> array[i];

    cout << endl << endl << "Elements are as follows : ";
    for( int i = 0 ; i < n ; i++ ) cout << array[i] << " ";
    
    delete array;
    return 0;
}