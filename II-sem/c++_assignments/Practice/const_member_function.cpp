//
//
//
//

#include<iostream>
using namespace std;

class student{
	int id, age;
	public :
		void getdata()
		{
			cout << "Enter id : \t";
			cin >> id;

			cout << "Enter age : \t";
			cin >> age;
		}

		void putdata()const // if a constant member function try to alter data member the it will generate an error.
		{
			cout << endl << "Id = " << id << "\t Age = " << age ;
          //age++;           // it will be error
		}
};
int main()
{

	student s;

	s.getdata();

	s.putdata();

	return 0;
}
