#include <iostream>
using namespace std;

void generateBinarySequence(string s, string prefix, int n)
{
    if(n == 0)
        cout << prefix << endl;
    else
    {
//        generateBinarySequence(s + "0", n - 1);
//        generateBinarySequence(s + "1", n - 1);
        for(int i = 0 ; i < s.size() ; i++)
            generateBinarySequence(s, prefix + s[i], n - 1);
    }
}

int main()
{
    int noOfBits;
    string possibilities = "01";

    cout << "Enter value of n : ";
    cin >> noOfBits;

    generateBinarySequence( possibilities, "", noOfBits);
    return 0;
}