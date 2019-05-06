//
//
//
//
#include<iostream>
using namespace std;

class fraction{
  int numerator, denomerator;
  public:
  inline int getNumerator(){ return numerator;}
  inline int getDenomerator(){ return denomerator;}
  friend istream& operator >> (istream& , fraction&);
  friend ostream& operator << (ostream& , fraction&);
  operator float()
  {
    return (float)numerator/denomerator;
  }
};

istream& operator >> (istream& input, fraction& f)
{
  cout << endl << "Enter numerator : ";
  input >> f.numerator;
  cout << endl << "Enter denomerator : ";
  input >> f.denomerator; 
  return input;
}

ostream& operator << (ostream& out, fraction& f)
{
  out << "Numerator = " << f.numerator << endl << "Denomerator = " << f.denomerator;
  return out;
}

int main()
{
  fraction f; 
  float frac;

  cin >> f;
  cout << f;

  frac = f;
  cout << endl << f.getNumerator() << "/" << f.getDenomerator() << " = " << frac; 
  return 0;
}