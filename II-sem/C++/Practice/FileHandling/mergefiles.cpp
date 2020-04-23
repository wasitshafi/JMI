//
//
//
//
#include<bits/stdc++.h>
using namespace std;

int main()
{
    char line[80];
    
    ofstream fout;
    fout.open("mergeFile1File2.txt");

    ifstream fin;
    fin.open("file1.txt");
    
    while(fin)
    {
        fin.getline(line,sizeof(line));
        fout << line << endl;
    }
    fin.close();

    fin.open("file2.txt");
    while(fin)
    {
        fin.getline(line,sizeof(line));
        fout << line << endl;
    }
    fin.close();

    fout.close();

    return 0;
}