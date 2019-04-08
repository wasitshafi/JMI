
//there is some error in this prog.


//
//
//program to show movements of disks of tower of hanoi using generic stack
//
#include<iostream>
using namespace std;

template<class T>
class stack{
    public:
    T *arr;
    int length, tos;

    friend class toh;
    stack(int n)
    {
        length = n;
        arr = new T[length];
        tos = -1;
    }
    void push(T item)
    {
      arr[++tos] = item;
    }
    T pop()
    {
      return arr[tos--];
    }
    bool isempty()
    {
      if(tos == -1)
        return true;
      else
        return false;
    }
};

class toh{
	stack <int> s1(100);  
    stack <char> s2(100);
	stack <char> s3(100);
	stack <char> s4(100);
	char s, d, i;  
    public:
    void towerOfHanoi(int n)
    {
        s1.push(n); s2.push('A'); s3.push('B'); s4.push('C'); // s2 === source
        while(s1.isempty() == false)                             // s3 === intermediate
        {                                                     // s4 === destination
            n = s1.pop(); s= s2.pop(); i = s3.pop(); d = s4.pop();
            if(n > 1)
            {
                s1.push(n-1), s2.push(i), s3.push(s), s4.push(d);
                s1.push(1), s2.push(s), s3.push(i), s4.push(d);
                s1.push(n-1), s2.push(s), s3.push(d), s4.push(i);
            }
            else
            cout << endl << "Move disk "  << n << " from "<< s << " to " << d << ".";
        }
    }
};
int main()
{
	int n;

	cout << endl << "Enter no of disks : ";
    cin >> n;

	toh t;
	t.towerOfHanoi(n);

	return 0;
}
