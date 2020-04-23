//
//clearInputStream(readStringAfterInteger).cpp
//
//program to show how to clear clear input stream in c++
//
//ref : https://gist.github.com/jpkrause/4a1aa400d45197ca3253
#include<iostream>
#include<limits>
using namespace std;

int main()
{
    int num;
    string str;

    cout << "Enter integer value : ";
    cin >> num;
//The cin.igonre() statement takes all characters in the input stream and discards them until it reaches a newline character,
// which it then discards as well (see this for more info on cin.ignore()). By using the integral value defined by numeric_limits::max(),
// the ignore call will ignore characters with no limit until it gets to the deliminator or EOF (end of file character). 
// In order to use this value, you must include the limits library.


    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    cout << endl << "Enter string : ";
    getline(cin, str);

    cout << endl << "Integer : " << num;
    cout << endl << "String  : " << str;

    return 0;
}