/**
 *   @author wasit shafi
 *   @since 26-05-2020
 */
// For more info refer : page no 185, J2EE: The Complete Reference by Jim Keogh
// CTM: It is designed to execute queries that do not return a ResultSet. 
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Model_A
{
    private Connection database;
    private Statement dataRequest;

    public Model_A()
    {
        String username = "system";
        String password = "root";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            database = DriverManager.getConnection(url, username, password);
        }
        catch(SQLException error)
        {
            System.out.println("Unable to load the driver : " + error.getMessage());
        }        
        catch(ClassNotFoundException error)
        {
            System.out.println("Error Occured : " + error.getMessage());
            if(database != null)
            {
                try
                {
                    database.close();
                }
                catch(SQLException e){}
            }
            System.exit(2);
        }
        try
        {
            String query = "insert into emp values ('Zuhaib', 'HR', 'Executive', 45000, '05-APR-18')";
            dataRequest = database.createStatement();
            int n = dataRequest.executeUpdate(query);
            System.out.println("Data Inserted...");
        }
        catch(SQLException error)
        {
            System.out.println("Error Occured : " + error.getMessage());
        }
    }
    public static void main(String[] args)
    {
        Model_A sql1 = new Model_A();
    }
}