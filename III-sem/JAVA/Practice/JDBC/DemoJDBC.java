/**
    @author wasitshafi
    @since 17-04-2020
*/
import java.util.Scanner;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoJDBC
{
    private static Connection getConnection()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase1","root","root");
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Error Message : " + e.getMessage() );
       }
        return con;
    }

    private static void optionOne()// ShowData
    {
        try
        {
            Connection con = getConnection();
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student_Result");
            while(rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3)+ "  " + rs.getInt(4)+ "  " + rs.getInt(5)+ "  " + rs.getInt(6)+ "  " + rs.getInt(7)+ "  " + rs.getInt(8));  
            con.close();  
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Error Message : " + e.getMessage() );
        }  
    }

    private static void optionTwo() // Insert Data
    {
        String username = "";
        int id, j2ee, bigdata, ai, spm, ligd, cryptography;
        id = j2ee = bigdata = ai = spm = ligd = cryptography = -1;
    
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name : ");
        username = scan.nextLine();
        System.out.print("Enter ID : ");
        id = scan.nextInt();
        System.out.print("Enter Marks in J2EE : ");
        j2ee = scan.nextInt();
        System.out.print("Enter Marks in Big Data : ");
        bigdata = scan.nextInt();
        System.out.print("Enter Marks in Artificial Intelligence : ");
        ai = scan.nextInt();
        System.out.print("Enter Marks in SPM : ");
        spm = scan.nextInt();
        System.out.print("Enter Marks in LIGD : ");
        ligd = scan.nextInt();
        System.out.print("Enter Marks in Cryptography : ");
        cryptography = scan.nextInt();
        try
        {    
            Connection con = getConnection();
            PreparedStatement st = con.prepareStatement("insert into student_Result values(?, ?, ?, ?, ?, ?, ?, ?);"); // we can also hardcode insert using Statement
            st.setInt(1, id);
            st.setString(2, username);
            st.setInt(3, j2ee);
            st.setInt(4, bigdata);
            st.setInt(5, ai);
            st.setInt(6, spm);
            st.setInt(7, ligd);
            st.setInt(8, cryptography);     
            st.executeUpdate();
            st.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Error Message : " + e.getMessage() );
        }
    }
    
    public static void main(String args[])
    {
        Integer choice;   
        Scanner scan = new Scanner(System.in);
        String options = "1 - Show Data.\n2 - Insert New Record.\n0 - Exit.\n\nEnter Your Choice : ";

        do{  
            System.out.print(options);
            choice = scan.nextInt();
            switch(choice)
            {
                case 1 : optionOne(); break;
                case 2 : optionTwo(); break;
                default: System.out.println("\n\nInvalid Choice...Try Again.");
            }
            System.out.println("\n\n");
        }while(choice != 0);
        scan.close();
    }  
}