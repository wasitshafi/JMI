//
//
//
//
#include<iostream>
using namespace std;

class university{
  string name, dept, person;
public:
  void display();
  void getdata();
};

class company{
  string name;
  int no_of_engineers;
  long int amount_invested;
public:
  void display();
  void getdata();
};

class project:public university, public company{
  string type;
  int duration;
  unsigned long int amount_granted;

public:
  void display();
  void getdata();
};

void university::getdata()
{
  cout << endl << "Enter University Name : ";
  getline(cin, name);
  cout << "Enter Dept. name : ";
  getline(cin, dept);
  cout << "Enter name of person to whome project is assigned : ";
  getline(cin, person);
}

void university::display()
{
  cout << endl <<"University : " << name << endl << "Dept. : " << dept << endl << "Project Assigned to : " << person;
}
void company::getdata()
{
  cout << "Enter name of Company : ";
  getline(cin, name);
  cout << "Enter no. of Engineers working on project : ";
  cin >> no_of_engineers;
  cout << "Enter amount invested yet on project : ";
  cin >> amount_invested;
}
void company::display()
{
  cout << endl << "Company : " << name << endl << "Total no of Engineers : " << no_of_engineers << endl << "Amount Granted : " << amount_invested;
}

void project::getdata()
{
  cout << "Enter Type of Project : ";
  cin >> type;
  cout << "Enter duration of projects in years : ";
  cin >> duration;
  cout << "Enter amount granted : ";
  cin >> amount_granted;
}
void project::display()
{
  cout << endl << " Project type : " << type << endl << " Duration : " << duration << " yrs." << endl << " Amount Granted : " << amount_granted;
}
  int main()
  {
    project p;

    p.university::getdata();
    p.company::getdata();
    p.getdata();

    cout << endl << "Project details are as : " << endl;
    p.university::display();
    p.company::display();
    p.display();

    return 0;
  }
