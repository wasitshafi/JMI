//
//
//
//
#include<iostream>
#include<fstream>
using namespace std;

int main()
{
    string name;
    int id;
    float marks;

    cout << endl << "Enter student name : ";
    getline(cin, name);
    
    cout << "Enter student id : ";
    cin >> id;
    
    cout << "Enter student marks : ";
    cin >> marks;

    ofstream fout("new.txt");

    fout << "Name : " << name;
    fout << endl << "Id : " << id;
    fout << endl << "Marks : " << marks;
    fout.close();

    ifstream fin("new.txt");
    char line[80];
    
    while(fin)
    {
        fin.getline(line, 80);
        cout << endl << line;
    }

    fin.close();
    return 0;
}