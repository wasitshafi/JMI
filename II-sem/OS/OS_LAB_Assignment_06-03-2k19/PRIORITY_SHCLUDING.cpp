//
//
//
//

#include<iostream>
using namespace std;

struct priority_scheduling{
 int p_id;
  int burst_time;
  int waiting_time;
  int turn_around_time;
  int priority;
};

int main()
{
  int n, i, j, temp;
  int sum= 0;

  do{
     cout << endl << "Enter no of process :\t";
     cin >> n;

     if( n < 1) cout << endl << "Invalid Input...! Try Again.";
  }while( n < 1);

  priority_scheduling process[n];

  for(i = 0 ; i < n ; i++ )
  {
    process[i].p_id = i + 1;
    do{
       cout << endl << "Enter Burst time of process no " << i + 1 << " : ";
       cin >> process[i].burst_time;

       if( process[i].burst_time < 1) cout << endl << "Invalid Input...! Try Again.";
      }while(process[i].burst_time < 1);

     do{
        cout << "Enter Priority(Highest Priority : 1) of process no " << i + 1 << " : ";
        cin >> process[i].priority;

        if( process[i].priority < 1) cout << endl << "Invalid Input...! Try Again.";
       }while(process[i].priority < 1);
  }

  cout << endl << "Unsorted data are as :";
  cout << endl << "Process no\tBurst Time\tPriority\tWaiting Time\tTurn around Time";

    for( i = 0 ; i < n ; i++)
     cout << endl << process[i].p_id << "\t\t" << process[i].burst_time << "\t\t" << process[i].priority  << "\t\t" << process[i].waiting_time << "\t\t" << process[i].turn_around_time;


/*########### SORTING ##############*/
    for( i = 0 ; i < n - 1 ; i++)
    {
     for( j = 0 ; j < n - i -1 ; j++)
     {
      if( process[j].priority > process[j + 1].priority)
      {
       temp = process[j].priority;
       process[j].priority = process[j + 1].priority;
       process[j + 1].priority =temp;

       temp = process[j].burst_time;
       process[j].burst_time = process[j + 1].burst_time;
       process[j + 1].burst_time = temp;

       temp = process[j].p_id;
       process[j].p_id = process[j + 1].p_id;
       process[j + 1].p_id = temp;
      }
     }
    }
 /*###################################*/

 for( i = 0 ; i < n ; i++)
 {
  process[i].waiting_time = sum;
  sum += process[i].burst_time;
  process[i].turn_around_time = sum;
 }
 cout << endl << "Sorted data are as :";
 cout << endl << "Process no\tBurst Time\tPriority\tWaiting Time\tTurn around Time";

   for( i = 0 ; i < n ; i++)
    cout << endl << process[i].p_id << "\t\t" << process[i].burst_time << "\t\t" << process[i].priority  << "\t\t" << process[i].waiting_time << "\t\t" << process[i].turn_around_time;

   return 0;
}
