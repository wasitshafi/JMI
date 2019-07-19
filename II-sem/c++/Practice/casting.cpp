//
//
//
//
#include<iostream>
#include<conio.h>
#include<iomanip>

using namespace std;

int main()
{
	int m1, m2, m3, n = 3, sum;
	float avg;
	
	cout<< endl << "Enter marks1 = ";
	cin >> m1;
	
	cout << endl << "Enter marks2 = ";
	cin >> m2;
	
	cout << endl << "Enter marks3 = ";
	cin >> m3;
	
	sum = m1 + m2 + m3 ;
	
	avg = sum /float (n); // (float) sum / n
	
	cout << endl << "Average = " << setprecision(6) << avg;

	return 0;
}
