//
//
//
//
#include<iostream>

using namespace std;

int main()
{
    cout << endl << "1 to 10 = ";
    do{
         int i;
        cout << i++ << " ";
    }while(i <= 10);

    return 0;

/* this programs seems to print values from 1 to 10 but there is an error .The variable i is local variable so its scope
   is only within the curly braces and its used outside the braces in statement 'while(....)' hence there is an error*/

 return 0;
}
