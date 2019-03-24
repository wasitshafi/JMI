//
//
//
//

#include<iostream>
#include<iomanip> //for setw();

using namespace std;

class dist{
  int inches;
  int feets;

public:
  void getdata();
  void putdata();
  int getfeets(){ return feets; }

  operator float()
  {
    cout << endl << endl << inches << " Inches = " << inches * 0.0254 << " Meters";
    return feets * 0.3048;
  }
};

void dist::getdata()
{
  cout << endl << "Enter distance in  inches : ";
  cin >> inches;
  cout << "Enter distance in feets : ";
  cin >> feets;
}

int main()
{
  dist d;
  float m;

  d.getdata();
  m = d;
  cout << endl << d.getfeets() << " Feets = " << d.getfeets() * 0.3048 << " Meters";

  return 0;
}
