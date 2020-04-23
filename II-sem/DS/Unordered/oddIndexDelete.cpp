//
//
//
//
#include<iostream>
#include<stdlib.h>
using namespace std;

class array{
    int *arr, n, size;

    public:

    array()
    {
        n = 8;
        arr = new int [n];
        
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        arr[6] = 70;
        arr[7] = 80;
        
        size = 8;
        
    }
    void deleteElement(int index)
    {
        if(index < 0 || index >= getsize())
        {
             cout << "Invalid index...!";
             exit(0);
        }
        else
        {
            for(int i = index ; i < getsize() - 1; i++)
            {
                arr[i] = arr[i + 1];
            }
            size--;
        }
    }
    void oddDelete()
    {
        int m = n - 1; 
        
        
     //   deleteElement(m);    // Deleting last element first
       // m = m - 2;           
       // printArray();

        while(m >= 1)
        {
            deleteElement(m);
            m = m - 2;
            printArray();
        }
    }
    int getsize()
    {
        return size;
    }
    void printArray()
    {
        cout << endl << "ARRAY = ";

        for(int i = 0 ; i < getsize() ; i++)
        {
            cout << arr[i] << " ";
        }
    }
};


int main()
{
    array a;
 
    cout << endl << endl << "Array before deletion : ";
    a.printArray();

    cout << endl << endl << "Calling deleteOdd function()";
    a.oddDelete();

    cout << endl << endl << "Printing array  after deletion :";
    a.printArray();

    return 0;
}