//
//
//
//
#include<iostream>
#include<iomanip>

using namespace std;

class DISTANCE{
    float feet,inches;

    public:

    void getdata();
    void show();
    bool operator < (DISTANCE);
};
void DISTANCE::getdata()
{
    cout << endl << "Enter feet : ";
    cin >> feet;
    cout << "Enter inches : ";
    cin >> inches;
}
void DISTANCE::show()
{
    cout << "Feet = " << feet << "\tInches = " << inches;
}

bool DISTANCE:: operator < ( DISTANCE d)
{
  float d1, d2;

  d1 = feet + inches * 1/12;     //total distance in feets 
  d2 = d.feet + d.inches * 1/12; //total distance in feets
   
    if ( d1 < d2 )
     return true;
    else
     return false;
}

int main()
{
    DISTANCE d1, d2;
    
    d1.getdata();
    d2.getdata();
    
    cout << endl << "D1 : \t";
    d1.show();
    cout << endl << "D2 : \t";
    d2.show();
    
    cout << endl ;
    
    if(d1   < d2) // d1.operator<(d2);
    cout << endl << "d1 < d2 = true";
    else
    cout << endl << "d1 < d2 = false";
    
    return 0;
}