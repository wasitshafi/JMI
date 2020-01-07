#include<iostream>
#include<typeinfo>
using namespace std;

typedef int INT;
typedef float FLOAT;
typedef double DOUBLE;
typedef string STRING;

int main()
{
	INT intVar = 10;
	FLOAT floatVar = 20.55;
	DOUBLE doubleVar = 60.55555;
	STRING stringVar = "Hello World";

    
    int intVar2 = 10;
	float floatVar2 = 20.55;
	double doubleVar2 = 60.55555;
	string stringVar2 = "Hello World";

    cout << "With typedef : ";
	cout << endl << typeid(intVar).name();
	cout << endl << typeid(floatVar).name();
	cout << endl << typeid(doubleVar).name();
	cout << endl << typeid(stringVar).name();

	cout << endl << endl << "Without typedef : ";
	cout << endl << typeid(intVar2).name();
	cout << endl << typeid(floatVar2).name();
	cout << endl << typeid(doubleVar2).name();
	cout << endl << typeid(stringVar2).name();
		
	return 0;
}