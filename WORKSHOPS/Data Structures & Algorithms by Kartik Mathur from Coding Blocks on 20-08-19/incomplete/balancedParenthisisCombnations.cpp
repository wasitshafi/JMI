//
//
//
//
//
#include<iostream>
using namespace std;

double squareRoot(double n)
{
    int low = 0;
    int high =  n;
    int mid = (low + high) / 2;

    while(high > low)
    {
        if(mid * mid == n)
        return mid;
    
        if(mid * mid > n)
            high = mid - 1;
        else
            low = mid + 1;
        
        mid = (low + high) / 2;
    }

    return mid;
}

int main()
{
    double n;
    
    cout << "Enter value of n : ";
    cin >> n;

    cout << endl << "SquareRoot of " << n << " is : " << squareRoot(n);

    return 0;
}