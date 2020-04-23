//
//
//
//
#include<iostream>
#include<conio.h>
#include<iomanip>

using namespace std;

void swap(int &x, int &y)
{
	x = x ^ y;
	y = x ^ y;
	x = x ^ y;

}

int main()
{
    int x, y;
    
    int z;
    
    cout << "Enter value of x :\t";
    cin >> x;
    
    cout << "Enter value of y :\t";
    cin >> y;
    
    cout << endl << "Value before swapping:" << endl << "X = " << x << "\t Y = " << y;
    
    swap(x, y);
    cout << endl << "Value after swapping:" << endl << "X = " << x << "\t Y = " << y;
   
    
    
	return 0;	
}
