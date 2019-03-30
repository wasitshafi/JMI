//
//
//
//
#include<iostream>

using namespace std;

class shape{
public:
 virtual void area(){};
 virtual void display(){};
};

class circle:public shape{
 double radius;
public:
 void getdata();
 void display();
 void area();
};

class rectangle:public shape{
  double width, length;
 public:
  void getdata();
  void display();
  void area();
};

class trapezoid:public shape{
 double base1, base2, height;
public:
 void getdata();
 void display();
 void area();

};

void circle::getdata()
{
    cout << endl << "Enter radius of circle : ";
    cin >> radius;
}
void circle::display()
{
    cout << endl << endl << "Shape : Circle" << endl << "Radius: " << radius;
}
void circle::area()
{
 cout << endl << "Area  : " << 3.14159 * radius * radius;
}
void rectangle::getdata()
{
    cout << endl << "Enter width of Rectangle : ";
    cin >> width;
    cout << "Enter lenght of Rectangle : ";
    cin >> length;
}
void rectangle::display()
{
    cout << endl << endl << "Shape : Rectangle" << endl << "Width : " << width << endl << "Lenght: " << length;
}
void rectangle::area()
{
 cout << endl << "Area  : " << width * length;
}

void trapezoid::getdata()
{
    cout << endl << "Enter trapezoid base 1 : ";
    cin >> base1;
    cout << "Enter trapezoid base 2 : ";
    cin >> base2;
    cout << "Enter height : ";
    cin >> height;
}
void trapezoid::display()
{
    cout << endl << endl << "Shape : Trapezoid" << endl << "Base1 : " << base1 << endl << "Base2 : " << base2;
}
void trapezoid::area()
{
 cout << endl << "Area  : " << ((base1 + base2) / 2) * height;
}

int main()
{
    shape* p;
    circle c;
    rectangle r;
    trapezoid t;

    p = &c;
    c.getdata();
    p = &r;
    r.getdata();
    p = &t;
    t.getdata();

    p = &c;
    p->display();
    p->area();
    
    p = &r;
    p->display();
    p->area();
    
    p = &t;
    p->display();
    p->area();
    
    return 0;
}