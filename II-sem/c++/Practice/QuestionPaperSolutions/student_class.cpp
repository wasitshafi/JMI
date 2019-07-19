#include<iostream>
#include<stdio.h>
using namespace std;

class student{
 int rollno;
 string name;

 public :

 student(){} // default constructor used to create objects
 student( int rollno, string name)
 {
     this->rollno = rollno;
     this->name = name;
 }
 ~student(){}
 void print()
 {
  cout << endl << "Roll no = " << rollno << "\t Name = " << name;
 }
};

int main()
{
    student s;
    int rollno;
    string name;

    cout << endl << endl << "Enter id:";
    cin >> rollno;
    fflush(stdin);
    cout << endl << "Enter name";
    getline(cin, name);

    s = student( rollno, name );

    cout << endl << "Data are as follows" << endl ;
    s.print();

    return 0;
}
