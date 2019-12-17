import java.util.Scanner;

import sun.jvm.hotspot.utilities.AltPlatformInfo;

class Registration
{
    String name, address, city, mobileNo, emailId;
    String loginId, password;
    
    Registration(String name, String address, String city, String mobileno, String emailId)
    {
        String p;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter loginID : ");
        loginId = scan.nextLine();
        
        Boolean noSpace = true;
        Boolean atleastEightCharacter = false;
        Boolean atleastUpperCase = false;
        Boolean atleastNumber = false;
        
        do{
            System.out.print("Enter Password : ");
            p = scan.nextLine();

            for(int i = 0 ; i < p.length() ; i++)   // for space
            {
                noSpace = true; 
                if(p.charAt(i) == ' ')
                {
                    noSpace = false;
                    break;
                }
            }
            
            if(p.length() >= 8) // for password length
                atleastEightCharacter = false;
            
            for(int i = 0 ; i < p.length() ; i++)   // for UpperCase
            {

                atleastUpperCase = false; 
                if(p.charAt(i) >= 'A' or)
                {
                    noSpace = false;
                    break;
                }
            }
            




            if(noSpace == false)
                System.out.println("MSG : Password Containts WhiteSpace.");
            if(atleastEightCharacter == false)
                System.out.println("MSG : Password Contains < 8 characters");
            

        }while(noSpace == false);



        password = p;
        this.name = name;
        this.address = address;
        this.city = city;
        this.mobileNo = mobileno;
        this.emailId = emailId;
        scan.close();
    }
/*    public void set()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name : ");
        name = scan.nextLine();
        System.out.println("Enter Address   : ");
        addres = scan.nextLine();
        System.out.println("Enter city : ");
        city = scan.nextLine();
        System.out.println("Enter mobile No : ");
        mobileNo = scan.nextLine();
        System.out.println("Enter email ID  : ");
        emailId = scan.nextLine();
        scan.close();
    }*/
    public void get()
    {
        System.out.println("Name : " + name + "\nAddress : " + address + "\nCity : " + city + "\nMobile no : " + mobileNo + "\nEmail ID : " + emailId + "\n\nLogin ID : " + loginId + "\nPassword : " + password);
    } 
}

public class Solution2018Q2C
{
    public static void main(String[] args)
    {
        Registration user = new Registration("Wasit Shafi","S.F Road, Solina Payeen, 190009", "Srinagar", "9599688744","wasitshafi700@gmail.com");        

        user.get();
    }
}