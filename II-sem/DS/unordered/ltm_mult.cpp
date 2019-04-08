#include<iostream>

using namespace std;

int map(int i, int j)
{
	return ( ( i * ( i + 1 ) / 2) + j );
}

void mult( int *, int *, int* , int n)
{
	
	
}

int main()
{
    int m1[] = { 1,2,3,4,5,6,7,8,9,10};
	int m2[] = {1,2,1,2,1,2,1,2,1,2,1};
	int *m3;
	
	m3 = new int [10];
	
	
	
	for( int i =0 ; i < 4 ; i++ )
	{
		for ( int j = 0 ; j  < 4 ; j++ )
		{
			int sum = 0;
			
			for( int k = 0 ; k <  )
		}
	}
	
	
	
	
   for( int i = 0  ; i < 4 ; i++ )
   {
   	for( int j = 0 ; j < 4 ; j++ )
   	{
   		if( i >= j )
		   {
		   	 cout << m2[map(i , j )] << "\t";
		   }
		   else
		   cout << "0\t";	
	}
 	 cout << endl;
   }
	
	
	
	
	
	
	return 0;
}
