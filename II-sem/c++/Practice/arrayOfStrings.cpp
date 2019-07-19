//
//arrayOfStrings.cpp
//
//program to show how to create array of strings
//
#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n, i;
    cout << "Enter no. of subjects : ";
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    
    string subjects[n];
    for(i = 0 ; i < n ; i++)
     {
         cout << endl << "Enter subject no " << i +1 << " : ";
         getline(cin, subjects[i]);
     } 

    cout << endl << "Subjects are as follows : ";
    for(i = 0 ; i < n ; i++)
        cout << subjects[i] << endl;

    return 0;
}