#include<iostream>
#include<stdio.h>
using namespace std;

class employee{
 int empid;
 string empname;

 public :

 employee(){} // default constructor used to create objects
 employee( int id, string name)
 {
     empid = id;
     empname = name;
 }
 ~employee(){}
 void print()
 {
  cout << endl << "ID = " << empid << "\t Name = " << empname;
 }
};

int main()
{
    employee emp[10];
    int id;
    string name;

    cout << "Enter name & id of 10 employees:" << endl ;

    for( int i = 0 ; i < 3 ; i++ )
    {
        cout << endl << endl << "Enter id:";
        cin >> id;
        fflush(stdin);
        cout << endl << "Enter name";
        getline(cin, name);

        emp[i] = employee( id, name );

    }

    cout << endl << "Data are as follows" << endl ;
    for( int i = 0 ; i < 3 ; i++ )
        emp[i].print();

    return 0;
}
