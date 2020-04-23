#include<iostream>
using namespace std;

template<class T1, class T2>
T2 sum(T1 x, T2 y)
{
    return x + y;
}

int main()
{
   cout << endl << "sum(3 + 4) = " << sum(3 , 4);
   cout << endl << "sum(3.3 + 4.4) = " << sum(3.3 , 4.4);
   cout << endl << "sum(3 + 4.4) = " << sum(3 , 4.4);
   cout << endl << "sum(3.3 + 4) = " << sum(3.3 , 4);

   return 0;
}