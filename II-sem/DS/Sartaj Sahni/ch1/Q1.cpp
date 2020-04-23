//
//
//
//
#include<iostream>
using namespace std;

void swap(int &x, int &y)
{
  int temp = x;
  x = y;
  y = temp;
}

int main()
{
  int x = 10, y = 15;

  cout << endl << "Values before function call.";
  cout << endl << "x = " << x << "\ty = " << y;
  swap(x, y);
  cout << endl << "Values after function call.";
  cout << endl << "x = " << x << "\ty = " << y;

  return 0;
}
