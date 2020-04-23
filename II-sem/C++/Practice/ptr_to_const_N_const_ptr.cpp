//
//
//
//

#include<iostream>

using namespace std;

int main()
{
	int x = 10;
	int y = 20;
	
	int z;
	
	int * const ptr1 = &x; //constant pointer now ptr1 can't hold address of any variable
  // not working properly
    int const * ptr2 = &y; // pointer to constant which means now the content of the address which ptr2 holds can't be
	                     // changed i.e : y = 20 can't be changed now 

   cout << endl << "X = " << *ptr1;
   cout << endl << "Y = " << *ptr2;
   
    ptr1 = &z; //error as ptr1 is contant pointer
 //   y = 30; // error as y is constant to pointer so the value of y can't be changed
   cout << y;
   
}
