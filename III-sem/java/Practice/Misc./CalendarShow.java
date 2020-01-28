import java.util.Scanner;
import java.time.LocalDate;

public class CalendarShow
{
    public static void main(String[] args)
    {
        LocalDate ld = LocalDate.now();

        System.out.println(ld.toString());


        System.out.print(ld.getMonthValue() + "  ");
        System.out.print(ld.getDayOfMonth() + "  ");
        System.out.println(ld.getYear());

        System.out.println(ld.getDayOfWeek());
        System.out.println(ld.getDayOfWeek().getValue());

        System.out.println("Mon Tue Wed Thu Fri Sat");
        System.out.println(ld.getDayOfMonth());
        
//        for(int i = 1 ; i < )
    }
}