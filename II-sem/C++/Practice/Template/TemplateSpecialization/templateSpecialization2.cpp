//
//templateSpecialization2.cpp
//
//program to show the basics of template specialization

#include<iostream>
#include<string>
using namespace std;

// CTM: here both the function has same name.
template<class T>
T add(T arg1, T arg2)
{
    return arg1 + arg2;
}

//  Template specialization for string data type
template<>
string add<string>(string arg1, string arg2)
{
    return "\"" + arg1 + " " + arg2 + "\"";
}

//  Template specialization for char data type
template<>
char add<char>(char arg1, char arg2)
{
     return arg1 + arg2;     
}

int main()
{
    cout << "add(2, 3) : " << add(2, 3) << endl;
    cout << "add(2.5, 3.1) : " << add(2.5, 3.1) << endl;

    string s1 = "Hello" , s2 = "World";
    cout << "add(s1, s2) : " << add(s1, s2) << endl;
    // CTM : i was trying to write it as like but that gives an error. why..?: 
    // cout << "add(\"Hello\", \"World\") : " << add("Hello", "World") << endl;

    cout << "add('0' 'a') : " << add('0', 'A') << endl; // '0' => 48 and 'A' =>  65
    return 0;
}