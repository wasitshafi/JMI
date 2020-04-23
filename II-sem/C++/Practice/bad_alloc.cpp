//
//
//
//

#include<iostream>
#include<assert.h>
using namespace std;

int main()
{
	unsigned int size;
    int *arr;
	
	cout << endl << "Enter no of elements [ 1 <= size <= 18,446,744,073,709,551,615 ] : \t" ;// Range of unsigned long long int is 0 to 2 ^ 64 -1
	cin >> size;
	assert(size != 0);

	try
	{
		arr = new int[size]; // In c malloc/calloc simple return null its not able to allocate memory
	}
	catch(bad_alloc ba)
	{
		cout << endl <<"Bad allocation occured...!Memory error." ; 
	 	return -1; 
	}

    cout << endl << endl << "Memory allocation successful";
    cout << endl << "Sizeof(int) = " << sizeof(int) ;
	cout << endl << "Starting address = " << arr << "  End address = " << arr + size;
    
    return 0;
}