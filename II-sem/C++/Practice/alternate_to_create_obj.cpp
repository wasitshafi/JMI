//
//
//
//
#include<iostream>
using namespace std;

class point{
  int x, y;
public:
  point(int x, int y){this->x = x; this->y = y;}
  friend class plane;
};
class plane
{ 
 public:
    
 void display(point p)
 {
   cout << endl << "P(" << p.x << "," << p.y <<")"; 
 }
};

int main()
{
  point p1(10,20);
  plane pl1;
  
  pl1.display(p1); // commonly used
  
  pl1.display(point(30, 40)); // alternate;
  return 0;
}