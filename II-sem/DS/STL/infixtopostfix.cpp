//infixtopostfix.cpp on 21-03-19
//
//Program to implement convert infix expression to postfix expression
//
#include<iostream>
#include<stdlib.h>
#include<stdio.h>
#include<stack>

using namespace std;

class INFIX{
  string infix, postfix; // used to store infix and postfix expressions
  stack <char> s;
  bool isoperator(char);
  int priority(char);
public:
 friend istream& operator >> (istream&, INFIX&);
 friend ostream& operator << (ostream&, INFIX&);
 void convet_to_postfix();
};

istream& operator >> (istream& input, INFIX& e)
{
  cout << endl << "Enter infix expression : ";
  getline(cin,e.infix);
}

ostream& operator << (ostream& out, INFIX& e)
{
  out << endl << "Infix expression = " << e.infix;
  out << endl << "Postfix expression = " << e.postfix;
}

void INFIX::convet_to_postfix()
{
  postfix ="";

  for(int i = 0 ; i < infix.size() ; i++)
  { 
    if(infix[i] != '(' && infix[i] != ')' && !isoperator(infix[i]))
     postfix += infix[i];
    else
    {
        if(infix[i] == '(')
          s.push(infix[i]);
        else if(infix[i] == ')')
        {
            while(s.top() != '(')  // we assume the parenthesis is balanced as i.e. if closing parenthesis come 
              postfix += s.top(), s.pop(); // their must be an opening parenthesis in stack so we can pop elements without checking  whether a stack has any element in it or not.
          s.pop();  // removing '('
        }
        else if(isoperator(infix[i]))
        {
              if( s.size() == 0 || s.top() == '(')
                s.push(infix[i]);
              else if(priority(infix[i]) > priority(s.top()))//stack may be empty then how to get  'priority(top())'
                s.push(infix[i]);                                        // so its better to write it seperately after verifying stack in not empty
              else
              {
                  while(s.size() > 0 && priority(infix[i]) <= priority(s.top()))
                    postfix += s.top(), s.pop();
                s.push(infix[i]);
              }
        }
      }
  }
  while(s.size() > 0)
    postfix += s.top(), s.pop();
}

bool INFIX::isoperator(char c)
{
  if(c == '^' || c == '/' || c == '*' || c == '+' || c == '-')
  return true;
  else
  return false;
}

int INFIX::priority(char op)
{
  switch(op)
  {
    case '^' : return 3; break;
    case '*' : return 2; break;
    case '/' : return 2; break;
    case '+' : return 1; break;
    case '-' : return 1; break;
  }
}

int main()
{
  INFIX exp;
  char choice;
  char buffer[255];

  do{
     cin >> exp;
     exp.convet_to_postfix();
     cout << exp;

     cout << endl << "Do you want to continue y/n : ";
     cin >> choice;
     fgets(buffer, sizeof(buffer), stdin);

   }while(choice == 'y' || choice == 'Y');

  return 0;
}
