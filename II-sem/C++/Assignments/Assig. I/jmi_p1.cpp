//
//jmi_p1.cpp
//
//c++ program to find largest among three number using inline function

#include<iostream>

using namespace std;

inline int largest(int x, int y, int z)
{
	int result;
	
	if(x > y)
	{
		if(x > z)
		 result  = x;
		else
		 result = z;
	}
	else if (y > z)
	  result = y;
	 else
	  result = z;
	
  return result;
}

int main()
{
	int x, y, z;
	
	cout << endl << "Enter value of x: ";
	cin >> x;
	
	cout << endl << "Enter value of y: ";
	cin >> y;
	
	cout << endl << "Enter value of z: ";
	cin >> z;
	
	cout << endl << "Largest = " << largest(x, y, z);
	
	return 0;
}
