//
//
//
//

#include<iostream>

using namespace std;
    
int main()
{
 int num;
 
 cout << endl << "Enter integer : \t " ;
 cin >> num;
              // plz refer https://www.geeksforgeeks.org/stdoct-stddec-and-stdhex-in-cpp/
              
 cout << endl << "OCT = " << showbase << oct << num; 
 cout << endl << "HEX = " << showbase << hex << num;
 cout << endl << "Num = " << showbase << num;        // it will still print in hexa decimal untill we change basefield back to decimal
 cout << endl << "Num = " << showbase << dec << num;
 cout << endl << "Num = " << showbase << num;

 return 0;
  	
}
