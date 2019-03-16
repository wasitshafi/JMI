//
//jmi_p5-b.cpp
//
//C++ program to compare two strings by overloading == operator

#include<bits/stdc++.h>

using namespace std;

class STRING{
     char *str;
     int lenght;

    public:

    STRING(){}
    STRING( char *s )
    {
        lenght = strlen(s);
        str = new char[ lenght + 1]; // + 1 for storing NULL Character
        strcpy(str, s);
    }
    void show();
    int operator ==(STRING s);
};

void STRING::show()
{
    cout << endl << "String = " << str;
}

int STRING::operator ==( STRING s)
{
    return strcmp( str, s.str );
}
int main()
{
    STRING s1, s2;
    char str[100];

    cout << endl << "Enter String1 : ";
    cin.getline(str, sizeof(str));
    s1 = STRING(str);

    cout << endl << "Enter String2 : ";
    cin.getline(str, sizeof(str));
    s2 = STRING(str);
      
    if( !(s1 == s2) )
      cout << endl << "Str1 == Str2 : TRUE";
    else
      cout << endl << "Str1 == Str2 : FALSE";
    
    return 0;
}