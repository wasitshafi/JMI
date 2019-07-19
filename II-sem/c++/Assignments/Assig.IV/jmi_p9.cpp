//
//
//
//

#include<iostream>
#include<stdio.h>

using namespace std;

class staff{
protected:
  string name;
  int code;

public:
  void getdata()
  {
    cout << endl << "Enter staff name : ";
    getline(cin ,name);
    cout << "Enter staff Code : ";
    cin >> code;
  }

  void putdata()
  {
    cout << endl << "Staff Name = " << name << endl << "Staff Code = " << code;
  }
};

class faculty:public staff{
  string department;
  string subject_taken;
  string research_area;
public:
  void getdata()
  {
    char buffer[255];

    cout << "Enter dept. name : ";
    fgets(buffer,sizeof(buffer), stdin);
    getline(cin, department);
    cout << "Enter subject taken : ";
    getline(cin, subject_taken);
    cout << "Enter research area : ";
    getline(cin, research_area);
  }
  void putdata()
  {
    cout << endl << "Dept.  = " << department << endl << "Subject  = " << subject_taken << endl << "Research area = " << research_area;
  }
};

class typist:public staff{
  protected:
  string office;
  int speed;
public:
  void getdata()
  {
    char buffer[255];
    cout << "Enter Typist office : ";
    fgets(buffer,sizeof(buffer), stdin);
    getline(cin, office);
    cout << "Enter Typing speed : ";
    cin >> speed;
  }
  void putdata()
  {
    cout << endl << "Typist Office = " << office << endl << "Typing speed = " << speed << "wpm";
  }
};

class officer:public staff{
  string rank;
  char grade;
public:
  void getdata()
  {
    char buffer[255];
    cout << "Enter Officer rank : ";
    fgets(buffer,sizeof(buffer), stdin);
    getline(cin, rank);
    cout << "Enter grade : ";
    cin >> grade;
  }
  void putdata()
  {
    cout << endl << "Officer rank = " << rank << endl << "Grade = " << grade;
  }
};

class permanent:public typist{
  long int salary;
public:
  void getdata()
  {
    char buffer[255];
    cout << "Enter salary : ";
    cin >> salary;
    fgets(buffer,sizeof(buffer), stdin);
  }
  void putdata()
  {
    cout << endl << "Salary = " << salary;
  }
};

class casual:public typist{
  long int salary;
public:
  void getdata()
  {
    char buffer[255];
    cout << "Enter salary : ";
    cin >> salary;
    fgets(buffer,sizeof(buffer), stdin);
  }
  void putdata()
  {
    cout << endl << "Salary = " << salary;
  }
};

int main()
{

  faculty obj_faculty;
  permanent obj_permanent_typist;
  casual obj_casual_typist;
  officer obj_officer;

  cout << endl << "Enter faculty Details : ";
  obj_faculty.staff::getdata();
  obj_faculty.getdata();

  cout << endl << "Enter permanent Typist Details : ";
  obj_permanent_typist.staff::getdata();
  obj_permanent_typist.typist::getdata();
  obj_permanent_typist.getdata();

  cout << endl << "Enter casual Typist Details : ";
  obj_casual_typist.staff::getdata();
  obj_casual_typist.typist::getdata();
  obj_casual_typist.getdata();

  cout << endl << "Enter Officer Details : ";
  obj_officer.staff::getdata();
  obj_officer.getdata();


  cout << endl << endl << endl << "Faculty Details : ";
  obj_faculty.staff::putdata();
  obj_faculty.putdata();

  cout << endl << endl << "Permanent Typist Details : ";
  obj_permanent_typist.staff::putdata();
  obj_permanent_typist.typist::putdata();
  obj_permanent_typist.putdata();

  cout << endl << endl << "Casual Typist Details : ";
  obj_casual_typist.staff::putdata();
  obj_casual_typist.typist::putdata();
  obj_casual_typist.putdata();

  cout << endl << endl << "Officer Details : ";
  obj_officer.staff::putdata();
  obj_officer.putdata();

  return 0;
}
