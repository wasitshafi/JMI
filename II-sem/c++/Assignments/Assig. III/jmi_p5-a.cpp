//
//jmi_p5-a.cpp
//
//C++ program to overload ++ operator

#include<bits/stdc++.h>

using namespace std;

class pre_increment{
    int x;

    public:

    void getdata();
    void putdata();
    int operator ++();
};

void pre_increment::getdata()
{
    cout << endl << "Enter value of x : ";
    cin >> x; 
}

void pre_increment::putdata()
{
    cout << endl << "Value of 'x' is = " << x;
}
int pre_increment::operator ++()
{
    return ++x;
}

class post_increment{
    int y;

    public:

    void getdata();
    void putdata();
    int operator++(int);
};

void post_increment::getdata()
{
    cout << endl << "Enter value of y : ";
    cin >> y; 
}

void post_increment::putdata()
{
    cout << endl << "Value of 'y' is = " << y;
}
int post_increment::operator++(int)
{
    return y++;
}

int main()
{
    pre_increment obj1;
    post_increment obj2;
    int a, b;

    obj1.getdata();
    obj2.getdata();
   
    a = ++obj1;
    b = obj2++; 
    
    cout << endl << "Value of 'a' is = " << a;
    cout << endl << "Value of 'b' is = " << b;

    cout << endl;

    obj1.putdata();
    obj2.putdata();

    return 0;
}