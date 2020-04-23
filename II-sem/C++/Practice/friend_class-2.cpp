//
//
//
//
#include<iostream>
#include<stdio.h>
using namespace std;

class person{
	string name;
	int age;
	;
	public:
  friend class student;
};

class student{
	string course;
	int marks;
	person p;
	public:
		void getdata();
		void putdata();
};
void student::getdata()
{
	char buffer[255];
	cout << endl << "Enter name : ";
	getline(cin, p.name);
	cout << "Enter " << p.name << "'s age : ";
	cin >> p.age;
	cout << "Enter student course : ";
	fgets(buffer, sizeof(buffer), stdin);
	getline(cin, course);
	cout << "Enter student marks : ";
	cin >> marks;
}

void student::putdata()
{
	cout << endl << "Name = " << p.name << endl << "Age = " << p.age;
	cout << endl << "Course = " << course << endl << "Marks = " << marks;
}

int main()
{
	student s;

	s.getdata();
	s.putdata();

	return 0;
}
