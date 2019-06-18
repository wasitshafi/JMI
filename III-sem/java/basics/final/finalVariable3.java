class finalV3{
    final double PI;
    //IIB
    {
        PI = 3.1414; // CTM : before accesing PI some value must be assigned to it otherwise error will be raised by compiler
        System.out.println("Inside Instance Initilization Block(IIB)...");
        System.out.println("Value of PI is : " + PI);
    }
    finalV3()
    {      
        System.out.println("\nInside Constructor...");
        System.out.println("Value of PI is : " + PI);
    }
    public void show()
    {
        System.out.println("\nInside show()");
        System.out.println("Value of PI is : " + PI);
    }
    public static void main(String []arg)
    {
        finalV3 obj = new finalV3();
        obj.show();

    }

    
}