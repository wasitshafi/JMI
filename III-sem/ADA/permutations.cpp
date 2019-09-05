//
//permutation.c
//
//program to print all permutations(string must contain unique characters for this algo.)
//
#include<bits/stdc++.h>

using namespace std;

void permutations(string s, int l, int r)
{
	if(l == r)
		cout << s << endl;
	else
	{
		for(int i = l ; i <= r ; i++)
		{
			swap(s[l], s[i]);
			permutations(s, l+1 , r);
			swap(s[l], s[i]);    // backtrack
		}
	}
}

int main()
{
	string s;

	cout << "Enter string : ";
	cin >> s;

	cout << endl << "Permutations of \"" << s << "\" are as : " << endl;
	permutations(s, 0, s.length()-1);
	
	return 0;
}