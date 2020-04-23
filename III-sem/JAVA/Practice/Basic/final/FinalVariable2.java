public class FinalVariable2{
    double PI; // we can also initilize it in Constructor/IIB
    FinalVariable2()
    {
        PI = 3.1415;       
        System.out.println("Inside Constructor...");
        System.out.println("Value of PI is : " + PI);
    }
    public void show()
    {
        System.out.println("Value of PI is : " + PI);
    }
    public static void main(String []arg)
    {
        FinalVariable2 obj = new FinalVariable2();
        obj.show();

    }

    
}