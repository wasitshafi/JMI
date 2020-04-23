//
//findCharInStringDatatype.cpp
//
//program to search character in string type datatype 
//
#include<bits/stdc++.h>
using namespace std;

int main()
{
    string str = "Hello world...!";
    size_t found = str.find('l'); 

    cout << endl << "str = \'Hello world...!";

    if (found != string::npos) 
        cout << endl << "Found char 'l' at index " << found ;
    else
        cout << endl << "Not found";

    return 0;
}