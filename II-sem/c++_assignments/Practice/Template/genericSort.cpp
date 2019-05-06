//
//
//
//
#include<iostream>
using namespace std;

template<class T1 >
void sort(T1 *arr, int n)
{
    for(int i = 0 ; i < n ; i++)
    {
        for(int j= 0 ; j < n - i - 1 ; j++)
        {            
            if( arr[j] > arr[j + 1])
            {
                T1 temp;
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

int main()
{
    int arrI[5] = { 5, 4, 3, 2, 1};
    float arrF[5] = { 5.5, 4.4, 3.3, 2.2, 1.1};
    char arrC[5] = { 'z','y','x','w','v' };

    sort(arrI, 5);
    sort(arrF, 5);
    sort(arrC, 5);
    
    cout << endl << "Element of arrI are as : ";
    for(int i = 0 ; i < 5 ; i++) cout << arrI[i] << "  ";
       
    cout << endl << "Element of arrF are as : ";
    for(int i = 0 ; i < 5 ; i++) cout << arrF[i] << "  ";
    
    cout << endl << "Element of arrC are as : ";
    for(int i = 0 ; i < 5 ; i++) cout << arrC[i] << "  ";

    return 0;
}