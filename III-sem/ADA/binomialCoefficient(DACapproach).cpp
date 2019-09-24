#include<iostream>
using namespace std;

long long int binomialCoefficient(int n, int r)
{
    if(r == 0 || n == r)
        return 1;
    else
    return binomialCoefficient(n - 1, r - 1) + binomialCoefficient(n - 1, r);
}

int main()
{
    int n, r;

    cout << "Enter value of n : ";
    cin >> n;

    cout << "Enter value of r : ";
    cin >> r;

    cout << "C(" << n << ", " << r << ") : " << binomialCoefficient(n, r);

    return 0;
}