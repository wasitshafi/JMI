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
    cout << endl << "Enter value of y : ";
    cin >> y;
  }
  void putpoint()
  {
    cout << "Point = P(" << x << "," << y << ")";
  }
  operator int()
  {
    return x;
  }
};

int main()
{
  point p;
  int x;

  p.getdata();
  p.putpoint();
  x = p;
  cout << endl << "x = " << x;

  return 0;
}
