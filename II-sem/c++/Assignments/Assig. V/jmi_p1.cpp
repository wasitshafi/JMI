//
//
//
//
#include<iostream>

using namespace std;

class least{
    int x, y, z;

    public: 

    least(int x, int y, int z)
    {
        this->x = x;
        this->y = y;
        this->z = z;
    }
    void putdata();
    int getLeast();
};

    void least::putdata()
    {
      cout << endl << "X = " << x << "Y = " << y << "Z = " << z;
    }
    int least::getLeast()
    {
        return x < y ? x < z ? x : y : y < z ? y : z;   
    }

int main()
{
    int x, y, z;

    cout << endl << "Enter value of X : ";
    cin >> x;
    cout << "Enter value of Y : ";
    cin >> y;
    cout << "Enter value of Z : ";
    cin >> z;

    least number(x, y, z);

    cout << endl << "Least(" << x << "," << y << "," << z << ") = " << number.getLeast(); 
    
    return 0;
}