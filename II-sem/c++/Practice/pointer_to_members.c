//
//
//
//

#include <iostream>

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
    		getline(cin , name);

    		cout << endl << "Enter marks :\t"
    		cin >> marks;
		}

	    void putdata()
	    {
	 	    cout << endl << "ID = "  << id << "\tName = " << name << "\t Marks = \t " << marks;
	    }
};


int main()
{
	student std

	std.getdata();
	std.putdata();

	return 0;
}
