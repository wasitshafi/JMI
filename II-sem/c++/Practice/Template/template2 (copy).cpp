#include<iostream>
using namespace std;

template<class T1, class T2>
T2 sum(T1 x, T2 y)
{
    return x + y;
}
template<class T1, class T2, class T3>
T2 sum(T1 x, T2 y, T3 z)
{
    return x + y + z;
}


int main()
{
   cout << endl << "sum(3 + 4) = " << sum(3 , 4);
   cout << endl << "sum(3 + 4 + 5) = " << sum(3 , 4 , 5);
   cout << endl << "sum(3 + 4.4 + 5.5) = " << sum(3 , 4.4, 5.5);
   cout << endl << "sum(3.3 + 4 + 5.5) = " << sum(3.3, 4, 5.5);
   
   return 0;
}