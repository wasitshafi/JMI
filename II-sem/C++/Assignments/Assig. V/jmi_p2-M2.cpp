//
//
//
//
#include<iostream>

using namespace std;

class polygon{
    protected:
    double width, height;
    public:
    virtual void set_value();
    virtual double calculate_area(){};// NOTE : this will not be called because the behaviour of the compiler will depend upon the content of the pointer rather than the type of pointer
};
class rectangle: public polygon{
    public:
    double calculate_area();
};
class triangle: public polygon{
    public:
    double calculate_area();
};

    void polygon::set_value()
    {
        cout << endl << "Enter width : ";
        cin >> width;

        cout << "Enter height : ";
        cin >> height;
    }
   double rectangle::calculate_area()
   {
      return (width * height);        // Area = width * length
   }
   double triangle::calculate_area()
   {
     return ((width * height) / 2 );  // Area = 1/2 (base * height)    
   }

int main()
{
    polygon *p;
    rectangle r;
    triangle t;

    p = &r;
    p->set_value();
    cout << "Area of Rectangle is : " << p->calculate_area() << endl << endl;

    p = &t;
    p->set_value();
    cout << "Area of triangle is :  " << p->calculate_area() << endl << endl;

    return 0;
}
