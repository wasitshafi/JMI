//
//
//
//
#include<iostream>

using namespace std;

template<class T>
class NUMBER{
    T x,y;
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
    NUMBER<int> n1;
    NUMBER<float> n2;

    cout << endl << "Enter integer values : ";
    n1.getdata();
    n1.putdata();

    cout << endl << "Enter float values : ";
    n2.getdata();
    n2.putdata();

    return 0;
}

