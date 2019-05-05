//
//
//
//

#include<iostream>
#include<strings.h>

using namespace std;

class person{
             int *arr;

             public:

             person(int size)
             {
              arr = new int[size];
             }
             ~person()
             {

                 delete arr;
             }

             void getdata( int size )
             {
                for( int i = 0 ; i < size ; i++ )
                {
                    cout << endl << "Enter element no " << i + 1 << " :\t";
                    cin >> *(arr + i);
                }
             }

             void putdata( int size )
             {
                for( int i = 0 ; i < size ; i++ )
                {
                    cout << endl << "Enter element no " << i + 1 << " :\t" << *(arr + i);
                }
             }
};

int main()
{
    int size;

    cout << endl << "Enter size of array: \t";
    cin >> size;

    person o(size);

    o.getdata( size );
    o.putdata( size );

    return 0;
}
