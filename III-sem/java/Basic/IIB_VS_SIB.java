class IIB_SIB
{ 
    // CTM : if a class contains both IIB as well as SIB then SIB gets executed first then IIB & then finally constructor
    // here i have defined in the order constructor->IIB->SIB  which is not good practice...we should maintain the order SIB->IIB->constructor which is considered to be good programming practice
    IIB_SIB()
    {
        System.out.println("Inside Constructor");
    }
    
    {
        System.out.println("Inside IIB");
    }

    static
    {
        System.out.println("Inside SIB");
    }

    public static void main(String []args)
    {
        IIB_SIB obj = new IIB_SIB();
    }
}