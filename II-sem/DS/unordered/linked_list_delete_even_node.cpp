//
//program to delete odd index elements in an array
//
//delete_odd_index.cpp

#include<iostream>
using namespace std;

class array{
int *arr, n;
int size;

public :
    array(){}
    array( int n)
    {
     arr = new int [n];
     this->n = n;
     size = 0;
    }
   friend ostream& operator <<(ostream& out, array& a);
   friend istream& operator >>(istream& input, array& a);
   void delete_odd();
};
  istream& operator >>(istream& input, array& a)
   {
    for( int i = 0 ; i < a.n ; i++ )
     {
      cout << endl << "arr[ " << i + 1 << " ] : \t";
      input >> a.arr[i];
      a.size++;
     }
   }
   ostream& operator <<(ostream& out, array& a)
   {
      for( int i = 0 ; i < a.size ; i++ )
        out << a.arr[i] << " ";
   }
   void array::delete_odd()
   {
      for( int i = 1, j = 2 ; i < n/2 ;i++, j = j + 2)
        arr[i] = arr[j];
    size = n/2;
   }


int main()
{
    int n;
    array a;
    do{
        cout << endl << "Enter size of array (HINT: n must be even):\t";
        cin >> n;

        if( n % 2 != 0 && n > 0 )
         cout << endl << "Invalid input...! (HINT: n must be even):";
    }while( n % 2 != 0 && n > 0 );

    a = array(n);

    cout << endl << "Enter " << n << " elements of array:\t";
    cin >> a;
    cout << endl << "Array elements are as :\t";
    cout << a;

    a.delete_odd();
    cout << endl << "After deleting odd nodes.";
    cout << endl << "Array elements are as :\t";
    cout << a;
    return 0;
}
