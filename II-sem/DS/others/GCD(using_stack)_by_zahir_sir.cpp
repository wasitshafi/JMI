#include<iostream>
#include<stdio.h>

using namespace std;

template <class T>      //using tempelate class
class stack{
	T *a;
	int lenght,tos;
	
	public:
		stack(int n){
			lenght = n;
			a = new T[n];
			tos = -1;
		}
		
		bool isempty();
		int getsize();
		void push(T x);
		T pop();
		void display();
	};
	
	
	
	
template <class T>
bool stack<T> :: isempty(){
	if(tos == -1)
	return true;
	else
	return false;
}




template <class T>
int stack<T>::getsize(){
	return tos+1;
}

template<class T>
void stack<T>::push(T x){
	a[++tos] = x;
}

template<class T>
T stack <T>::pop(){
	return a[tos--];
}

template<class  T>
void stack<T>::display(){
	cout << "[";
	for(int i = tos ; i >= 0 ; i--)
	cout << a[i] << ", ";
	cout << "\b\b";
}


int gcd(int m, int n){
	stack<int>s1(1), s2(1);
	s1.push(m);
	s2.push(n);
	
	while(s1.isempty() == false)
	{
		m = s1.pop();
		n =s2.pop();
		
		if(m%n != 0)
		{
			s1.push(n);
			s2.push(m%n);
		}
	}
			return n;
}
	
int main()
{
	int a =12, b = 18;
	
	cout << gcd(a,b);
	return 0;
}
