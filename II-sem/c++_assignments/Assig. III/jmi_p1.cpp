//
//jmi_p1.cpp
//
//C++ program to check whether a number is even or odd by overloading ! operator

#include<iostream>

using namespace std;

class number{
	int num;
	
	public:
		void getdata()
		{
			cout << endl << "Enter a number : \t";
			cin >> num;
		}
		int operator!()
		{
			if(num % 2 == 0)
			return 1;
			else
			return 0;
		}
		
 		inline int getNum()
		{
			return num;
		}
};

int main()
{
    number n;
	
	n.getdata();
	
	if(!n)
	cout << endl << n.getNum() << " is Even.";
	else
	cout << endl << n.getNum() << " is Odd.";
	
	return 0;
}
