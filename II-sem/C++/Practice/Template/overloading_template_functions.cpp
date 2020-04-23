//
//
//
//
#include<iostream>
using namespace std;

template<class T>
void display(T x)
{
    cout << endl << "Inside display(T x)"; 
    cout << endl << "x = " << x; 
}

template<class T1, class T2>
void display(T1 x, T2 y)
{
    cout << endl << "Inside display(T1 x, T2 y)"; 
    cout << endl << "x = " << x;
    cout << endl << "y = " << y;
}

void display(int x)
{
    cout << endl << "Inside display(int x)"; 
    cout << endl << "x = " << x;
}

void display(int x, int y)
{
    cout << endl << "Inside display(int x, int y)"; 
    cout << endl << "x = " << x;
    cout << endl << "y = " << y;
}

int main()
{
    display(1);   
    display(1.1);
    display('a');
    cout << endl << endl;
    display(2, 3);
    display(2.2, 3.3);
    display('a', 'b');
    

    return 0;
}