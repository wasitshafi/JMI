//
//jmi_p5.cpp
//
//A program to add time

#include<iostream>
#include<stdio.h>

using namespace std;

class TIME { // CTM : don't use class name as 'time' as it will conflict with built in class
  int hour;
	int minute;
	
	public:
	
	void input();
	void gettime(int, int);
	void sum(TIME, TIME);
	void display();
};
	void TIME::input()
	{
		int h, m;
		cout<< endl << "Enter time ( hh : mm ):\t";
		scanf("%d %*c %d", &h, &m);
		gettime(h, m);
	}
	
	void TIME::gettime(int h, int m)
	{
		hour = h;
		minute = m;
	}
	
	void TIME::sum(TIME t1, TIME t2)
	{
	  hour = t1.hour + t2.hour;
		
	  if( t1.minute + t2.minute >= 60 )
	  {
		 hour += ( t1.minute + t2.minute ) / 60;
		 minute =  ( t1.minute + t2.minute ) % 60;			
	  }
	  else
	    minute = t1.minute + t2.minute;
	}

	void TIME::display()
	{
      cout << hour << " : " << minute;
	}

int main()
{
	TIME t1, t2, t3;

	t1.input();
	t2.input();
	
	t3.sum(t1, t2);

	cout << endl << "T1 = ";
	t1.display();
	cout << endl << "T2 = ";
	t2.display();
	cout << endl << "Sum = ";
	t3.display();
	
	return 0;
}