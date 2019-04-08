//
//
//
//
#include<iostream>

using namespace std;

template<class T1, class T2>
class NUMBER{
    T1 x;
    T2 y;
public:
    NUMBER(T1 x , T2 y)
    {
      this->x = x;
      this->y = y;
    }
    void putdata()
    {
      cout << endl << "X = " << x << endl << "Y = " << y;
    }
    float sum()
    {
      return x + y;
    }
};

int main()
{
    NUMBER<int, float>n1(20,4.4);
    NUMBER<float, float>n2(2.2,4.4);
    NUMBER<float, int>n3(2,4);

    cout << endl << "n1.sum = " << n1.sum();
    cout << endl << "n2.sum = " << n2.sum();
    cout << endl << "n3.sum = " << n3.sum();

    return 0;
}