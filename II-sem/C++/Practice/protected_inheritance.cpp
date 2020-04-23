//
//
//
//
//
//
//
//
#include<iostream>
#include<stdio.h>

using namespace std;

class person{
protected:
  string name;
	int age;
	public:
};

class student:private person{
	string course;
	int marks;
	public:
		void getdata();
		void putdata();
};

void student::getdata()
{
	char buffer[255];

  cout << endl << "Enter name : ";
	getline(cin, name);

  cout << "Enter " << name << "'s age : ";
	cin >> age;

	cout << endl << "Enter student course : ";
	fgets(buffer, sizeof(buffer), stdin);
	getline(cin, course);
	cout << "Enter student marks : ";
	cin >> marks;
}

void student::putdata()
{
  cout << endl << "Name = " << name << endl << "Age = " << age;
	cout << endl << "Course = " << course << endl << "Marks = " << marks;
}

int main()
{
	student s;

	s.getdata();
	s.putdata();

	return 0;
}
