//
//
//
//
#include<iostream>
using namespace std;

int main()
{
    int num;
/*
    do{
        cout << endl << "Enter number : ";
        cin >> num;

        if(cin.fail())
         cout << "NaN...!"; 
      }while(!cin.fail());
*/

    do{
        cin >> num;
        if(cin.fail())
            cout << "Not a number " << endl;
    }while(!cin.fail());

    cout << "number is " << number << endl;
    cout << endl << "numsdfklsdf = " << num;
}