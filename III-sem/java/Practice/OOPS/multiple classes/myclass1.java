//
//
//
//
//
public class myclass1{
    int x = 10;
    public void incX(int n) //CTM: public methods can only be accesed by using objects while static methods can be accesed without using objects.
    {
        x = x + n;
    }
    public void showX()
    {
        System.out.println("Value of x is : " + x);
    }
    public static void main(String a[])
    {
        myclass1 obj1 = new myclass1();
        myclass1 obj2 = new myclass1();
        System.out.println("Value of obj1.x is : " + obj1.x);
        System.out.println("Value of obj2.x is : " + obj2.x);
        obj1.incX(10);
        System.out.println("\nValue of obj1.x is : " + obj1.x);
        //System.out.println("Value of obj2.x is : " + obj2.x);
        obj2.showX(); // printing using methods
    }
}