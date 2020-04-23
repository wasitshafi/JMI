#include<iostream>
using namespace std;

class Test
{
    mutable int x;
    int y;

    public: 
    Test(int x, int y)
    {
        this -> x = x;
        this -> y = y;
    }
    void get()const // CTM : This is constant function so it can't modify any data member of class except mutable data members.
    {
        cout << "x = " << x << "  y = " << y << endl << endl ;
        x++;   // allowed because of mutable 
     // y++;   // error
    }
};

int main()
{
    Test t(10,20);

    t.get();
    t.get();
    t.get();
    
    return 0;
}