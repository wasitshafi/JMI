//
//
//
//
#include<iostream>
using namespace std;

int abc(int a, int b, int c)
{
  cout << endl << "Called function 1.1";
  return a + b *c;
}

float abc(float a, float b, float c)
{
  cout << endl << "Called function 1.2";
  return a + b * c;
}

int main()
{
  cout << endl << abc(1, 2, 3);
  cout << endl << abc(1.2, 2.3, 3.3);
  //cout << endl << abc(1, 2, 3.0);
  //cout << endl << abc(1.0, 2.0, 3.0);
  return 0;
}
