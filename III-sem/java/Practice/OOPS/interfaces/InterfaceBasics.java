
interface Area
{
    final static double pi = 3.1415; //CTM : All the variables and methods in an interface are treated as constants even if the keywords
                                     // final and static is not present 
    double getArea(double x, double y); // CTM : final is used for making the constant just like 'const' in c/c++
}

class Rectangle implements Area
{
    public double getArea(double x, double y)
    {
        return x * y;
    }
}

class Circle implements Area
{
    public double getArea(double x, double y)
    {
        return pi * x * x; // we don't need 'y'
    }
}

public class InterfaceBasics
{
    public static void main(String []args)
    {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Area a; // Interface object; // we can't use directly r.getarea() for that first we have to use an object of interface and then assign the reference of the class that implements the interface
        
        a = r; //  a refer to Rectange class
        System.out.println("\nArea of Rectangle with length 10 and width 24.5 is : " + a.getArea(10, 24.5));

        a = c; // a refers to Circle class
        System.out.println("\nArea of Circle with radius 4.5 is : " + a.getArea(4.5, 0));
        System.out.print("Value of pi is : " + a.pi);

    }
}