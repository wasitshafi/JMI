//
//area.java
//
//program to show application of abstract class
//
import java.util.Scanner;
import java.lang.Math.*;

abstract class Shape
{
    public abstract double findArea();
}
abstract class TwoDimensionShape extends Shape
{
    public abstract double findCircumference();
}
abstract class ThreeDimensionShape extends Shape
{   
    public abstract double findVolume();
}
// 2 Dimension shapes
class Circle extends TwoDimensionShape
{
    private double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }
    public double findArea()
    {
        return Math.PI * radius * radius;
    }
    public double findCircumference()
    {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends TwoDimensionShape
{
    private double side1, side2, side3;
    Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double findArea()
    {
        double p = ( side1 + side2 + side3 ) / 2.0;    

        return Math.sqrt( p * (p - side1) * (p - side2) * (p - side3) );
    }
    public double findCircumference()
    {
        return side1 + side2 + side3; // perimeter
    }
}


class Square extends TwoDimensionShape
{
    private double side;
    Square(double side)
    {
        this.side = side;
    }
    public double findArea()
    {
        return side * side;
    }
    public double findCircumference()
    {
        return 4 * side;   // perimeter
    }
}

class Rectangle extends TwoDimensionShape
{
    private double length, width;
    Rectangle(double length, double width)
    {
        this.length = length;
        this.width  = width;
    }
    public double findArea()
    {
        return length * width;
    }
    public double findCircumference()
    {
        return 2 * (length + width);   // perimeter
    }
}
// 3 Dimension Shapes
class Cube extends ThreeDimensionShape
{
    private double edge;
    Cube(double edge)
    {
        this.edge  = edge;
    }
    
    public double findArea()
    {
        return 6 * edge * edge;
    }

    public double findVolume()
    {
        return edge * edge * edge;   // perimeter
    }
}

class Cuboid extends ThreeDimensionShape
{
    private double length, width, height;

    Cuboid(double length, double width, double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double findArea()
    {
        return 2 * (length * width + width * height + height * length);
    }
    public double findVolume()
    {
        return length * width * height;   // perimeter
    }
}

class Cone extends ThreeDimensionShape
{
    private double radius, height;

    Cone(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }
    public double findArea()
    {
        return Math.PI * radius * ( radius  + Math.sqrt( (height * height) + (radius * radius) ) );
    }
    public double findVolume()
    {
        return Math.PI * radius * radius * (height / 3.0);
    }
}
class Sphere extends ThreeDimensionShape
{
    private double radius;

    Sphere(double radius)
    {
        this.radius = radius;
    }
    public double findArea()
    {
        return 4 * Math.PI * radius * radius;
    }
    public double findVolume()
    {
        return 4/3.0 * (Math.PI * radius * radius * radius);
    }
}

class Cylinder extends ThreeDimensionShape
{
    private double radius, height;

    Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }
    public double findArea()
    {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
    public double findVolume()
    {
        return Math.PI * radius * radius * height;
    }
}

public class area
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        double radius, side1, side2, side3, length, width, height, edge;
        Circle circle;
        Triangle triangle;
        Square square;
        Rectangle rectangle;
        Cube cube;
        Cuboid cuboid;
        Cone cone;
        Sphere sphere;
        Cylinder cylinder;

        // circle
        System.out.print("Enter radius of Circle    : ");
        radius = scan.nextDouble();
        circle = new Circle(radius);
        
        // triangle
        do{
            System.out.print("\nEnter side1 of Triangle   : ");
            side1 = scan.nextDouble();
            System.out.print("Enter base of Triangle    : ");
            side2 = scan.nextDouble();
            System.out.print("Enter side2 of Triangle   : ");
            side3 = scan.nextDouble();

            if( (side1 + side2 <= side3) || (side2 + side3 <= side1) || (side3 + side1 <= side2) == true )
             System.out.println("Invalid input...! Try again.");
           } while( (side1 + side2 <= side3) || (side2 + side3 <= side1) || (side3 + side1 <= side2) == true );
        triangle = new Triangle(side1, side2, side3);

        // square
        System.out.print("\nEnter side of Square      : ");
        side1 = scan.nextDouble();
        square = new Square(side1);

        // rectangle
        System.out.print("\nEnter length of Rectangle : ");
        length = scan.nextDouble();
        System.out.print("Enter width of Rectangle  : ");
        width = scan.nextDouble();
        rectangle = new Rectangle(length, width);

        // cube
        System.out.print("\nEnter Edge of Cube        : ");
        edge = scan.nextDouble();
        cube = new Cube(edge);

        // cuboid
        System.out.print("\nEnter length of Cuboid    : ");
        length = scan.nextDouble();
        System.out.print("Enter width of Cuboid     : ");
        width = scan.nextDouble();
        System.out.print("Enter height of Cuboid    : ");
        height = scan.nextDouble();
        cuboid = new Cuboid(length, width, height);

        // cone
        System.out.print("\nEnter radius of Cone      : ");
        radius = scan.nextDouble();
        System.out.print("Enter height of Cone      : ");
        height = scan.nextDouble();
        cone = new Cone(radius, height);
       

        // sphere
        System.out.print("\nEnter radius of Sphere    : ");
        radius = scan.nextDouble();
        sphere = new Sphere(radius);
        
        // cylinder
        System.out.print("\nEnter radius of Cylinder  : ");
        radius = scan.nextDouble();
        System.out.print("Enter height of cylinder  : ");
        height = scan.nextDouble();
        cylinder = new Cylinder(radius, height);

    
        // 2 Dimension shapes
        System.out.println("\n\nArea of Circle is          : " + circle.findArea());
        System.out.println("Circumference of Circle is : " + circle.findCircumference() + "\n" );

        System.out.println("Area of Triangle is        : " + triangle.findArea());
        System.out.println("Perimeter of Triangle is   : " + triangle.findCircumference() + "\n" );

        System.out.println("Area of Square is          : " + square.findArea());
        System.out.println("Perimeter of Square is     : " + square.findCircumference() + "\n" );

        System.out.println("Area of Rectangel is       : " + rectangle.findArea());
        System.out.println("Perimeter of Rectangle is  : " + rectangle.findCircumference() + "\n" );

        // 3 Dimensions shapes
        System.out.println("Area of Cube is            : " + cube.findArea());
        System.out.println("Volume of Cube is          : " + cube.findVolume() + "\n" );

        System.out.println("Area of Cuboud is          : " + cuboid.findArea());
        System.out.println("Volume of Cuboid is        : " + cuboid.findVolume() + "\n" );

        System.out.println("Area of Cone is            : " + cone.findArea());
        System.out.println("Volume of Cone is          : " + cone.findVolume() + "\n" );

        System.out.println("Area of Sphereis           : " + sphere.findArea());
        System.out.println("Volume of Sphere is        : " + sphere.findVolume() + "\n" );

        System.out.println("Area of Cylinder is        : " + cylinder.findArea());
        System.out.println("Volume of Cylinder is      : " + cylinder.findVolume() + "\n" );
    }
}