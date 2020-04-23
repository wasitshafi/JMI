//
//
//
//

#include<iostream>

using namespace std;

int main()
{
	int a, b;
	
	cout<< endl << "Enter the value of a:\t";
	cin >> a;
	
	cout << endl << "Enter the value of b:\t";
	cin>> b;
	
	try
	{
	 if(b == 0)
	 throw(b);
	 else
	 cout<< endl << "a / b = " << (float)a / b;	
	} 
	catch(int i)
	{
		cout << endl << "Error occured : Divide By Zero.";
		return -1;
	}
		
 return 0;
}
