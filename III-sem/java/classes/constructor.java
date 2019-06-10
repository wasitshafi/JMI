public class constructor{
    int x;
    public  constructor()
    {
       x = 10;
    }
    public  constructor(int n) // parameterized constructor
    {
       x = n;
    }
    public void show()
    {
        System.out.println("Value of x is : " + x);
    }
    public static void main(String []args)
    {
        constructor obj1 = new constructor();
        constructor obj2 = new constructor(30);
        
        obj1.show();
        obj2.show();
    }
}