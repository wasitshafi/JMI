//
//
//
//

#include<iostream>

class A{
	int x;
	
	public:
		void A()
		{
			x = 10;
		}
		void putdata()
		{
			cout  << endl << "x = " << x;
		}
		friend int sum(A, B);
};

class B{
	int y;
	
	public:
		void B()
		{
			y = 30;
		}
		void int putdata()
		{
			cout << endl << "y = " << y;
		}
		friend int sum(A, B);
};

int sum (A a, B b)
{
	int sum;
	sum = A.a + B.b;
	
	return sum;
}

int main()
{
	A obj1;
	B obj2;
	
	obj1.putdata();
	obj2.putdata();

	return 0;
}
