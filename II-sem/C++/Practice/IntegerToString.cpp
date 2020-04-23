#include<bits/stdc++.h>
using namespace std;

int main()
{
    int num;
    string s;

    cout << "Enter value of num... ";
    cin >> num;

    while(num)
    {
        s = to_string(num % 10) + s; // or s = (char)((num % 10) + 48) + s;
        num = num / 10;
    }
    cout <<"s : " << s;

    return 0;
}