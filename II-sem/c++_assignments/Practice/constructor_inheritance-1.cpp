//
//
//
//

#include<iostream>

using namespace std;

class person{
  string name;
  int age;
public:
  person(string name, int age)
  {
    this->name = name;
    this->age = age;
  }

  void putdata()
  {
    cout << endl << "Name = " << name << endl << "Age = " << age;
  }
};

class student:public person{
  int id;
  string course;
public:
  student(string name, int age) :person(name,age)  //calling base class constructor
  {}

  void getdata()
  {
    cout << endl << "Enter studen id : ";
    cin >> id;
    cout << endl << "Enter student course :";
    cin >> course;
  }

  void putdata()
  {
    cout << endl << "ID = " << id << endl << "Course = " << course;
  }
};

int main()
{
  string name;
  int age;

  cout << endl << "Enter student name : ";
  getline(cin , name);
  cout << endl << "Enter student age : ";
  cin >> age;

  student s(name, age);
  s.getdata();

  s.putdata();
  s.person::putdata(); // calling base class putdata() function

  return 0;
}
