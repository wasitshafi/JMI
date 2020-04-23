//
//
//
//
#include<iostream>
using namespace std;

class error{
    int err_code;
    string err_desc;
    public:
    error(int err_code, string err_desc)
    {
        this->err_code = err_code;
        this->err_desc = err_desc;
    }
    void err_details()
    {
        cout << endl << "Error code : " << err_code << endl << "Error description : " << err_desc;
    }
};
int main()
{
    int divisor, divident;

    cout << endl << "Enter divident : ";
    cin >> divident;
    cout << endl << "Enter divisor : ";
    cin >> divisor;

    try
    {
     if(divisor == 0)
      throw error(-1, "Division by 0");
     else
      cout << endl << divident << "/" << divisor << " = " << divident/divisor; 
    }
    catch(error e)
    {
        cout << endl << "Exception caught.....!";
        e.err_details();
    }
    return 0;
}
