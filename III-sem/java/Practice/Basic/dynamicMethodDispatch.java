
    class SPR{
        private int x = 10;
        public void showX()
        {
            System.out.println("value of x is : " + x);
        }
    }
    class SUB1 extends SPR{
        private int x = 20;
        public void showX()
        {
            System.out.println("value of x is : " + x);
        }
    }    
    class SUB2 extends SPR{
        private int x = 30;
        public void showX()
        {
            System.out.println("value of x is : " + x);
        }
    }    
public class dynamicMethodDispatch{
    public static void main(String []args)
    {        
        SPR objSPR = new SPR();
        SUB1 objSUB1 = new SUB1();
        SUB2 objSUB2 = new SUB2();

        objSPR.showX();
        objSUB1.showX();
        objSUB2.showX();
        SPR r ; // creating reference variable
        
        System.out.println();
        r = objSPR;
        r.showX();

        r = objSUB1;
        r.showX();

        r = objSUB2;
        r.showX();
    }
}