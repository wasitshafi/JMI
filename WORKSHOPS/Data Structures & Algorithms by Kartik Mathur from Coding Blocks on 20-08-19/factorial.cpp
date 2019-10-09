//
//factorial.cpp
//
//program to compute factorial of a number
//
#include<iostream>
using namespace std;

long int factorial(long int n)
{
    if(n == 0 || n == 1)
        return n;
    else
     return n * factorial(n - 1);
}

int main()
{
    int n;

    cout << "Enter value of n  : ";
    cin >> n;

    cout << "Factorial of " << n << " is : " << factorial(n);
    
    return 0;
}