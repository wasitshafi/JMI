//
//
//
//

#include<iostream>
#include<string.h>

using namespace std;

class  railway_time{                 //  00:00:00 to 23:59:59  OR t 01:00:00 to 12:59:59
    int h, m, s;
public:
  void getdata();
  void putdata();
  operator civil_time()
  {
    civil_time ct;
    ct.h = h;
    ct.m = m;
    ct.s = s;
    ct.time_period = "am";

  }

};

void railway_time::getdata()
{
  do{
    cout << endl << "Enter Hour : ";
    cin >> h;
    cout << "Enter Minutes : ";
    cin >> m;
    cout << "Enter Seconds : ";
    cin >> s;

    if( h < 0 || m < 0 || s < 0 || h > 23 || m > 59 || s > 59  )
     cout << endl << "Invalid Input...! Try Again.";
   }while( h < 0 || m < 0 || s < 0 || h > 12 || m > 59 || s > 59 );
}

void railway_time::putdata()
{
  cout << endl << "Time = " << h << ":" << m << ":" << s;
}

class  civil_time{                 //  00:00:00 to 23:59:59  OR t 01:00:00 to 12:59:59
    int h, m, s;
    string time_period;
public:
  void putdata();
  friend class railway_time;
};
void civil_time::putdata()
{
  cout << endl << "Time = " << h << ":" << m << ":" << s << time_period;
}


int main()
{
  railway_time rt;
  civil_time ct

  rt.getdata();
  ct = rt;

  rt.putdata();
  ct.putdata();

  return 0;
}
