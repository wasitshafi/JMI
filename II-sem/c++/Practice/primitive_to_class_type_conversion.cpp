//
//
//
//

#include<iostream>

using namespace std;

class point{
  int x, y;

public:
  point(){ }
  point(int z, int q)
  {
    x = z;
    y = 0;
  }

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
};

int main()
{
   point p;
   int n;

  p.getdata();

   cout << endl << "Enter value of n : ";
   cin >> n;

    p.putpoint();

  p = n;        // primitive to class type

   return 0;
}
