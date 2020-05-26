/**
 *   @author wasit shafi
 *   @since 26-05-2020
 */
// Its designed for where ResultSet is returned 
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model_B
{
    private Connection database;
    private Statement dataRequest;
    private ResultSet results;

    public Model_B()
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
            System.exit(1);
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
            String query = "select * from emp where salary > 30000";
            dataRequest = database.createStatement();
            results = dataRequest.executeQuery(query);
            DisplayResults(results);
        }
        catch(SQLException error)
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
            System.exit(3);
        }
        if(database != null)
        {
            try
            {
                database.close();
            }
            catch(SQLException e){}
        }
    }
    
    private void DisplayResults(ResultSet dr) throws SQLException
    {
        boolean records = dr.next();
        if(!records)
        {
            System.out.println("No data returned");
            return;
        }
        try
        {
            do
            {
                DownRow(dr);
            }while(dr.next());
        }
        catch(SQLException error)
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
            System.exit(-1);
        }
    }
    
    private void DownRow(ResultSet rs) throws SQLException
    {
        System.out.println("Name          : " + rs.getString(1) + "\nDept         : " + rs.getString(2) + "\nDesignation  : " + rs.getString(3) + "\nSalary       : " + rs.getInt(4) + "\nDate Of Join : " + rs.getString(5) +"\n\n");
    }

    public static void main(String[] args)
    {
        Model_B sql1 = new Model_B();
    }
}