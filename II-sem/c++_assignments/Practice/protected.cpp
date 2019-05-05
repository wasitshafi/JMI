//
//
//
//

#include<iostream>

using namespace std;

class person{
protected:
  string name;
  int age;
public:
  void getdata();
  void putdata();
};

void person::getdata()
{
  cout << endl << "Enter name of person : ";
  getline(cin , name);

  cout << endl << "Enter age of " << name << " : ";
  cin >> age;
}

void person::putdata()
{
  cout << endl << "Name = " << name << endl << "Age = " << age;
}

int main()
{
  person p;

//  p.name = "wasit shafi";  // error
//  p.age = 20;              // error

  p.getdata();
  p.putdata();

  return 0;
}
