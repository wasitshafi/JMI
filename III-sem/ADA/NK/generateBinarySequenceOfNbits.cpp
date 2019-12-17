#include <iostream>
using namespace std;

void generateBinarySequence(string s, int n)
{
    if( n == 0)
        cout << s << endl;
    else
    {
        generateBinarySequence(s + "0", n - 1);
        generateBinarySequence(s + "1", n - 1);
    }    
}

int main()
{
    int noOfBits;

    cout << "Enter value of n : ";
    cin >> noOfBits;

    generateBinarySequence("", noOfBits);
    return 0;
}