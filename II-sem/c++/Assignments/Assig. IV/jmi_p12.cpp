//
//
//
//
#include<iostream>
#include<string>
#define MIN_PASS_MARKS 100
using namespace std;

class student{
    string name;
    int rollno;
    public:
    void get_details();
    void display_details();
};

class examination:public virtual student{
    float test1;
    float test2;
    public:
    float cal_average();
    void display_average();
};

class extracurricular:public virtual student{
    float painting;
    float music;
    public:
    void get_score();
    void display_total();

};

class result:public examination, public extracurricular{
    float total;
    public:
    void cal_total();
    void comment();
};

void student::get_details()
{
    cout << endl << "Enter name of student :";
    getline(cin,name);

    cout << "Enter roll no of student :";
    cin >> rollno;
}

void student::display_details()
{
    cout << endl << "Name : " << name << endl << "Roll no : " << rollno;
}

float examination::cal_average()
{
    cout << "Test1 = " << test1 << endl << "Test2 = " << test2;
    
}

void examination::display_average()
{
 cout << endl << "Average : " << cal_average();
}

void extracurricular::get_score()
{
    cout << endl << "Enter marks in painting : ";
    cin >> painting;
    cout << endl << "Enter marks in music : ";
    cin >> music;
}

void extracurricular::display_total()
{
 cout << endl << "Total : " << painting + music;
}

void result::cal_total()
{
    cout << "Total Score is : ";
}

void result::comment()
{

}

int main()
{
    result r;

    r.get_details();
    r.get_score();

    r.display_details();
    r.display_average();
    r.display_total();
    r.comment();

    return 0;
}