//
//
//
//

#include<iostream>

using namespace std;

template < class D1 , class D2 >
float sum(D1 a, D2 b)       //return type ifloat can store integers as well
{
  return a + b;
}

int main()
{
    int n1, n2;
    float r1, r2;

    cout << endl << "Enter an integer no:\t";
    cin >> n1;
    cout << endl << "Enter an integer no:\t";
    cin >> n2;

    cout << endl << "Enter an real no:\t";
    cin >> r1;
    cout << endl << "Enter an real no:\t";
    cin >> r2;

    cout << endl << "Sum(" << n1 << ", " << n2 << ") = " << sum(n1, n2);
    cout << endl << "Sum(" << r1 << ", " << r2 << ") = " << sum(r1, r2);
    cout << endl << "Sum(" << n1 << ", " << r2 << ") = " << sum(n1, r2);
    cout << endl << "Sum(" << r1 << ", " << r2 << ") = " << sum(r1, n2);

    return 0;
}
