//
//jmi_p2.cpp
//
//A program to convert Time into Seconds

#include<bits/stdc++.h>

using namespace std;

class TIME{

	int hh, mm, ss;
	unsigned long int seconds;

    inline void gettotalseconds(){ seconds = hh * 3600 + mm * 60 + ss; }

	public:

	void getdata()
	{
	 cout<<"\nEnter Time (HH:MM:SS):\t";
	 scanf("%d %*c %d %*c %d", &hh,&mm,&ss);
	}

	void putdata()
	{
	 gettotalseconds();
	 cout<< endl <<"Time = " << setw(2) << setfill('0') << hh << ":" << setw(2) << setfill('0') << mm << ":" << setw(2) << setfill('0') << ss;
	 cout<< endl << endl <<"Total Seconds = " << seconds;
	}
};

int main()
{
	TIME t;

	t.getdata();
	t.putdata();

	return 0;
}
