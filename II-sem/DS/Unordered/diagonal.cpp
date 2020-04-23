//diagnoal.cpp
//
//program to implement diagnoal matrix using array
//

#include<iostream>
#include<stdlib.h>
#include<stdio.h>

using namespace std;

class diagonal{
	int *A, *B, *add, *sub, *mul;
	float *A_inv, *B_inv;
	int order;

public:

diagonal(){}
diagonal(int n)
{
A = new int[n];
B = new int[n];
add = new int[n];
sub = new int[n];
mul = new int[n];
A_inv = new float [n];
B_inv = new float [n];

order = n;
}

void getmatrix()
{
cout << endl << "Enter matrix 'A' : ";
for( int i = 0 ; i < order ; i++ )
{
cout << endl << "Enter element arr[" << i + 1 << "]["<< i + 1<<"] :\t";
cin >> A[i];
}
cout << endl << "Enter matrix 'B' : ";
for( int i = 0 ; i < order ; i++ )
{
cout << endl << "Enter element arr[" << i + 1 << "]["<< i + 1<<"] :\t";
cin >> B[i];
}
}
void putmatrix()
{
cout << endl << "MATRIX A" << endl ;
for( int i = 0 ; i < order ; i++ )
{
for( int j = 0 ; j < order ; j++ )
{
if( i == j )
  cout << A[i] << "\t";
else
  cout << "0\t";
}
cout << endl;
}

cout << endl << endl << "MATRIX B" << endl ;
for( int i = 0 ; i < order ; i++ )
{
for( int j = 0 ; j < order ; j++ )
{
if( i == j )
cout << B[i] << "\t";
else
cout << "0\t";
}
cout << endl;
}
}





void addition()
	{

    for( int i = 0 ; i < order ; i++ )
			add[i] = A[i] + B[i];


	  cout << endl << endl << "A + B " << endl ;
		for( int i = 0 ; i < order ; i++ )
		{
			for( int j = 0 ; j < order ; j++ )
              {
                if( i == j )
                  cout << add[i] << "\t";
                else
				cout << "0\t";
              }
             cout << endl;
   	    }
	}

	void subtraction()
			{

        for( int i = 0 ; i < order ; i++ )
					sub[i] = A[i] - B[i];


			  cout << endl << endl << "A - B " << endl ;
				for( int i = 0 ; i < order ; i++ )
				{
					for( int j = 0 ; j < order ; j++ )
	                {
	                  if( i == j )
	                    cout << sub[i] << "\t";
	                  else
						cout << "0\t";
	                }
	               cout << endl;
		   	    }
			}

void multiplication()
	{

    for( int i = 0 ; i < order ; i++ )
			mul[i] = A[i] * B[i];


	  cout << endl << endl << "A - B " << endl ;
		for( int i = 0 ; i < order ; i++ )
		{
			for( int j = 0 ; j < order ; j++ )
              {
                if( i == j )
                  cout << mul[i] << "\t";
                else
				cout << "0\t";
              }
             cout << endl;
   	    }
	}


void inverse()
{


for( int i = 0 ; i < order ; i++ )
A_inv[i] = 1.0 / A[i], 	B_inv[i] = 1.0 / B[i];

cout << endl << endl << "A inverse is :" << endl ;
for( int i = 0 ; i < order ; i++ )
{
for( int j = 0 ; j < order ; j++ )
			{
				if( i == j )
					cout << A_inv[i] << "\t";
				else
cout << "0\t";
			}
		 cout << endl;
}


cout << endl << endl << "B inverse is :" << endl ;
for( int i = 0 ; i < order ; i++ )
{
	for( int j = 0 ; j < order ; j++ )
					{
						if( i == j )
							cout << B_inv[i] << "\t";
						else
		cout << "0\t";
					}
				 cout << endl;
		}
}

void determinant()
{
int d1, d2;

d1 = d2 = 1;

for( int i = 0 ; i < order ; i++ )
     d1 *= A[i], d2 *= B[i];

  cout << endl << "|A| : \t" << d1;
  cout << endl << "|B| : \t" << d2;
}
};

int main()
{
diagonal d;
int choice;
int n;

cout << endl << "Enter order of matrix:\t";
cin >> n;

d = diagonal(n);    // Calling constructor

d.getmatrix();

while(1)
{

system("clear");
cout << endl << "1 => Display.";
cout << endl << "2 => Addition.";
cout << endl << "3 => Subtraction.";
cout << endl << "4 => Multiplication.";
cout << endl << "5 => Inverse.";
cout << endl << "6 => Determinant.";
cout << endl << "0 => Exit.";

cout << endl << "Enter your choice:\t";
fflush(stdin);
cin >> choice;

switch(choice)
{
 case 1:
     d.putmatrix();
     break;
 case 2:
     d.addition();
     break;

 case 3:
    d.subtraction();
    break;

 case 4:
    d.multiplication();
     break;

 case 5:
    d.inverse();
     break;
 case 6:
     d.determinant();
     break;

 case 0:
     exit(EXIT_SUCCESS);
     break;
 default : cout << endl << "Invalid input.....! TRY AGAIN.";

}
//system("PAUSE");

char c;

cout << endl << "Enter char;";
fflush(stdin);
cin >> c;
}
return 0;
}
