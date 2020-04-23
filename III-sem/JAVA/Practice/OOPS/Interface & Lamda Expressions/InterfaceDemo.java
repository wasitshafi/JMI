// CTM : Interface fields are public, static and final by default i.e: int x === public static final int x;
//       Methods are public and abstract by default.
//       Interface can't have instance field and static methods but with java 8 we can have static methods
interface Shape
{
    // It is recomended not to write redundant keywords
    public final static double pi = 3.1415; //CTM : All the variables and methods in an interface are treated as constants even if the keywords final and static is not present 
    double e = 2.71828; // === public final static double e = 2.71828
    double getArea(double x, double y); // CTM : By default interface method are public
}

class Rectangle implements Shape
{
    public double getArea(double x, double y)
    {
        return x * y;
    }
}

class Circle implements Shape
{
    public double getArea(double x, double y)
    {
        return pi * x * x; // we don't need 'y'
    }
}

public class InterfaceDemo
{
    public static void main(String []args)
    {
        Shape shape;
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        
        // CTM : We can call methods and fields either by using the interace reference or by directly by object of impelementing class
        shape = r; //  a refer to Rectange class
        System.out.printf("Area of Rectangle with length 10 and width 21.5 is : %.2f%n", shape.getArea(10, 21.5));
        System.out.printf("Area of Rectangle with length 10 and width 21.5 is : %.2f%n", r.getArea(10, 21.5));
        System.out.println("Value of pi is : " + shape.pi);
        System.out.println("Value of e is  : " + shape.e);
        System.out.println("Value of pi is : " + r.pi);
        System.out.println("Value of e is  : " + r.e);
        
        shape = c; // a refers to Circle class
        System.out.printf("\nArea of Circle with radius 4.5 is : %.2f%n", shape.getArea(4.5, 0));
        System.out.printf("Area of Circle with radius 4.5 is : %.2f%n", c.getArea(4.5, 0));
        System.out.println("Value of pi is : " + shape.pi);
        System.out.println("Value of e is  : " + shape.e);
        System.out.println("Value of pi is : " + c.pi);
        System.out.println("Value of e is  : " + c.e);
    }
}