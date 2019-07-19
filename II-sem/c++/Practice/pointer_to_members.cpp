//
//
//
//
//
#include <iostream>
#include<stdio.h>

using namespace std;

class student{
	int id;
    char name[20];

    public:
        int marks;

    	void getdata()
    	{
    		cout << endl << "Enter id :\t";
    		cin >> id;

    		cout << endl << "Enter name :\t";
    		fflush(stdin);

    		gets(name);

    		cout << endl << "Enter marks :\t";
    		cin >> marks;
		}

	    void putdata()
	    {
	 	    cout << endl << "ID = "  << id << endl << "Name = " << name << endl << "Marks = \t " << marks;
	       int student::* ptr = &student :: id;
	        cout << endl <<
	    }
};

int main()
{
	student std;



	std.getdata();
	std.putdata();

	return 0;
}
