//
//
//
//

#include<iostream>
#include<stdio.h>
using namespace std;

class user{
    string name;
    int age;
public:
    user(string name, int age)
    {
        this->name = name;
        this->age = age;
    }
  public:
    void putdata()
    {
      cout << endl << "Name = " << name << endl << "Age = " << age;
    }
};

class student:public user{
    string course;
    int rollno;
    float m1, m2, m3;
public:
    student(string name, int age):user(name, age){} // calling base class constructor

    void getdata()
    {
      char buffer[255];

        cout << endl << "Enter course name : ";
        fgets(buffer, sizeof(buffer), stdin);
        cin >> course;
        cout << endl << "Enter roll no : ";
        cin >> rollno;
        cout << endl << "Enter marks1 : ";
        cin >> m1;
        cout << endl << "Enter marks2 : ";
        cin >> m2;
        cout << endl << "Enter marks3 : ";
        cin >> m3;
    }
     void putdata()
     {
         float total;
         cout << endl << "Rollno = " << rollno << endl << "Course = " << course;
         total = m1 + m2 + m3;
         cout << endl << "M1 = " << m1
              << endl << "M2 = " << m2
              << endl << "M3 = " << m3
              << endl << "Total = " << total;
     }
};

class teacher:public user{
    string subject_assigned;
    string contact_hour;
public:
    teacher(string name, int age):user(name, age){} // calling base class constructor

    void getdata()
    {
        char buffer[255];
        cout << endl << "Enter subject assigned to teacher : ";
        fgets(buffer, sizeof(buffer), stdin);
        getline(cin , subject_assigned);

        cout << endl << "Enter contact hour of teacher : ";
        getline(cin , contact_hour);
    }

     void putdata()
     {
         cout << endl << "Subject assigned = " << subject_assigned;
         cout << endl << "Contact hour = " << contact_hour;
     }
};

int main()
{
  string name;
  int age;
  char buffer[255];

  cout << endl << "Enter name of Student : ";
  getline(cin , name);
  cout << endl << "Enter age of Student : ";
  cin >> age;

  student s( name, age);
  s.getdata();

  fgets(buffer, sizeof(buffer), stdin);
  cout << endl << "Enter name of Teacher : ";
  getline(cin , name);
  cout << endl << "Enter age of Teacher : ";
  cin >> age;

  teacher t(name, age);
  t.getdata();

  cout << endl << endl << "Student details are as  : " << endl;
  s.user::putdata();
  s.putdata();

  cout << endl << endl << "Teacher details are as  : " << endl;
  t.user::putdata();
  t.putdata();

  return 0;
}
