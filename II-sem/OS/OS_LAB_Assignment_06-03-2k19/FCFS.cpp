//
//
//
//

#include<iostream>
using namespace std;

struct FCFS{
  int burst_time;
  int waiting_time;
  int turn_around_time;
};

int main()
{
  int n, i;
  int sum= 0;

  do{
     cout << endl << "Enter no of process :\t";
     cin >> n;

     if( n < 1) cout << endl << "Invalid Input...! Try Again.";
  }while( n < 1);

  FCFS process[n];

  for(i = 0 ; i < n ; i++ )
  {
   do{
      cout << endl << "Enter Burst time of process no " << i + 1 << " : ";
      cin >> process[i].burst_time;

      if( process[i].burst_time < 1) cout << endl << "Invalid Input...! Try Again.";
   }while(process[i].burst_time < 1);

   process[i].waiting_time = sum;
   sum += process[i].burst_time;
   process[i].turn_around_time = sum;
  }

  cout << endl << "Process no\tBurst Time\tWaiting Time\tTurn around Time";

  for( i = 0 ; i < n ; i++)
   cout << endl << i + 1 << "\t\t" << process[i].burst_time << "\t\t" << process[i].waiting_time << "\t\t" << process[i].turn_around_time;

  return 0;
}
