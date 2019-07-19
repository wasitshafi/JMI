//
//
//
//
#include<iostream>

using namespace std;

class xyz{


public:
int x;
void putdata()
{
 cout << endl << "x = " << x;
}

};


class abc{
int a;
public:
void getdata()
{
cout << endl << "Enter value of a : ";
cin >> a;
}
void putdata()
{
 cout << endl << "A = " << a;
}
operator xyz()
{
    xyz o;
    o.x = a;
    return o;
}

};
int main()
{
    abc obj1;
    xyz obj2;
    obj1.getdata();
    obj1.putdata();
    obj2 = obj1;
    obj2.putdata();
 return 0;
}

