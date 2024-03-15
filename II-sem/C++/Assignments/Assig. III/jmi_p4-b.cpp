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
    
    if(inches+d.inches >=12){  //if total inches is greater than 12
        feet+=(inches + d.inches)/12; //add the remaining inches into feet
        d.inches = d.inches % 12;  //curtail the inches value if above 12
        inches = inches % 12;
        inches = (inches + d.inches) % 12; //add the inches value
    }
    else{
    inches += d.inches;
    }
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
