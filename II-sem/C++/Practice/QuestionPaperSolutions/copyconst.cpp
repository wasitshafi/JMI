#include<iostream>
#include<stdio.h>
using namespace std;

class student{
 int rollno;
 string name;

 public :

 student(){}
 student( student &s)
 {
     rollno = s.rollno;
     name = s.name;
 }
 void getdata()
 {
    cout << endl << endl << "Enter id:";
    cin >> rollno;
    fflush(stdin);
    cout << endl << "Enter name";
    getline(cin, name);
 }
 ~student(){}
 void print()
 {
  cout << endl << "Roll no = " << rollno << "\t Name = " << name;
 }
};
int main()
{
    student s1;

    cout << endl << "Data are as follows" << endl ;

    s1.getdata();

    student s2 = s1 ; // calling copy constructor // or use student s2(s1);

    s1.print();
    s2.print();
    return 0;
}
