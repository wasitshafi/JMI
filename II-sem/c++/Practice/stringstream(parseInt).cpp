//
//stringstream(parseInt).cpp
//
//program to show how to use stringstream for parsing int;
//
//Q: https://www.hackerrank.com/challenges/c-tutorial-stringstream/problem
//Others : http://www.cplusplus.com/reference/sstream/stringstream/
//         http://www.cplusplus.com/reference/ios/ios/eof/
//
#include<bits/stdc++.h>
using namespace std;

vector<int> parseInts(string str)
{
    vector <int> v;
    int intData;
    char ch;
 
    stringstream ss(str);
    cout << endl << "Value of \'ss.eof()\' is : " << ss.eof();
    while(!ss.eof())
    {
        ss >> intData >> ch;
        v.push_back(intData);
    }
    cout << endl << "Value of \'ss.eof()\' is : " << ss.eof();
 
    return v;
}

int main() {
    string str;
    cout << endl << "Enter string like \"1,22,34,564\" : ";
    cin >> str;
    vector<int> integers = parseInts(str);
    
    cout << endl << "Vector(int) elements are as : ";
    for(int i = 0; i < integers.size(); i++) cout << integers[i] << " ";
    
    return 0;
}