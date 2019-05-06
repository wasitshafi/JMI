//
//
//
//
#include<iostream>
#include<stdlib.h>
using namespace std;

class student{
    int x;
    public:
    void getdata()
    {
        cout << endl << "Enter value of x : ";
        cin >> x;
    }
    void putdata()
    {
        cout << "Value of x is : " << x;
    }

    void* operator new(size_t size)
    {
        void* p = malloc(size);
        cout << endl << "memory created...";
        return p;
    }
    void operator delete(void * p)
    {
        free(p);
        cout << endl << "Memory deleted.";
    }
};

int main()
{
    student *s =new student;
  
    s->getdata();
    s->putdata();
    delete s;

   return 0;
}