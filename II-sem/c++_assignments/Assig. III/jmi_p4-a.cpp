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
    void operator < (DISTANCE);
};
void DISTANCE::getdata()
{
    cin >> feet;
    inches =  feet * 12;
}
void DISTANCE::show()
{
    cout << "Feet = " << feet << "\tInches = " << inches;
}

void DISTANCE:: operator < ( DISTANCE d)
{
    if ( feet < d.feet )
      cout << endl << "D1 is less than D2.";
    else if ( d.feet < feet )
      cout << endl << "D2 is less than D1.";
    else
      cout << endl << "Both distance are same.";    
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
    d1 < d2 ;// d1.operator<(d2);

    return 0;
}