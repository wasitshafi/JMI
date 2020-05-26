/**
    @author wasit shafi
    @since 25-05-2020
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoJDBCOracle
{
    public static void main(String[] args)
    {
        try
        {
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String username = "system";
            String password = "root";
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection DB = DriverManager.getConnection(url, username, password); // we can also use 'con' instead of 'DB'
            Statement dataRequest = DB.createStatement(); // we can also use 'stmt' instead of 'datarequest'
            String  query = "select * from emp";

            ResultSet result = dataRequest.executeQuery(query); // we can also use 'rs' instead of result

            while(result.next())
            {
                System.out.println("Name          : " + result.getString(1) + "\nDept         : " + result.getString(2) + "\nDesignation  : " + result.getString(3) + "\nSalary       : " + result.getInt(4) + "\nDate Of Join : " + result.getString(5) +"\n\n");
            }

            query = "update emp set salary = salary + 500 where salary >= 30000";
            int rowUpdated = dataRequest.executeUpdate(query); // for update/ delete
            System.out.println("Update Rows : " + rowUpdated);
            result.close();// it should be closed before connection
            DB.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Occured..." + e.getMessage());
        }
 
    }
}