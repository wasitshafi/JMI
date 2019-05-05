//
//
//
//
#include<iostream>
#include<assert.h>

using namespace std;

int main()
{
	enum color{red, green,yellow,pink,black}; // red == 0 ....black == 4
	enum shape
	{
	 rectangle,
	 triangle,
	 circle = 5,
	 sphere ,
	 square,
	 cube = 10,
	 cone
	}; // now shpere == 6 , square == 7, cone == 11

    enum{x, y, z, w};// they can also be treated as constant variable like const int x = 0, ...
	enum{p = 10, q = 20, r = 30, s }; // similar to cont int p = 10 .... int const s = 31
	
	enum {off, on}; // Anonymous enumeration
	

	
	int val;
	int switch_1;
	int switch_2;
	
	color c;   //creating a variable of enumeration
 	c = green;
 	
	 switch_1 = off;
 	switch_2 = on;
 	
	assert(c == 1);
	assert( green == 1);
	assert(black == 4);
	assert(green == triangle);
	assert(circle == 5);
	assert(sphere == 6);
	assert(cone == 11);
	assert(switch_1 == 0);
	assert(switch_2 == 1);
		  
	cout << endl << "End of main()";
	
	return 0;
}
