//
//
//
//
#include<iostream>
#include<stdlib.h>

using namespace std;

class matrix{
    int *arr, n;
public:
    matrix(int n)
    {
     arr = new int[n];
     this->n = n;
    }

    void read()
    {
      for(int i = 0 ; i < n ; i++)
      {
        cout << "arr[" << i + 1 << "][" << i + 1 << "] : ";
        cin >> arr[i];
      }
    }

    void print()
    {
      for(int  i = 0 ; i < n ; i++ )
      {
       for(int j = 0 ; j < n ; j++)
       {
        if(i == j)
         cout << arr[i] << "\t";
        else
         cout << "0" << "\t";
       }
       cout << endl;
      }
    }

    int det()
    {
        int p = 1;

        for(int i = 0 ; i < n ; i++)
         p = p * arr[i];

         return p;
    }

};

int main()
{
    int n;

    cout << endl << "Enter order of square matrix : ";
    cin >> n;
    matrix m(n);

    cout << endl << "You have to enter " << n << " diagonal elements" << endl;
    m.read();

    cout << endl << "Matrix is as follows : " << endl;
    m.print();
    cout << endl << "Determinant of matrix is : " << m.det();

  return 0;
}
