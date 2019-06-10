//
//
//
//
#include<iostream>
using namespace std;

bool isXpositive(int x)
{
    return (x > 0);
    // or
/*    if (x > 0)
     return true;
    else
     return false;
*/
}
bool isXeven(int x){ return (x % 2 == 0); }

int main()
{
    int x;
    cout << "Enter a positive no : ";
    cin >> x;

    if(isXpositive(x))
      cout << endl << "Yes, " << x << " is a positive number.";
    else
      cout << endl << "No, " << x  << " is not a positive number.";

    cout << endl << endl << "Enter a even no : ";
    cin >> x;

    if(isXeven(x))
      cout << endl << "Yes, " << x << " is a even number.";
    else
      cout << endl << "No, " << x  << " is not a even no number.";

    return 0;
}
