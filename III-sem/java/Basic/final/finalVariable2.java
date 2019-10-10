class finalV2{
    double PI; // we can also initilize it in Constructor/IIB
    finalV2()
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
        finalV2 obj = new finalV2();
        obj.show();

    }

    
}