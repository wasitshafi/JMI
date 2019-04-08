//
//
//
//
#include<iostream>
#include<stdlib.h>

using namespace std;

class matrix{
    int **arr, rows, cols;
public:
    matrix(int r, int c)
    {
     rows = r;
     cols = c;

     arr = new int*[rows];

     for(int i = 0 ; i < rows ; i++)
       arr[i] = new int[cols];
    }
    void read()
    {
        for(int i = 0 ; i < rows ; i++)
        {
          for(int j = 0 ; j < cols ; j++)
          {
                cout << "arr[" << i + 1 << "][" << j + 1 << "] : ";
                cin >> arr[i][j];
          }
          cout << endl;
        }
    }
    void print()
    {
      for(int  i = 0 ; i < rows ; i++ )
      {
       for(int j = 0 ; j < cols ; j++)
       {
        cout << arr[i][j] << "\t";
       }
       cout << endl;
      }
    }
};

int main()
{
    int rows, cols;

    cout << endl << "Enter no of rows : ";
    cin >> rows;
    cout << endl << "Enter no of cols : ";
    cin >> cols;

    matrix m(rows, cols);

    cout << endl << "You have to enter " <<  rows * cols << " elements" << endl;
    m.read();

    cout << endl << "Matrix is as follows : " << endl;
    m.print();

  return 0;
}
