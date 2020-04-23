// This Method was suggested to me by Naman Jain on 09-10-2019
// parenthesis_matching_without_stack on 09-10-19
//
// Program to Check for balanced parenthesis in an expression
//
// CTM : In this problem there is no need of storing the opening parenthesis inside stack we can simply use count++ to for simulating that there is something in stack;
// In this approach we simply assumes ex: count = 2 indicates that there are 2 opening parenthesis in stack.
#include<iostream>

using namespace std;
class ParenthesisMatching{
  string str;
public:
  friend istream& operator >>(istream&,ParenthesisMatching&);
  friend ostream& operator <<(ostream&,ParenthesisMatching&);
  bool CheckIsBalanced();
};

  istream& operator >>(istream& input, ParenthesisMatching& p)
  {
    cout << endl << "Enter expression [HINT : use '(' / ')']: ";
    getline(cin, p.str);
  }

  ostream& operator <<(ostream& output, ParenthesisMatching& p)
  {
    cout << endl << "Expression is : ";
    output << p.str;
  }

  bool ParenthesisMatching::CheckIsBalanced()
  {
    int isbalanced = 1, count = 0;

    for(int i = 0 ; i < str.length() ; i++)
    {
      if( str[i] == '(')
       count++;
      else if( str[i] == ')' )
      {
        if(count == 0)     //means ')' is the first instance among parenthesis or after some balanced parenthesis
        {                  // eg 1+2)+3+3----
          isbalanced = 0;  //eg (1+(2+(3+4)+5)+6)+7)+----here after 7 when reading ')' makes it unbalanced by checking value of tos = -1
          break;
        }
       //if(count > 0) // no need to write this if condition as upto this point we know that stack contains some '(' & we also know that we only pushes '(' into stack. Therefore we can decrement tos  directly
         count--;
       }
     }

    if(count > 0 || isbalanced == 0) // means there is some extra opening parenthesis
      return false;
    else
      return true;
 }

int main()
{
   ParenthesisMatching expression;

   cin >> expression;
   cout << expression;

   if(expression.CheckIsBalanced())
    cout << endl << "Balanced Parenthesis.";
   else
    cout << endl << "Unbalanced Parenthesis...!";

  return 0;
}