//
//
//
//
#include<iostream>

using namespace std;

class fraction{
  int numerator;
  int denomerator;
public:
  void getdata();
  void putdata();
  operator float()
  {
    return float(numerator)/float(denomerator);
  }
};

void fraction::getdata()
{
  cout << endl << "Enter numerator : ";
  cin >> numerator;

  cout << endl << "Enter denomerator : ";
  cin >> denomerator;

}

void fraction::putdata()
{
  cout << endl << "Numerator = " << numerator << endl << "Denomerator = " << denomerator;
}

int main()
{
  float f;
  fraction F;

  F.getdata();
  F.putdata();

  f = F;

  cout << endl << "f = " << f;

  return 0;
}
