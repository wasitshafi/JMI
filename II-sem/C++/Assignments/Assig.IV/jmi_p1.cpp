//
//
//
//

#include<iostream>
#include<stdio.h>
using namespace std;

class student{
    string name, course;
    int rollno;
    
    public:

    void input_student(int);
    void display_student();
    string getname()
    {
        return name;
    }
};

class exam:public student{
    float marks1, marks2, marks3;

    public:
    void input_marks();
    void display_marks();
};

void student::input_student(int i)
{
    char buffer[255];
    cout << endl << "Enter name of student no " << i << " : ";
    fgets(buffer, sizeof(buffer), stdin); // clearing standard input stream
    getline(cin, name);

    cout << endl << "Enter " << name << "'s rollno : ";
    cin >> rollno;
    
    cout << endl << "Enter " << name << "'s course : ";
    fgets(buffer, sizeof(buffer), stdin); // clearing standard input stream
    getline(cin, course);
}

void student::display_student()
{
  cout << endl << "Name = " << name
       << endl << "Roll no = " << rollno
       << endl << "Course = " << course;
}

void exam::input_marks()
{
    cout << endl << "Enter " << getname() << "'s marks in History : ";
    cin >> marks1;

    cout << endl << "Enter " << getname() << "'s marks in Political Science : ";
    cin >> marks2;
    
    cout << endl << "Enter " << getname() << "'s marks in Urdu : ";
    cin >> marks3;
}

void exam::display_marks()
{
    cout << endl << "History Marks : " << marks1
         << endl << "Political Science Marks : " << marks2
         << endl << "Urdu marks : " << marks3;
}

int main()
{
    int n;

    cout << endl << "Enter no. of students : ";
    cin >> n;

    exam s[n];

    for( int i = 0 ; i < n ; i++ )
    {
        s[i].input_student(i + 1 );
        s[i].input_marks();
        cout << endl << endl;
    }
    
    cout << endl << "Student Details :";

    for( int i = 0 ; i < n ; i++ )
    {
        s[i].display_student();
        s[i].display_marks();
        cout << endl;
    }

    return 0;
}