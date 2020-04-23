//
//
//
//
#include<iostream>
using namespace std;

class STRING{
    string str;
    public:    
    friend istream& operator >> (istream&, STRING&);
    friend ostream& operator << (ostream&, STRING&);
    bool searchString(string s);    
};
    istream& operator >> (istream& input, STRING& s)
    {
        cout << endl << "Enter string :";
        getline(cin, s.str);
        return input;
    }
    
    ostream& operator << (ostream& output, STRING& s)
    {
        cout << endl << "String is  : " << s.str;
        return output;
    }

    bool STRING::searchString(string subString)
    {
        int i, j, k;

        for(i = 0 ; i < str.length() ; i++)
        {
            j = i; // it will point to main string
            k = 0; // it will point to sub string
            while(str[j] == subString[k])
            {
                j++, k++;
                if(k == subString.length())
                {   
                    if(subString.length() == 1)
                     cout << endl << "Sub String found at index " << i + 1;
                    else                    
                     cout << endl << "Sub String found from index " << i + 1  << " to " << i + k << ".";
                    return true;
                }
            }
        }
        return false;
    }

    int main()
    {
        STRING s;
        string subString;

        cin >> s;
        cout << s;

        cout << endl << "Enter string to search : ";
        getline(cin, subString);

        if(!s.searchString(subString))
         cout << endl << "Sub String not found.";

        return 0;
    }