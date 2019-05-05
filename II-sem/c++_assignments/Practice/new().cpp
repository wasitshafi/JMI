//
//
//
//

#include<iostream>

using namespace std;

class student{
	
	char name[20];
	int age;

	public:
	
	void getdata()
	{
	 cout << endl << "Enter name : ";
	 cin >> name;
	 cout << endl << "Enter age : ";
     //fflush(stdin);
	 cin >> age;
   }

	void putdata()
	{
		cout << endl << "Name = " << name << endl << "Age = " << age;
	}
};

int main()
{
	int *p;
	int *arr;
	int n, i;

    student *std;
	
	p = new int;
	
	cout << endl << "Enter an integer :\t";
	cin >> *p;
	
	cout << endl << "Integer is : \t " << *p;

    cout << endl;	
	system("pause");

	system("cls");
		
		
		
		
    cout << endl << "Enter no of elements : \t";
	cin >> n;
	
	try{
	 arr = new int [n];
    }
    catch(bad_alloc ba)
    {
    	cout << endl << "Bad allocation occured....!( Memory allocation error )." ;
	}

	cout << endl << "Enter data :";
	
	for( i = 0 ; i < n ; i++ )
	{
		cout << endl << i + 1 << " > " ; 
		cin >> *( arr + i );	
	}
	
	cout << endl << "Data are as follows :";
	
	for( i = 0 ; i < n ; i++ )
	{
		cout << endl << i + 1 << " > " <<  *(arr + i ) ; 
	}
	
	cout << endl;
	system("pause");
	system("cls");	
		
		
		
		
	std = new student;
	std->getdata();
	std->putdata();

    delete p;
    delete []arr;
    delete std;
    
	return 0;
}
