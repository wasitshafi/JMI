#include<bits/stdc++.h>
using namespace std;

int main()
{
    string s = "The quick brown fox jumps over to the lazy dog. Tit for tat.";

    if(s.find("ffof") != string::npos)
        cout << endl << "String found as starting index : << " << s.find("ffof");
    else
        cout << "String::npos : '" << s.find("ffof") << "'",
        cout << endl << "String not found.";    

    return 0;
}