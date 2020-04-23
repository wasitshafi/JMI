import java.util.Calendar;
public class calendar
{
    public static void main(String []args)
    {
        Calendar c = Calendar.getInstance();

        System.out.print("Current date is : " + c.get(Calendar.DAY_OF_WEEK));  
    }
}