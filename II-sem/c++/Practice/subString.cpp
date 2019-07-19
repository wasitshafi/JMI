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
    int search(string subString)
    {
        int i, j, k;
        for(i = 0 ; i < str.length() ; i++)
        {
          j = i;
          for(k = 0 ; str[j] == subString[k] ; k++)
            if(k == subString.length() - 1)
              return i + 1;   // return index of i substring found
            else
              j++;  
        }
        return -1; // sub-string not found;
    }
};
    istream& operator >> (istream& input, STRING& s)
    {
        cout << endl << "Enter string : ";
        getline(cin, s.str);
    }
int main()
{
    STRING s;
    string subString;
    int index;

    cin >> s;
    cout << endl << "Enter sub-string : ";
    getline(cin, subString);

    index = s.search(subString);
    
    if( index == -1)
     cout << endl << "Sub-string not found.";
    else
     cout << endl << "Sub string found from index " << index << ".";
    return 0; 
}