//
//jmi_p2.cpp
//
//Program to check whether a number is prime or compositer by overloading -- operator

#include<iostream>
#include<math.h>

using namespace std;

class number{
	int num;
	
	public:
		void getdata()
		{
			cout << endl << "Enter a number : \t";
			cin >> num;
		}
		int getnum()
		{
			return num;
		}
		int operator--()
		{
			int is_prime = 1;
			
			for(int i = 2 ; i <= sqrt(num) ; i++)
			{
				if( num % i == 0)
				{
				 is_prime = 0;
				 break ;
			    }
	        }
			return is_prime;
		}
};

int main()
{
    number n;
	
	n.getdata();
	
	if(--o)
	cout << endl << o.getnum() << " is Prime.";
	else
	cout << endl << o.getnum() << " is Composite.";
	
	return 0;
}
