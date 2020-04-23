//
//
//
//
#include<iostream>
using namespace std;

int abc(int a, int b, int c)
{
  try{
    if( a <= 0 || b <= 0 || c <= 0 )
      throw "All parameter must be > 0";
     }
  catch(char* e)
  {
    cout << endl << "An exception is thrown.";
    cout << endl << e;
    return -1;
  }
 return a + b * c;
}

int main()
{
  cout << endl << abc(1, 2, 3);
  cout << endl << abc(0, 1, 2);
  cout << endl <<   abc(1, 0, 2);

  return 0;
}
