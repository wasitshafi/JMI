//
//
//
//
#include<iostream>
#include<stdio.h>

using namespace std;

class person{    // Container class
	string name;
	int age;
	public:
		void getdata();
		friend class student;
};

void person::getdata()
{
	cout << endl << "Enter name : ";
	getline(cin, name);
	cout << "Enter " << name << "'s age : ";
	cin >> age;
}

class student{   // Contained Class
	string course;
	int marks;
	public:
		void getdata();
		void putdata();
		void ShowPersonDetails(person& );
};

void student::getdata()
{
	char buffer[255];
	cout << endl << "Enter student course : ";
	fgets(buffer, sizeof(buffer), stdin);
	getline(cin, course);
	cout << "Enter student marks : ";
	cin >> marks;
}

void student::putdata()
{
	cout << endl << "Course = " << course << endl << "Marks = " << marks;
}

void student::ShowPersonDetails(person& p)
{
	cout << endl << "Name = " << p.name << endl << "Age = " << p.age;
}

int main()
{
	person p;
	student s;

	p.getdata();
	s.getdata();

	s.putdata();
	s.ShowPersonDetails(p);

	return 0;
}
