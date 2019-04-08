//
//
//
//

#include<iostream>
#include<stdlib.h>

using namespace std;

class pattern{
	int *arr;
  int length;
	int size;
  int n;
public:

	pattern(int n)
	{
		length = (n * ( n + 1)) / 2;
		arr = new int [length];
		this->n = n;
		size = 0;
	}

	int getsize()
	{
		return size;
	}

	void insert(int item, int index)
	{

	 if( index < 0 || index > getsize() )
	 {
		 cout << endl <<"Invlaid index in Insertion.";
		 exit(1);
	 }
	 else
	 {

		for( int i = getsize() - 1 ; i >= index ; i-- )
		{
			arr[ i + 1 ] = arr[i];
			cout << "*";
		}
		arr[index] = item;
		size++;
	}
}

	void getpattern()
	{
		for( int i = 1 ; i <= n ; i++ )
		{
			for( int j = 1 ; j <= i ; j++ )
			{
				insert(i,0); // insert(item,index)with this we will obtain minimun no of movements
			}
			cout << "\t";
		}
	}

	void putpattern()
	{
    for( int i = 0 ; i < length ; i++ )
		{
			cout << arr[i] << "  ";
		}
	}
};

int main()
{
	int n;

  do{
	   cout << "Enter value of n : ";
	   cin >> n;

		 if( n < 1 ) cout << endl << "Invalid input...! Try Again.";
		}while( n < 1 );

	pattern p(n);

  p.getpattern();
  p.putpattern();


	return 0;
}
