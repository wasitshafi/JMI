#include<iostream>
using namespace std;

template <class T1, class T2, class T3>
class SUM{
    T1 x;
    T2 y;
    T3 z;
    public:

    float sum(T1 x, T2 y)
    {
        return x + y;
    }
    float sum(T1, T2, T3);
};


template<class T1, class T2, class T3>
float SUM<T1, T2, T3>::sum(T1 x, T2 y, T3 z)
{
    return x + y + z;
}


int main()
{
   SUM <int , float , long >obj;

   
   cout << endl << "sum(3 + 4) = " << obj.sum(3 , 4);
   cout << endl << "sum(3 + 4 + 5) = " << obj.sum(3 , 4 , 5);
   cout << endl << "sum(3 + 4.4 + 5.5) = " << obj.sum(3 , 4.4, 5.5);
   cout << endl << "sum(3.3 + 4 + 5.5) = " << obj.sum(3.3, 4, 5.5);
   
   return 0;
}