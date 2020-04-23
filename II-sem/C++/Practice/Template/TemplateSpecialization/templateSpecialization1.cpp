//
//templateSpecialization2.cpp
//
//program to show the basics of template specialization
#include<iostream>

using namespace std;

// CTM: here both the function has same name.
template<class T>
print(T arg1, T arg2)
{
    cout << endl << "Type of x will not be char.";
    cout << endl << "Value of x is : " << arg << endl;
}

//  Template specialization for char data type
template<>
void print<char>(char arg)
{
    cout << endl << "Type of arg is char as we are using template specilization function for char datatype.";
    cout << endl << "Value of arg is : " << arg << endl;
}

int main()
{
    print(3);
    print(44.5);
    print("The quick brown fox jumps over to the lazy dog. Tit for Tat.");
    print('c');

    return 0;
}