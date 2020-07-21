#include<iostream>
using namespace std;

struct point{
    int x, y;
    point(){};
    point(int x1, int y1)
    {
        x = x1;
        y = y1;
    }
};

int main()
{
    struct point p(10, 20);
    struct point p2;
    
    cout << "x : " << p.x << "\ny : " << p.y << "\n\n";
    
    p2.x = 55;
    p2.y = 66;
    cout << "x : " << p2.x << "\ny : " << p2.y << "\n";

    return 0;
}