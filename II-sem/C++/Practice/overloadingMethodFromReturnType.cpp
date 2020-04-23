//
//overloadingMethodFromReturnType.cpp
//
//program that tries to overload a method sum() based on return type.
//
//NOTE:This program will results in compile time error as it tries to overload a method sum() based on the return type of method which is not possible in c++ as only difference of return type is not suficient for the compiler to overload 
#include<iostream>
using namespace std;

void sum(int x, int y)
{
    cout << endl << "Sum(" << x << ", " << y << ") : " << x + y;
}

int sum(int x, int y)
{
  return x + y;   
}
int main()
{

    sum (2,4);
    cout << endl << "Sum(" << 5 << ", " << 2 << ") : " << sum(5, 2); // error
    return 0;
}