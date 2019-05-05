//
//
//
//

#include<iostream>

using namespace std;

class student{
	int id;
	static int count;
    
    public:
    	void getdata()
    	{
    		cout << endl << endl << "Enter id : \t";
    		cin >> id;
    		
    		cout << "Count = " << count++;
	    }		
	    void putdata()
	    {
	 	    cout << endl << "ID = "  << id;
	        student::print_count(); //general member function call call to static member function but static member function can call to on static members
		 }
	    
	    static void print_count()
	    {
	    	cout << "\tCout = " << count; //CTM: static data member is by default initialised to 0 & its shared by all the object of class
		   
		    student::say_hello(); // CTM : we can call only to static data member / member function else there will be an error.
		}
		
		static void say_hello()
		{
			cout << "\thello";
		}
};

int student :: count; // CMT initialized to 0 by default otherwise use int student :: count = n to initialize with n

int main() 
{
	student std[4];
    
	for( int i = 0 ; i < 4 ; i++ ) std[i].getdata();
	cout << endl << endl << "Data are as follows:" << endl;
	for( int i = 0 ; i < 4 ; i++ ) std[i].putdata();
	
     	 
	cout << endl << endl << "#############################" << endl;
	student :: print_count(); // or use std[n].print_count();
		 
	cout << endl << endl << "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" << endl;
	student :: say_hello();
	
	
	return 0;
}
