// refer : https://www.geeksforgeeks.org/c-string-class-and-its-applications/

#include<iostream>
#include<string>
#include<vector>
using namespace std;

int main()
{
    string s = "The quick brown fox jumps over to the lazy dog tit for tat.";

    // traversal
    for(string::iterator itr = s.begin() ; itr != s.end() ; itr++) cout << *itr;
    cout << endl;
    for(auto itr = s.begin() ; itr != s.end() ; itr++) cout << *itr;
    cout << endl;
    for(int i = 0 ; i < s.length() ; i++) cout << s[i];
    cout << endl;
    for(int i = 0 ; i < s.length() ; i++) cout << s.at(i);


    cout << endl << endl;
    string s1(s);
    cout << endl << "s1 : " << s1;
    cout << endl << "s1.front()          : " << s1.front();
    cout << endl << "s1.rear()           : " << s1.back();
    
    
    cout << endl << endl;
    s1.append(" Hello World...");
    cout << endl << "s1(after appending) : " << s1;


    cout << endl << endl;
    string s2(5, '*'); // CTM : use single quote not double because we have to mention character not string
    cout << endl <<"s2 : '" << s2 << "'(len:" << s2.length() << ")";
    

    // there also a method we return the C style('\0' based) string in string class , its c_str();
    cout << endl << endl;
    const char *s3 = s2.c_str();
    cout << endl << "s2 : " << s2;
    cout << endl << "s3 : ";
    for(int i = 0 ; s3[i] != '\0' ; i++) cout << s3[i];
    
    
    return 0;
}