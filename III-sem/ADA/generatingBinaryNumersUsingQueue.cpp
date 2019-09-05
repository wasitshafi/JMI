//
//generatingBinaryNumberUsingQueue.cpp
//
//program to print binary number from 1 to n
//
//For more info  :  https://www.geeksforgeeks.org/interesting-method-generate-binary-numbers-1-n/

#include<iostream>
#include<queue>

using namespace std;

int main()
{
	int n;
	string front;
    queue <string> q;
	
	cout << "Enter value of n : ";
	cin >> n;

	q.push("1");

    int i = 1;
	while(n--)
	{
		front = q.front(), q.pop();

		cout << i++  << " = " << front << endl;
		
		q.push(front + "0");
        q.push(front + "1");
	}
	
	return 0;
}