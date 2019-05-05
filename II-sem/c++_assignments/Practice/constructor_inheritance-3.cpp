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
  person(){}
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

class result{
  float m_science, m_maths, m_english;
  float total;
public:
  result(){}
  result(int m_science, int m_maths, int m_english)
  {
    this->m_science = m_science;
    this->m_maths = m_maths;
    this->m_english = m_english;
    total = m_science + m_maths + m_english;
  }
  void putdata()
  {
    cout << endl << "Marks in Science " << m_science
         << endl << "Marks in Maths " << m_maths
         << endl << "Marks in English " << m_english;
  }
};

class student:public person, public result{
  int id;
  string course;
public:
  student(){}
  student(string name, int age, float m_science, float m_maths, float m_english ) :person(name,age), result(m_science, m_maths, m_english)  //calling base class constructors
  {
  }

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
  student s;
  string name;
  int age;
  float m_science, m_maths, m_english;

  cout << endl << "Enter Student name : ";
  getline(cin , name);
  cout << endl << "Enter Student age : ";
  cin >> age;

  cout << endl << "Enter Student Science Marks : ";
  cin >> m_science;
  cout << endl << "Enter Student Maths Marks : ";
  cin >> m_maths;
  cout << endl << "Enter Student English Marks : ";
  cin >> m_english;

  s = student(name, age, m_science, m_maths, m_english);
  s.getdata();

  s.person::putdata();   //calling base class putdata() function
  s.result::putdata();
  s.putdata();

  return 0;
}
