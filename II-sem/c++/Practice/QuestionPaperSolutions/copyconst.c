#include<iostream>

using namespace std;

class student{
 int rollno;
 string name;

 public :

 student(){} // default constructor used to create objects
 student( student s)
 {
     rollno = rollno;
     name = name;
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

    student s2 = s1; // or s2 = s2(s1)

    cout << endl << "Data are as follows" << endl ;
    s1.print();
    s2.print();
    return 0;
}
