//
//
//
//
#include<iostream>
#include<fstream>
using namespace std;

int main()
{
    int n;
    string name;
    int id;
    float marks, salary;
    char buffer[255];
     
    cout << endl << "Enter no of student/teacher:";
    cin >> n;
    
    ofstream fout;
    
    fout.open("studentfile.txt");   
    for(int i = 0 ; i < n ; i++)
    {
        fgets(buffer, sizeof(buffer), stdin);
        
        cout << endl << "Enter student name : ";
        getline(cin, name);
        
        cout << "Enter student id : ";
        cin >> id;
        
        cout << "Enter student marks : ";
        cin >> marks;
     
        
        fout << endl << "Name  : " << name;
        fout << endl << "Id    : " << id;
        fout << endl << "Marks : " << marks;
    }
    fout.close();
    

    fout.open("teacherfile.txt");
    for(int i = 0 ; i < n ; i++)
    {
        fgets(buffer, sizeof(buffer), stdin);
        cout << endl << "Enter teacher name : ";
        getline(cin, name);
        
        cout<< "Enter teacher id : ";
        cin >> id;
        
        cout << "Enter teacher salary marks : ";
        cin >> salary;

        fout << endl << "Name   : " << name;
        fout << endl << "Id     : " << id;
        fout << endl << "salary : " << salary;
    }
    fout.close();
    
    char line[80];
    ifstream fin;

    fin.open("studentfile.txt");
    cout << endl << "Student details are as  : "; 
    while(fin)
    {
        fin.getline(line, 80); // or fin.geline(line, sizeof(line)); 
        cout << endl << line;
    }
    fin.close();
     
    fin.open("teacherfile.txt");
    cout << endl << "Teachers details are as : ";
    while(fin)
    {
        fin.getline(line, 80); // or fin.geline(line, sizeof(line)); 
        cout << endl << line;
    }
    fin.close();
    return 0;
}