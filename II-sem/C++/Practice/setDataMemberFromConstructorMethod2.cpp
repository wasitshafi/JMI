#include<iostream>
#include<string>
using namespace std;

class Student{
    string name;
    int rollno;

    public :
    Student(string str, int x) :name(str), rollno(x){}
    void putdata()
    {
        cout << "Name   : " << name << endl << "Rollno : " << rollno << endl;
    }
};
int main()
{
    Student s ("Wasit Shafi", 5);
    s.putdata();
    return 0;
}