// we can also use binets formula : ((pow(1 + sqrt(5), n)) - (pow(1 - sqrt(5), n))) / (pow(2,n) * sqrt(5));
#include<iostream>
using namespace std;

int fibonacii(int n)
{
    if(n == 0 || n == 1)
        return n;
    else
        return fibonacii(n + - 1 ) + fibonacii (n - 2);
}

int main()
{
    int n;

    cout << "Enter no of terms : ";
    cin >> n;
    cout << "Fibonacii series  : ";
    for( int i = 0 ;  i < n ; i++)
        cout << fibonacii(i) << " ";

    return 0;
}