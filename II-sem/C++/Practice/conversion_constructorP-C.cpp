//
//
//
//
#include<iostream>
using namespace std;

class point{
  int x, y;
  public:
  point(){}
  point(int x)
  {
    this->x = x;
    y = 0;
  }
  friend ostream& operator << (ostream& , point&);
};

ostream& operator << (ostream& out, point& p)
{
  out << "Point = P(" << p.x << ", " << p.y << ")"; 
  return out;
}

int main()
{
  point p;
  int x;
  
  cout << endl << "Enter integer : ";
  cin >> x;
  
  p = x;

  cout << p;
  return 0;
}