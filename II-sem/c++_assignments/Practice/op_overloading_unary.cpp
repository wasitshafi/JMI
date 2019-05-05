//
//
//
//

#include<iostream>

using namespace std;

class student {
    int x, y;

    public:
        student(int x, int y)
        {
            this->x = x;
            this->y = y;
            putdata();
        }
        void putdata()
        {
            cout << endl << "x = " << x << "\t y = " << y;
        }
        void operator~()
        {
            x = -x;
            y = -y;

        }
        friend void operator*(student &s) // &s to make permanent change
        {
            s.x++;
            s.y++;

        }
        ~student(){ } // destructor
};

int main()
{
    cout << "Initial values of obj:";
    student obj(10,30); // initial values

     cout << endl << endl << "After ~obj:";
     ~obj;           // using member function
     obj.putdata();

     cout << endl << endl << "After *obj:";
     *obj;           // using friend function
     obj.putdata();

    return 0;
}
