//
//max_min_using_only_1_relation_operator.cpp
//
//program to find max. & min. element of an array using only one relational operator.

#include<iostream>
using namespace std;

int main()
{
  int n, flag, max_min_value;

  do{
     cout << endl << "Enter no of elements : ";
     cin >> n;
     if(n < 1) cout << endl << "Invalid input...! Try Again.";
 }while(n < 1);

  int array[n];

  cout << endl << "Enter " << n << " elements : " << endl;
  for( int i = 0 ; i < n ; i++ )
  {
    cout << "A[" << i + 1 << "] : ";
    cin >> array[i];
  }

  cout << endl << "Array elements are as : ";
  for( int i = 0 ; i < n ; i++ )
  {
    cout << array[i] << " ";
  }

  cout << endl << "Max. and Min. elements are as : ";

  flag = 1;
  for(int i = 1 ; i <= 2 ;i++)
  {
    max_min_value = array[0];

    for( int j = 0 ; j < n ; j++ )
    {
      if(flag * max_min_value < array[j] * flag)
      {
        max_min_value = array[j];
      }
    }
    cout << max_min_value << " ";
    flag = -flag;   // flag = -1
  }

}
