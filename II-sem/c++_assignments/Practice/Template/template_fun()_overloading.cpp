//
//
//
//

#include<iostream>

using namespace std;

template < class T > // T is placeholder for data type
T sum( T a, T b )
{
  cout << " < output from function 1 >";
  return a + b;
}

template < class T >
T sum( T a, T b, T c )
{
  cout << " < output from function 2 >";
  return a + b + c;
}

template < class T, class X >
float sum( T a, X b )       //return type float can store integers as well
{
  cout << " < output from function 3 >";
  return a + b;
}

template < class T, class X, class Z >
float sum( T a, X b, Z c )       //return type float can store integers as well
{
  cout << " < output from function 4 >";
  return a + b + c;
}


int main()
{
    cout  << "Sum( 10,20) = " << sum( 10, 20 ) << endl;
    cout  << "Sum( 10,20, 30) = " << sum( 10, 20, 30 ) << endl;
    cout  << "Sum( 10, 5.5) = " << sum( 10, 5.5 ) << endl;
    cout  << "Sum( 10,2.3, -4) = " << sum( 10, 2.3, -4 ) << endl;

    return 0;
}
