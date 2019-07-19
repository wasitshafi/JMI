//
//
//
//

#include<iostream>
using namespace std;

class balancedparenthesis{
    string str;
    char* stack;
    int tos;

public:
   balancedparenthesis(){}
   balancedparenthesis(int n)
   {
       stack = new char[n];
       tos = -1;
   }
   friend istream& operator >> (istream &, balancedparenthesis &);
   friend ostream& operator << (ostream &, balancedparenthesis &);
   int getlenght();
   int check_balanced();

};

    istream& operator >> (istream &input, balancedparenthesis &exp)
    {
      cout << endl << "Enter expression:\t";
      getline(cin, exp.str); // or use 'input >> b.str;' but then it will not scanf after
                            //space as in that case we have to generate an error ,so we
                           // will stick to getline()
    }

    ostream& operator<<(ostream &output, balancedparenthesis &exp)
    {
      output << endl << "String is as follows :\t" << exp.str;

    }

    int balancedparenthesis::getlenght()
    {
        return str.size();
    }

   int balancedparenthesis::check_balanced()
   {
        for( int i = 0 ; str[i] ; i++ )
         {
           if( str[i] != '(' && str[i] != ')' && str[i] != '{' && str[i] != '}' && str[i] != '[' && str[i] != ']' )
            return -1; // invalid expression
           else if( str[i] == '(' || str[i] == '{' || str[i] == '[' ) // push into stack
            {stack[++tos] = str[i];cout << str[i];}
           else
           {
              if( str[i] != stack[tos] )
               return 0; // unbalanced
              else
               tos--;
           }
         }

        if( tos != -1)
         return 0;     // unbalanced
        else
         return 1;     // balanced
   }

int main()
{
    balancedparenthesis expression;
    int status;
    cin >> expression;
    cout << expression;

    int lenght = expression.getlenght();

    status = expression.check_balanced();

    if( !status )
      cout << endl << "Parenthesis are not balanced.";
    else if ( status  == 1 )
      cout << endl << "Parenthesis are balanced.";
    else
      cout << endl << "Invalid expression...!";

    return 0;
}
