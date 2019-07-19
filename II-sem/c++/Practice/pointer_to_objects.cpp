//
//
//
//
#include<iostream>
using namespace std;

class point{
    int x, y;
    public:
    void getdata()
    {
        cout << endl << "Enter value of x : ";
        cin >> x;
        cout << "Enter value of y : ";
        cin >> y;
    }

    void putdata()
    {
        cout << endl << "X = " << x << endl << "Y = " << y;
    }
};

int main()
{
    point p;
    point*ptr = &p;

    ptr->getdata();
    (*ptr).putdata();

    return 0;
}