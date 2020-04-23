#include<iostream>
using namespace std;

namespace fruits {
    void print(string s)
    {
        cout << endl << s << ".";
    }
}
namespace vegetables{
    void print (string s)
    {
        cout << endl << s;
    }
}
using namespace fruits; // or we can use them locally...
using namespace vegetables;

int main()
{
    fruits::print ("Fruits are as follows : ");
    fruits::print ("Apple");
    fruits::print ("Mango");
    fruits::print ("Oragne");
//  CTM: Here both the namespaces have the same function name as 'print' so u must use the scope resolution operator otherwise there will be an error
   
    vegetables::print ("\n\nVegetables are as follows : ");
    vegetables::print ("Tomato");
    vegetables::print ("Onion");
    vegetables::print ("Carrot");
    return 0;
}