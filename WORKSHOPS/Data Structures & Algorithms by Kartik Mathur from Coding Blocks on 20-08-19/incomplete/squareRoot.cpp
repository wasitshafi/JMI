//
//
//
//
//
#include<iostream>
#include<math.h>
using namespace std;

double squareRoot(double n)
{
    int low = 0;
    int high = n;
    int mid;

    while(low <= high)
    {
        mid = (low + high) / 2;

        if( mid * mid == n)
            return mid;
        else if( mid * mid > n)
            high = mid - 1;
        else
            low = mid + 1;
    }
    return mid;
}

int main()
{
    double n;
    
    cout << "Enter value of n : ";
    cin >> n;

//    cout << endl << "SquareRoot of " << n << " is : " << squareRoot(n);

for(int i = 1 ; i < n; i ++)
{
    cout << i << "\t" << squareRoot(i) << "  " << sqrt(i) << endl;
}


    return 0;
}