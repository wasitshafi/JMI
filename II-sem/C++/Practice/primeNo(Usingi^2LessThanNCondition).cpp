#include <iostream>
using namespace std;

bool isPrime(int n)
{
    // if u observe the below for loop will also run upto srqt(n)
    for(int i =  2 ; i * i <= n ; i++) // no need to use even sqrt() like for( int i = 0 ; i <= sqrt(n) ; i++){...} 
        if( n % i == 0)
         return false;
    return true;
}

int main()
{
    int n;

    cout << "Enter value of n : ";
    cin >> n;

    cout << "Prime numbers upto " << n << " are as : ";

    for( int i = 2 ; i <= n ; i++)
        if(isPrime(i))
            cout << i << " ";
    
    return 0;
}