#include<iostream>
#include<limits>
using namespace std;

 // ref:  https://www.hackerearth.com/practice/notes/validating-user-input-in-c/
 //       https://stackoverflow.com/questions/5131647/why-would-we-call-cin-clear-and-cin-ignore-after-reading-input
 //       https://www.quora.com/Can-you-explain-cin-ignore-and-cin-clear-for-C-When-is-it-appropriate-to-use-these-How-do-they-affect-the-next-cin
 //       https://stackoverflow.com/questions/25020129/cin-ignorenumeric-limitsstreamsizemax-n
 //       http://www.cplusplus.com/forum/beginner/83109/
 //       https://stackoverflow.com/questions/30569789/to-check-type-of-input-in-c

int main()
{
   int x;
  
  cout << "Enter an integer number : ";
   cin >> x;

   while(1)
   {
     if(cin.fail())
     {
       cin.clear();
       cin.ignore(numeric_limits<streamsize>::max(),'\n');
       cout << "You have entered wrong input"<<endl;
       cout << endl << "Enter an integer number: "; 
       cin >> x;
     }
     if(!cin.fail())
      break;
   }

   cout << endl << "X = " << x;
   return 0;
}