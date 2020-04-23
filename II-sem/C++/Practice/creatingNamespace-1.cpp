#include<iostream>
using namespace std;

namespace fruits {
    void print(string s)
    {
        cout << endl << s;
    }
}
using namespace fruits;
int main()
{
    fruits::print ("fruits are as follows : ");

    namespace f = fruits; // creating alias
    f::print ("apple");
    
    print ("mango"); // since there in no ambiguity in writing directly 'print' although is good practice to use the scope resolution operator
    print ("oragne");

    return 0;
}