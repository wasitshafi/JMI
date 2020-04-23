//
//
//
//
//
#include<iostream>
#include<limits>
using namespace std;
template <typename T>
class print
{
    T x;
    public:

    void getdata()
    {
        cin >> x;
    }

    void putdata()
    {
        cout << x;
    }
};
// Template sepcialization class for string.
template <>
class print <string>
{
    string x;
    public:

    void getdata()
    {
        getline(cin, x);
    }
    void putdata()
    {
        cout << x;
    }
};

int main()
{
    print <int> objI;
    print <float> objF;
    print <double> objD;
    print <char> objC;
    print <string> objS;

    cout << "Enter value (int) : ";
    objI.getdata();

    cout << "Enter value (float) : ";
    objF.getdata();

    cout << "Enter value (double) : ";
    objD.getdata();

    cout << "Enter value (char) : ";
    objC.getdata();

    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    cout << "Enter value (String) : ";
    objS.getdata();


    cout << endl << "Data are as :";
    cout << endl << "objI = "; objI.putdata();
    cout << endl << "objF = "; objF.putdata();
    cout << endl << "objD = "; objD.putdata();
    cout << endl << "objC = "; objC.putdata();
    cout << endl << "objS = "; objS.putdata();

    return 0;
}