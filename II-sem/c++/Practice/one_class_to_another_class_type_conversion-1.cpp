//
//
//
//
#include<iostream>

using namespace std;
class number1{
  int x;
public:
  void getdata()
  {
    cout << endl << "Enter value of x : ";
    cin >> x;
  }
  void putdata()
  {
    cout << "x = " << x;
  }
  int getx()
  {
    return x;
  }
};

class number2{
  int y;
public:
  number2(){}
  number2(number1 n)
  {
    y = n.getx();
  }
  void putdata()
  {
   cout << endl << "y = " << y;
  }
};

int main()
{
  number1 n1;
  number2 n2;

  n1.getdata();

  n2 = n1;

  n1.putdata();
  n2.putdata();
  return 0;
}
