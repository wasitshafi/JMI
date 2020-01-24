#include<iostream>
#include<algorithm>
using namespace std;

int main()
{
    int a, b, c;

    cout << "Enter value of a, b & c : ";
    cin >> a >> b >> c;

    cout << "Min(a, b, c) : " << min(a, min(b, c));
    cout << "\nMax(a, b, c) : " << max(a, max(b, c)); // CTM : "\n" is faster than endl, endl also has to perform flush operation
    return 0;
}