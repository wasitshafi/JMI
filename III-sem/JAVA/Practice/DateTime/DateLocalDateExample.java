import java.time.LocalDate;
import java.util.Date;
import java.util.*;


public class DateLocalDateExample
{
    public static void main(String[] args)
    {
        Date d = new Date();
        LocalDate ld = LocalDate.now();
        LocalDate myld = LocalDate.of(2018, 10, 14);
        LocalDate myld2 = myld.plusDays(5);
        


        System.out.println(d.toString());
        System.out.println(new Date().toString());

        System.out.println();
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getMonthValue());
        System.out.println(ld.getYear());
        System.out.println();

        System.out.println(myld.getDayOfMonth());
        System.out.println(myld.getMonthValue());
        System.out.println(myld.getYear());
        System.out.println();

        System.out.println(myld2.getDayOfMonth());
        System.out.println(myld2.getMonthValue());
        System.out.println(myld2.getYear());
        System.out.println();
    }
}