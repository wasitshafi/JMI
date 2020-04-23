//
//
//
//

#include<iostream>
#include<string.h>

class person{
	int age;
	string name;
	
	public:
		void getdata()
		{
			cout << endl << "Enter name :\t";
			gets(name);
			
			cout << endl << "Enter age:\t";
			cin >> age;
		}
		void putdata()
		{
			cout << endl << name << "'s age is " << age; 
		}
};

class student{
	int id;
	float marks;
	int size;
	person* p;
	
	
	public :
		
		student(){ }
		
		student(int n)
		{
			p = new person;
			size = n;
			
		}
		void getdata()
		{
		p->getdata();
			cout << endl << "Enter ID :\t";
		    cin >> id;
			
			cout << endl << "Enter Marks :\t";
			cin >> marks;
		   
		}
		
		void putdata()
		{
		    p->putdata()
			cout << endl << name << "'s age is " << age; 
		
		}
		
};
int main()
{
	
	int n;
	student s;
	
	cout << endl << "Enter no of students:\t";
	cin >> n;
	
	s = s(n);
	
	s.getdata();
	s.putdata();
	
	
	
	return 0;
}
