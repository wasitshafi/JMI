#include<iostream>

using namespace std;

class pattern{
    int *arr;
    int n;
    public:
    
    pattern(){}

    pattern(int n)
    {
        this->n = n;
        arr = new int [ n ];
    }
    void insert( int x, int index)
    {
        arr[index] = x;
    }
    void putdata()
    {
        cout << endl << "Pattern [ ";
        for( int i = 0 ; i < n ; i++ )
            for( int j = 0 ; j <= i ; j++ )
              cout << arr[i] << " "; 
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
  
    for( int i = 0 ; i < n ; i++)
        p.insert( i + 1 , i );
                
    p.putdata();

    return 0; 
}