#include<iostream>

using namespace std;

class pattern{
    int *arr;
    int lenght;
 
    public:
    
    pattern(){}

    pattern(int n)
    {
        lenght =  ( ( n * ( n + 1 ) ) * ( 2 * n + 1 ) ) / 6;
        arr = new int [ lenght ];
    }

    void insert(int x, int index)
    {
        arr[index] = x;
    }

    void putdata()
    {
        cout << endl << "Patter [ ";
        for( int i = 0 ; i < lenght ; i++ )
        {
            cout << arr[i];
            if( i != lenght - 1) cout << ", ";
        }
        cout << " ]";
    }
};

int main()
{
    int n;
    pattern p;
    
    do{
    cout << endl << "Enter value of n:\t";
    cin >> n;
   
    if( n < 1)
    cout << endl << "Invalid input....! HINT: n > 0. ";
    }while(n < 1);

    p = pattern(n);
        
      for( int i = 1, index = 0 ; i <= n ; i++)
         for( int j = 1 ; j <= i * i ; j++)
               p.insert( i , index++ );
    
    p.putdata();

    return 0; 
}