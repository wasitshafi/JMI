//
//
//
//

#include<iostream>

using namespace std;

class person{
	          int id;
	          int age;
	          int marks;
	public:	
		person(){  }                              // default constructor used to create object
		person( int id, int age, int marks = 0 )  // parameterized constructor with default argument
		{
			this->id = id;
			this->age = age;
			this->marks = marks;
		}
		~person(){	}
		
        void putdata()const
        {
      	  cout << endl << "Id = " << id << "\t Age = " << age << "\t Marks = " << marks;
		}
};

int main()
{
	person p1, p2, p3;    //called default constructor
	int id, age, marks;
	
	cout << endl << "Enter id :\t";
	cin >> id;
	cout << "Enter age:\t";
	cin >> age;
	cout << "Enter marks:\t";
	cin >> marks;
	p1 = person(id, age, marks); // parameterized constructor
	
	cout << endl << "Enter id :\t";
	cin >> id;
	cout << "Enter age:\t";
	cin >> age;
	p2 = person(id, age); // parameterized constructor with default argument
		
	p1.putdata();  
	p2.putdata();
	
	return 0;
}
