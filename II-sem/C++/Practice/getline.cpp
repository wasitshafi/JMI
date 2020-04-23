//
//getline.cpp
//
//program to read a string(line) along with spaces
//
#include<iostream>
using namespace std;

int main()
{
    string str;

    cout << endl << "Enter String : ";
    getline(cin, str);

    cout << endl << "Entered Strings is : " << str;

    return 0;
}