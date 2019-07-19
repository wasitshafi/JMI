//
//read_str_with_spaces.cpp
//
//program to show various methods to read string with spaces

#include<iostream>
#include<stdio.h>

using namespace std;

int main()
{
    string str1;
    char str2[30];
    char str3[30];
    char str4[30];
    cout << endl << "Enter string : ";
    getline(cin,  str1);
 
    cout << endl << "Enter string : ";
    cin.getline(str2, sizeof(str2));    // or cin.getline( str2, 30 );   

    cout << endl << "Enter string : ";
    fgets( str3, sizeof(str3), stdin);  // or fgets( str3, 30, stdin );
                                        // CTM : This will also append the line feed.
                                                                     
    cout << endl << "Enter string : ";
    scanf("%[^\n]", str4);

    cout << endl << endl;

    cout << endl << "Str1 = " << str1;
    cout << endl << "Str2 = " << str2;
    cout << endl << "Str3 = " << str3;  // str3 = str3 + \n
    cout << endl << "Str4 = " << str4;

    return 0;
}