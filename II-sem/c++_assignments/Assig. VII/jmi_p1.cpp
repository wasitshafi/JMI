//
//
//
//
#include<iostream>
using namespace std;

template<class T1, class T2, class T3>
class largest{
    T1 n1;    // int 
    T2 n2;    // float
    T3 n3;    // double
    public:
    void getdata();
    void putdata();
    void printLargest();
};

template<class T1, class T2, class T3>
void largest<T1, T2, T3>::getdata()
{
    cout << endl << "Enter value of n1 (\'int\' Datatype): ";
    cin >> n1;
    cout << "Enter value of n2 (\'float\' Datatype): ";
    cin >> n2;
    cout << "Enter value of n3 (\'double\' Datatype): ";
    cin >> n3;
}

template<class T1, class T2, class T3>
void largest<T1, T2, T3>::putdata()
{
    cout << endl << "n1 = " << n1 << endl << "n2 = " << n2 << endl << "n3 = " << n3;
}

template<class T1, class T2, class T3>
void largest<T1, T2, T3>::printLargest()
{
   cout << endl << "Largest (" << n1 << "," << n2 << "," << n3 << ") = " << (n1 > n2 ? ( n1 > n3 ? n1 : n3 ) : n2 > n3 ? n2 : n3);
}

int main()
{
    largest<int,float,double> number;

    number.getdata();
    number.putdata();
    number.printLargest();
    
    return 0;
}