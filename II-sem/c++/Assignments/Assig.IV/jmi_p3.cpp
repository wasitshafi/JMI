//
//
//
//
#include<iostream>

using namespace std;

class base{
  int x;
  public:
  int y;
  friend class derived;

};

class derived:private base{
  int d;
public:
  class base b;
  void getdata();
  void putdata();
};
void derived::getdata()
{
  cout << endl << "Enter value of x : ";
  cin >> b.x;
  cout << "Enter value of y : ";
  cin >> b.y;
  cout << "Enter value of d : ";
  cin >> d;
}

void derived::putdata()
{
  cout << endl << "X = " << b.x << "\tY = " << b.y << endl << "D = " << d;
}

int main()
{
  derived obj;

  obj.getdata();
  obj.putdata();

  return 0;
}
