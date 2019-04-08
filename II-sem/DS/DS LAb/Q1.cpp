//
//
//
//
#include<iostream>
#include<stdlib.h>

using namespace std;

class array{
    int *arr, length, size;

public:
    array( int n)
    {
        arr = new int [n];
        this->size = n;
        length = n;
        size = -1;
    }
    void insert( int x)
    {
        if(size == length - 1)
         cout << endl << "array is full";
        else
        {
            size ++;
            arr[size] = x;
        }
    }
    void display()
    {
        for(int i = 0 ; i <= size ; i++)
        {
          cout << arr[i] << " ";
        }
    }
    int getsize()
    {
        return size + 1;
    }

    bool isempty()
    {
        if(size == 0)
         return true;
        else
         return false;
    }
};

int main()
{
    int n, x, choice;
    cout << endl << "enter no of elements : ";
    cin >> n;

    array a(n);

    while(1)
    {
    cout << endl << endl << "  1 -> insert()";
    cout << endl << "  2 -> isempty()";
    cout << endl << "  3 -> getsize()";
    cout << endl << "  4 -> display()";
    cout << endl << "  0 -> Exit";
    cout << endl << "  Enter your choice : \t";
    cin >> choice;


    switch(choice)
    {
      case 1:  cout << endl << "Enter element : ";
               cin >> x;
               a.insert(x);
              break;

      case 2: if(a.isempty() == true)
               cout << endl << "Array is empty";
               else
               cout << endl << "Array is not empty";
               break;

      case 3:  cout << endl << "size = " << a.getsize();
               break;

      case 4: if(a.isempty() == true)
              cout << endl << "array is empty...";
              else
              cout << endl << "Array element are as : ";
              a.display();
              break;

      case 0: exit(EXIT_SUCCESS);
    }
   }
  return 0;
}
