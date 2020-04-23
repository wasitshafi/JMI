//
//
//
//

#include<iostream>
#include<stdio.h>
#include<conio.h>

class LTM{

	int map( int i, int j )
	{
	 return ( ( i * ( i + 1 ) / 2 ) + j );
	}

	public:

	void getmatrix(int*, int);
	void putmatrix(int*, int);

	void add(int *, int *,int *, int);
	void sub(int *, int *,int *, int);
     //	void mult();
	int det(int *, int);
	};

	void LTM::getmatrix(int *arr, int n)
	{
	 int size = ( n * ( n + 1 ) / 2 );

	 for( int i = 0 ; i < size ; i++ )
	  {
	    cout << endl << "Enter element " << i + 1 << " : " ;
	    cin >>  arr[i];
	  }
	}

	void LTM::putmatrix(int *arr, int n)
	{
	  int i, j;

	  cout << endl;

	  for( i = 0 ; i < n ; i++)
	  {
	    for( j = 0 ; j < n ; j++)
	    {
	     if( i >= j )
	       cout << arr[map(i,j)] << "\t";
	     else
	       cout << "0\t";
	   }
	   cout << endl;
	 }
      }

	void LTM::add(int *arr1, int *arr2, int *arr3, int n)
	{
	 int size = ( n * ( n + 1 ) / 2 );
	 for( int i = 0 ; i < size ; i++)
	  arr3[i] = arr1[i] + arr2[i];
	}

	void LTM::sub(int *arr1, int *arr2, int *arr3, int n)
	{
	 int size = ( n * ( n + 1 ) / 2 );
	 for( int i = 0 ; i < size ; i++)
	  arr3[i] = arr1[i] - arr2[i];
	}

	int LTM::det(int *arr, int n )
	{
	 int d = 1;

	 for( int i = 0 ; i < n ; i++ )
	 {
	  d *= arr[map(i,i)];
	 }

	 return d;
	}

int main()
{
	LTM o;

	int *M1, *M2, *a, *s;
	int n, size, detm1, detm2;

	clrscr();
	cout << endl <<"Enter order of square matrix:\t";
	cin >> n;

	M1 = new int[n];
	M2 = new int[n];

	cout << endl << "Enter non-null elements of matrix A:" << endl;
	o.getmatrix(M1, n);

	cout << endl << "Enter non-null elements of matrix B:" << endl;
	o.getmatrix(M2, n);

	clrscr();
	cout << endl << "Matrix A" << endl << endl;
	o.putmatrix(M1, n);

	cout << endl << "Matrix B" << endl << endl;
	o.putmatrix(M2, n);

	o.add(M1, M2, a, n);
	cout << endl << "Matrix A + Matrix B" << endl << endl;
	o.putmatrix(a, n);

	o.add(M1, M2, s, n);
	cout << endl << "Matrix A - Matrix B" << endl << endl;
	o.putmatrix(s, n);





	getch();
	return 0;
}
