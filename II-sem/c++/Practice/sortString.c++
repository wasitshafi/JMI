#include <iostream>
using namespace std;

void my_swap(char &c1, char &c2)
{
    char c = c1;
    c1 = c2;
    c2 = c;
}

int main()
{
    string s;

    cout << "Enter string : ";
    getline(cin, s);

    cout << "Before Sorting : '" << s << "'";
    for(int i = 0 ; i < s.length() ; i++)
    {
        for(int j = 0 ; j < s.length() - i - 1 ; j++)
            if( s[j] > s[j + 1])
                my_swap(s[j] , s[j+1]);
    }
    cout << endl << "After Sorting : '" << s << "'";
    return 0;
}