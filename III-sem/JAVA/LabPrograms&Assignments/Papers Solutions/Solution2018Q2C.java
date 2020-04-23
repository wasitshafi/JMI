/**
    @author wasitshafi
    @since  09-02-2020
 */
import static java.lang.System.out;
import java.util.Scanner;

class Registration
{
    String name, address, city, mobileNo, emailId;
    String loginId, password;
    
    private void setPassword()
    {
        int len;
        String pwd;
        Scanner scan = new Scanner(System.in);
        
        Boolean noSpace = true;
        Boolean atleastEightCharacter = false;
        Boolean atleastUpperCase = false;
        Boolean atleastNumber = false;
        
        do
        {
            out.print("Enter Password : ");
            pwd = scan.nextLine();
            len = pwd.length();

            if(len >= 8) atleastEightCharacter = true;
            for(int i = 0 ; i < len ; i++)
            {
                if(pwd.charAt(i) == ' ') noSpace = false;
                if(pwd.charAt(i) >= 'A' &&  pwd.charAt(i) <= 'Z')  atleastUpperCase = true;
                if(pwd.charAt(i) >= '0' &&  pwd.charAt(i) <= '9') atleastNumber = true;
            }
            if(!(noSpace && atleastEightCharacter && atleastUpperCase && atleastNumber))
            {
                out.println("Invalid passord...! Try Again");
                noSpace = true;
                atleastEightCharacter = false;
                atleastUpperCase = false;
                atleastNumber = false;
            }
        }while(!(noSpace && atleastEightCharacter && atleastUpperCase && atleastNumber));

        password = pwd;
        scan.close();
    }

    public void set()
    {
        Scanner scan = new Scanner(System.in);

        out.print("Enter name     : ");
        name = scan.nextLine();
        out.print("Enter Address  : ");
        address = scan.nextLine();
        out.print("Enter city     : ");
        city = scan.nextLine();
        out.print("Enter mobile No: ");
        mobileNo = scan.nextLine();
        out.print("Enter email ID : ");
        emailId = scan.nextLine();
        out.print("Enter login ID : ");
        loginId = scan.nextLine();
        setPassword();
        scan.close();
    }
    public void get()
    {
        out.println("Name     : " + name + "\nAddress  : " + address + "\nCity     : " + city + "\nMobile no: " + mobileNo + "\nEmail ID : " + emailId + "\nLogin ID : " + loginId + "\nPassword : " + password);
    } 
}

public class Solution2018Q2C
{
    public static void main(String[] args)
    {
        Registration user = new Registration();

        user.set();
        out.println("\nUser Details");
        user.get();
    }
}