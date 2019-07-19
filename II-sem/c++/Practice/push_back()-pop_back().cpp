//
//
//
//

#include<iostream>
#include<stdlib.h> // for exit()
#include<stdio.h>  // for getchar()
using namespace std;

void clearstdin()
{
  char buffer[255];
  fgets(buffer, sizeof(buffer), stdin);
}

// pop_back works only in c++11 so i make an alternate for that
void pop(string& str)
{
 if(str.length() > 0)
   str.resize(str.length() -1);
}

int main()
{
  string str;
  int choice;

  cout << endl << "Enter string : ";
  getline(cin, str);

  while(1)
  {
    cout << endl << endl << "  1 -> Push character";
    cout << endl << "  2 -> Pop character";
    cout << endl << "  0 -> Exit";
    cout << endl << " -1 -> Clear screen";
    cout << endl << endl << "  Enter your choice : \t";
    cin >> choice;

    switch(choice)
    {
      case 1: char ch;
              cout << endl << "Enter char : ";
              clearstdin();
              ch = getchar();
              cout << endl << "String before push() is : " << str;
              push_back(ch);
              cout << endl << "String after push() is  : " << str;
              break;

      case 2: cout << endl << "String before pop() is : " << str;
              pop(str) // CTM: pop_back() works on in c++11
              cout << endl << "String after pop() is : " << str;
              break;

      case 0: exit(EXIT_SUCCESS);
              break;

      case -1:system("clear");
              break;

      default:cout << "Invalid choice, Please enter correct choice...!";
    }
  }
  return 0;
}
