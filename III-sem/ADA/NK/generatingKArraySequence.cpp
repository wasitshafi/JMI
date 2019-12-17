// N Karumanchi pg. no 105
#include <iostream>
using namespace std;

void generateSequence(string s, string prefix, int n, int k)
{
    if(n == 0)
        cout << prefix << endl;
    else
    {
        for(int i = 0 ; i < k ; i++)
            generateSequence(s, prefix + s[i], n - 1, k);
    }
}

int main()
{
    int noOfDigits, k;
    string possibilities = "0123456789";

    cout << "Enter no of digits  : ";
    cin >> noOfDigits;
    
    cout << endl;
    cout << "Enter value of k : ";
    cin >> k;

    generateSequence(possibilities, "", noOfDigits, k);
    return 0;
}