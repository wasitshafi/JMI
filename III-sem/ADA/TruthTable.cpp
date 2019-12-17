#include<bits/stdc++.h>
#include<math.h>
using namespace std;

int main()
{
	int noOfBits;
	
	cout << "Enter no of bits : ";
	cin >> noOfBits;
	
	int n = pow(2, noOfBits);
	  
	char truthTable[n][noOfBits];
	
	for(int i = 0 ; i < n ; i++)                  //Set all  false
		for(int j = 0 ; j < noOfBits ; j++)
		 	truthTable[i][j] = 'F';
	

	// we are repeatedly taking the remainder and dividing the no. by 2 just in case we do for decimal to binary conversion
	for(int i = 0 ; i < n ; i++)
	{
		int num = i;
		int index = noOfBits - 1;
		
		while(num != 0)
		{
			if(num % 2)
		    	truthTable[i][index] = 'T';
		    num = num / 2;
		    index--;
		}
    } 
    
	cout << "Truth table is : " << endl;
	for(int i = 0 ; i < n ; i++)
	{
		for(int j = 0 ; j < noOfBits ; j++)
		 	cout << truthTable[i][j];
		cout << endl;
    }
    
	return 0;
}