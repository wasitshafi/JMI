//
//jmi_p3_1.cpp
//
//A program to add 2 complex numbers by overloading + operator 

#include<iostream>

using namespace std;

class complex{
    
	int real;
	int img;
		
	public:
    
	void getdata();
	void putdata();
	complex operator + (complex);	
};
	void complex::getdata()
	{
		cout << endl << "Enter real part:\t";
		cin >> real;
		cout << "Enter imaginary part:\t";
		cin>>img;
	}	
	
	void complex::putdata()
	{
		if( img == 0)
		 cout<< real; 
		else if( real == 0)
		 cout<< img << "i";
		else if(img < 0)
		 cout<< real << img << "i";
		else
		 cout<< real << " + " << img << "i";		
	}
	
    complex complex ::operator +(complex c1)
	{	
		complex c2;
		c2.real = real + c1.real;
		c2.img = img + c1.img;
	   
	   return c2;
	}
	
int main()
{
	complex c1, c2, c3;
	 
	c1.getdata();
	c2.getdata();
		
	c3 = c1 + c2;    // or c3 = c2.operator+(c1);
	
	cout<< endl << "C1 = ";
	c1.putdata();
	
	cout<< endl << "\nC2 = ";
	c2.putdata();

	cout<< endl << "\nC1 + C2 = ";
	c3.putdata();	

	return 0;
}