//
//
//
//
#include<iostream>
#include<fstream>
using namespace std;

int main()
{
    int n = 3;
    char buffer[255];
    string name;

    ofstream fout("new.txt", ios::app); //Opens a file in append mode
    
    for(int i = 0 ; i < n ; i++)
    {
        cout << endl << "Enter name  : ";
        cin >> name;

       fout << endl << name;
         fgets(buffer, 255, stdin);
  
    }
    fout.close();  
  return 0;
}
