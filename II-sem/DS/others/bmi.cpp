//bmi.cpp on  19-03-19
//
//program to compute Body mass index
//

#include<iostream>
#include<string.h>

using namespace std;

class person{
	string name;
	int age;
	float height;
  float weight;
 	float bmi;

 	void compute_bmi()
 	{
 	  bmi =  weight / (height * height) * 10000;
	}
	public:
		friend istream& operator >> (istream& , person& );
		friend ostream& operator << (ostream& , person& );
};

istream& operator >> (istream& input, person& p)
{
	cout << endl << "Enter name:\t";
	getline(cin, p.name);

	cout << "Enter age:\t";
	cin >> p.age;

	cout << "Enter height ( in cm ):\t";
	cin >> p.height;

	cout << "Enter weight ( in kg ):\t";
	cin >> p.weight;
}

ostream& operator << (ostream& out, person& p)
{
	 char status[20];
   p.compute_bmi();

	 if( p.bmi < 18.5 )
	  strcpy(status, "Under Weight");
	 else if ( p.bmi < 24.9 )
	  strcpy(status ,"Normal");
	 else if( p.bmi < 29.9)
	  strcpy(status ,"Overweight");
	 else
	  strcpy(status,"Obesity");

	cout << endl << "NAME = " << p.name << endl
	     << "Age = " << p.age << endl
			 << "Weight = " << p.weight
			 << "kg" << endl
			 << "Height = " << p.height << " cm" << endl
			 << "BMI = " << p.bmi << "(" << status << ")";
}

int main()
{
	person p;

  cin >> p;
	cout << p;

	return 0;
}
