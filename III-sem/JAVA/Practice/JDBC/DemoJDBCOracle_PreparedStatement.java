/**
    @author wasit shafi
    @since 25-05-2020
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoJDBCOracle_PreparedStatement
{
    public static void main(String[] args)
    {
        try
        {
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String username = "system";
            String password = "root";
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection DB = DriverManager.getConnection(url, username, password);

            String  query = "update emp set salary = salary + 500 where salary >= ?";
            PreparedStatement pStatement = DB.prepareStatement(query); // CTM: its not preparedStatement(Q);
            pStatement.setInt(1, 30000); // args : (position, value)s
            int rowUpdated = pStatement.executeUpdate();

            query = "select * from emp where salary > ?";
            pStatement = DB.prepareStatement(query);
            pStatement.setInt(1, 30000);
            ResultSet result = pStatement.executeQuery();
            while(result.next())
                System.out.println("Name          : " + result.getString(1) + "\nDept         : " + result.getString(2) + "\nDesignation  : " + result.getString(3) + "\nSalary       : " + result.getInt(4) + "\nDate Of Join : " + result.getString(5) +"\n\n");
            System.out.println("Update Rows : " + rowUpdated);
            result.close(); // it should be closed before connection
            DB.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Occured..." + e.getMessage());
        }
    }
}