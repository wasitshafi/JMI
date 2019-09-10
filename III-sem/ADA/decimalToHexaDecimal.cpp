#include<iostream>
using namespace std;

string converToHexaDecimal(int n)
{
    string hex = "";

    while(n>0)
    {
        if(n % 16 < 10)
            hex = to_string(n % 16) + hex; // hex = --- + hex; because we write from bottom to top in conversion although we can also write like hex = hex + ---; but then we have to return the reverse of string.
        else
            hex = (char)((n % 16) + 55) + hex;   //  Why 55 because 65 - 10 = 55 ; 65 is the ASCII for "A" and 10 because for integer 10 we it to be ASCII code of "A" which is 65 so the difference between is 55.
        n = n / 16;
    }    
    return hex;
}
int main()
{
    int n;

    cout << "Enter decimal number : ";
    cin >> n;

    cout << "Hexa-decimal of " << n << " is : " << converToHexaDecimal(n); 

    return 0;
}