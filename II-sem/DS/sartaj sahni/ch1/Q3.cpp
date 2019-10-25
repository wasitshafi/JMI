//
//
//
//
#include<iostream>
using namespace std;

template<class T, class A>
int count(T &arr, int n, A key)
{
 int c = 0;

 for( int i = 0 ; i < n ; i++ )
 {
   if(arr[i] == key)
   c++;
 }
 return c;
}

int main()
{
  int int_array[] = {1, 2, 3, 1, 2, 3, 4, 5, 4, 5, 6, 1, 2, 3};
  float float_array[] = {1.1, 2.2, 3.3, 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 1.1, 2.2, 3.3};
  int int_key;
  float float_key;

  cout << "int_array[] = { ";
   for( int i = 0 ; i < sizeof(int_array)/sizeof(int) ; i++ )
    cout << int_array[i] << "  ";
  cout << "}";

  cout << endl << "float_array[] = { ";
   for( int i = 0 ; i < sizeof(float_array)/sizeof(int) ; i++ )
    cout << float_array[i] << "  ";
  cout << "}";

  cout << endl << endl << "Enter key element for int_array[] : \t";
  cin >> int_key;

  cout << endl << endl << "Enter key element for float_array[] : \t";
  cin >> float_key;

  cout << endl << "Count(" << int_key << ") = " << count(int_array, sizeof(int_array)/sizeof(int), int_key);
  cout << endl << "Count(" << float_key << ") = " << count(float_array, sizeof(float_array)/sizeof(float), float_key);

  return 0;
}
