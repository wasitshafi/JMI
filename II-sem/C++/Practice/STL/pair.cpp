#include<bits/stdc++.h>
using namespace std;

int main()
{
	pair<int, string> p;
	pair<int, pair<float, string>> p2;
	pair<pair<float, string>, char> p3;
	vector<pair<int, string>> v;
	pair<int, string> temp;

	p.first = 2;
	p.second = "hello World";

	p2.first = 22;
	p2.second.first = 22.4;
	p2.second.second = "i love cpp";
	
	p3.first.first = 222.44;
	p3.first.second = "i love java more than cpp";
	p3.second = 'c';

	cout << "p.first : " << p.first << "\tp.second : " << p.second;
	cout << "\np2.first : " << p2.first << "\tp2.second.first : " <<  p2.second.first << "\tp2.second.second : " << p2.second.second;
	cout << "\np3.first.first : " << p3.first.first << "\tp3.first.second : " <<  p3.first.second << "\tp3.second : " << p3.second;
	
	temp.first = 11;
	temp.second = "the";
	v.push_back(temp);

	temp.first = 22;
	temp.second = "quick";
	v.push_back(temp);

	temp.first = 33;
	temp.second = "brown";
	v.push_back(temp);

	temp.first = 44;
	temp.second = "fox";
	v.push_back(temp);

	temp.first = 55;
	temp.second = "jumps";
	v.push_back(temp);

	cout << "Vector Elements are as : \n"; 
	for(auto itr = v.begin() ; itr != v.end() ; itr++) cout << itr->first << "\t" << itr->second << "\n"; // as itr holds the address so we have to use address of operator '->' 
	return 0;
}