#include<iostream>
#include<vector>
using namespace std;

int main()
{
    string s;

    cout << "Enter String : ";
    getline(cin, s);

    cout << endl << "String : ";   
    for(string::iterator itr = s.begin() ; itr != s.end() ; itr++) cout << *itr;
    
    //   or
    //for( auto itr = s.begin() ; itr != s.end() ; itr++) cout << *itr;

    return 0;
}