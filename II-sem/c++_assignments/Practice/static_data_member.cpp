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

		    cout << "Count = " << count;
		    count++; //CTM: static data member is by default initialised to 0 & its shared by all the object of class
		}

	    void putdata()
	    {
	 	    cout << endl << "ID = "  << id << "\t" << "Cout = " << count;
	    }
};

int student :: count; // CMT initialized to 0 by default otherwise use int student :: count = n to initialize with n

int main()
{
	student std[4];

	for( int i = 0 ; i < 4 ; i++ ) std[i].getdata();

	cout << endl << endl << "Data are as follows:" << endl;

	for( int i = 0 ; i < 4 ; i++ ) std[i].putdata();

	return 0;
}
