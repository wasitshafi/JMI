//
//
//
//

#include<iostream>

using namespace std;
class person{
	int age;
	int id;
	
	public:
		
		person()                 // default constructor
		{
			age = 33;
			id = 333;
		}               
		person(int age, int id)  // parameterized constructor
		{
			this->age = age;
			this->id = id;
		}
		person(person &p)         // copy constructor N call by reference
		{
			this->age = p.age;
			this->id = p.id;
		}
		~person(){   }

        void putdata()
        {
      	    cout << endl << "Age = " << age << "\t Id = " << id;
	    }
};

int main()
{
	person p1;          // default constructor 
	person p2(44, 444); // parameterized constructor
	person p3(p2);      // copy constructor
	person p4 = p1;     // copy constructor
	
	p1.putdata();
	p2.putdata();
	p3.putdata();
	p4.putdata();
		
	return 0;
}
