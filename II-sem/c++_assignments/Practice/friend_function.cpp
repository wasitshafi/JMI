//
//
//
//

#include<iostream>
using namespace std;

class B;
class A{
	int x;
	public:
		A()
		{
			x = 10;
		}
		void putdata()
		{
			cout  << endl << "x = " << x;
		}
		friend int sum(A&, B&);
};
class B{
	int y;
	public:
		B()
		{
			y = 30;
		}
		void putdata()
		{
			cout << endl << "y = " << y;
		}
		friend int sum(A&, B&);
};

int sum (A& a, B& b)
{
	int sum;
	sum = a.x + b.y;
	
	return sum;
}

int main()
{
	A obj1;
	B obj2;
	
	obj1.putdata();
	obj2.putdata();

	cout << endl << "sum = " << sum(obj1, obj2);

	return 0;
}
