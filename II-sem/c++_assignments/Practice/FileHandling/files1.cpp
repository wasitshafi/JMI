//
//
//
//
#include<iostream>
#include<fstream>
using namespace std;

int main()
{
    int id, n;
    string name;
    float marks;
    char line[80], buffer[255];

    cout << endl << "Enter no of students : ";
    cin >> n;

    ofstream fout("new.txt");

    for( int i = 1 ; i <= n ; i++)
    {    
        fgets(buffer,sizeof(buffer), stdin);

        cout << endl << "Enter student name : ";
        getline(cin, name);
        
        cout << "Enter student id : ";
        cin >> id;
        
        cout << "Enter student marks : ";
        cin >> marks;

        fout << endl << "Name : " << name;
        fout << endl << "Id   : " << id;
        fout << endl << "Marks: " << marks << endl;
    }
    fout.close();

    cout << endl << endl  << "Student data are as follows : ";
    ifstream fin("new.txt");
    
    while(fin)
    {
        fin.getline(line, 80);
        cout << endl << line;
    }

    fin.close();
    return 0;
}