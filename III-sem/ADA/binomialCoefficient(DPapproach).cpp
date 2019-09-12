// for more info refer : https://www.geeksforgeeks.org/binomial-coefficient-dp-9/
#include<iostream>
using namespace std;

int min(int i , int j)
{
    if( i < j)
     return i;
    else
     return j;
}
// Method1
long int binomialCoefficient(int n, int r)
{
    long int a[n + 1][r + 1];

    for( int i = 0; i <= n ; i++)
    {
        for( int j = 0 ; j <= min(i, r) ; j++)
        {
            if(j == 0 || i == j)
              a[i][j] = 1;
            else
              a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
        }
    }
    return a[n][r];
}

//Method2
long int binomialCoefficient2(int n, int r)
{
    long int a[r + 1];
    
    for( int i = 0 ; i <= r ; i++) a[i] = 0;

    a[0] = 1;

    for(int i = 1 ; i <= n ; i++)
        for( int j = min(i, r) ; j > 0 ; j-- )
               a[j] = a[j] + a[j - 1];

    return a[r];
}

int main()
{
    int n, r;

    cout << "Enter value of n : ";
    cin >> n;

    cout << "Enter value of r : ";
    cin >> r;

    cout << "C(" << n << ", " << r << ") : " << binomialCoefficient(n, r);
    cout << endl << endl <<  "C(" << n << ", " << r << ") : " << binomialCoefficient2(n, r);

    return 0;
}