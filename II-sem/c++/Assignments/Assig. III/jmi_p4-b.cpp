//
//
//
//
#include<iostream>

using namespace std;

class DISTANCE{
    float feet,inches;

    public:

    void getdata();
    void show();
    void operator += (DISTANCE);
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

void DISTANCE:: operator += ( DISTANCE d)
{
    feet += d.feet;
    inches += d.inches;  
}

int main()
{
    DISTANCE d1, d2;
    
    cout << endl << "Enter distance in feet (D1) :\t";
    d1.getdata();
    cout << endl << "Enter distance in feet (D2) :\t";
    d2.getdata();
    
    cout << endl << "D1 : \t";
    d1.show();
    cout << endl << "D2 : \t";
    d2.show();
    
    cout << endl ;
    d1 += d2;
    cout << endl << "D1 : \t";
    d1.show();

    return 0;
}