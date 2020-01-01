#include <algorithm>
#include <iostream>
using namespace std;

void mySwap(char &s1, char &s2) // call by reference
{
    char s = s1;
    s1 = s2;
    s2 = s;
}

int main()
{
    string s = "Anonymous";
    string sCopy = s;
    
    int i = 1;
    int j = 5;
    
    cout << "s : " << s;
    mySwap(s[i], s[j]);
    cout << endl << "After calling mySwap() 's' : " << s;

    swap(s[i], s[j]);  // STL(algorithm)
    cout << endl << "After calling swap()   's' : " << s;

    return 0;
}