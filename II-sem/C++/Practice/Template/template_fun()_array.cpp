//
//
//
//

#include<iostream>

using namespace std;

template < class D1 >
D1 sum(D1 arr[], int size)          // we know the sum of elements of say int will be int, for float sum will be of float.
{                                   // we know the size will always be integer as it represents no of elements.
  D1 sum = 0;

  for ( int i = 0 ; i  < size ; i++ )
  {
   sum += arr[i];
  }
  return sum;
}

int main()
{
    int arr1[] = {1, 2, 3, 4, 5, 6, 7};
    float arr2[] = {1.1, 2.7, 3.2, 4.4};

   cout << endl << "arr1 = {";
   for( int i = 0 ; i < sizeof(arr1) / sizeof(int) ; i++) cout << arr1[i] << "  ";
   cout << "}";

   cout << endl << "arr2 = {";
   for( int i = 0 ; i < sizeof(arr2) / sizeof(float) ; i++) cout << arr2[i] << "  ";
   cout << "}";

   cout << endl;

   cout << endl << "Sum(arr1) : " << sum(arr1, sizeof(arr1) / sizeof(int) ); // or sum(arr1, 6);
   cout << endl << "Sum(arr2) : " << sum(arr2, sizeof(arr2) / sizeof(float) ); // or sum(arr2, 4);

  return 0;
}
