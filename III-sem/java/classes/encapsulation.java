//
//
//
//
//
public class encapsulation{
    private int x;  // its similar to c++ as we hava made 'x' as private data member now it is accessed by member function
                    // i.e : now  main()/any other function can't access it directly  
    public encapsulation() // we can also create setdata() to set the values
    {
        x = 10;
    }
    public void getdata()
    {
        System.out.println("Value of X is : " + x);
    }
    public static void main(String a[])
    {
        encapsulation obj = new encapsulation();  // constructor will be called...
        obj.getdata();    
    }
}