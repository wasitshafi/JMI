//
//
//
//
#include<iostream>
#include"new.h"   //NOTE: we have to complie both the files as 'g++ prog.cpp new.cpp' 
using namespace std;

class student{
    string name;
    int rollno;
    public:
    friend istream& operator>>(istream& input, student& s);
    friend ostream& operator<<(ostream& out, student& s);
};
    istream& operator>>(istream& input, student& s)
    {
        cout << endl << "Enter name of student : ";
        getline(cin, s.name);

        cout << "Enter rollno of student : ";
        input >> s.rollno;
    }
    ostream& operator<<(ostream& out, student& s)
    {
        out << endl << "Name : " << s.name << endl << "Roll no : " << s.rollno;
        if(isValidName(s.name))
          cout << endl << "Student is valid name.";
        else
          cout << endl << "Student is invalid name.";

    }
int main()
{
    student std;
  
    cin >> std;
    cout << std;

    return 0;
}