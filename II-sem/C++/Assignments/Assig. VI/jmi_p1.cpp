//
//
//
//

#include<iostream>
#include<stdlib.h>
using namespace std;

class DIVISION{
    int divident, divisor;
    public:
    void getdata();
    void putdata();
};
    void DIVISION::getdata()
    {
     try
     {
      cout << endl << "Enter divident (Integer): ";
      cin >> divident;
        if(cin.fail()) throw(divident);

      cout << "Enter divisor (Integer): ";
      cin >> divisor;
        if(cin.fail()) throw(divisor);
     }
     catch(int n)
     {
        cout << endl << "Incompitable data...!";
        exit(0);
     }
    }
    
    void DIVISION::putdata()
    {
     try
     {
       if(divisor == 0) throw(divisor);
       
       cout << endl << divident << "/" << divisor << " = " << (float)divident / divisor;
     }
     catch(int z)
     {
        cout << endl << "Divison by zero...!";
        exit(0);
     }
    }

int main()
{
    DIVISION d;

    d.getdata();
    d.putdata();
    
    return 0; 
}