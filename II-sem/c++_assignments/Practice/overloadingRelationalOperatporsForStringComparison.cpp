//
//
//
//
#include<iostream>
using namespace std;

class String{
    string str;
    public:
    void get()
    {
        cout << endl << "Enter string : ";
        getline(cin, str);
    }
    void display()
    {
        cout << endl << "String : " << str;
    }
    bool operator < ( String s)
    {
        int sum1, sum2;
        sum1 = sum2 = 0;
        
        for(int i = 0 ; i < str.length() ; i++)
          sum1 += str[i]; 

        for(int i = 0 ; i < s.str.length() ; i++)
          sum2 += s.str[i];
        
        cout << endl << "sum1 = " << sum1;
        cout << endl << "sum2 = " << sum2;


        if( sum1 < sum2)
        return true;
        else
        return false;
    }
    bool operator > ( String s)
    {
        int sum1, sum2;
        sum1 = sum2 = 0;
        
        for(int i = 0 ; i < str.length() ; i++)
          sum1 += str[i]; 

        for(int i = 0 ; i < s.str.length() ; i++)
          sum2 += s.str[i];

        cout << endl << "sum1 = " << sum1;
        cout << endl << "sum2 = " << sum2;


        if( sum1 > sum2)
        return true;
        else
        return false;
    }    
    bool operator = ( String s)
    {
        int sum1, sum2;
        sum1 = sum2 = 0;
        
        for(int i = 0 ; i < str.length() ; i++)
          sum1 += str[i]; 

        for(int i = 0 ; i < s.str.length() ; i++)
          sum2 += s.str[i];

        cout << endl << "sum1 = " << sum1;
        cout << endl << "sum2 = " << sum2;


        if( sum1 == sum2)
        return true;
        else
        return false;
    }
};

int main()
{
    String s1, s2;
    
    s1.get();
    s2.get();

    if(s1 < s2)
     cout << endl << "String1 is less than String2.";
    else
     cout << endl << "String1 is not less than String2.";

    if(s1 > s2)
     cout << endl << "String1 is greater than String2.";
    else
     cout << endl << "String1 is not greater than String2.";

    if(s1 = s2)
     cout << endl << "String1 is equal to String2.";
    else
     cout << endl << "String1 is not equal to String2.";

    return 0;
}