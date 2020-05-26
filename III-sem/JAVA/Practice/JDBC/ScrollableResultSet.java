import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;

public class ScrollableResultSet
{
    public static void main(String args[])
    {
        try
        {
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String username = "system";
            String password = "root";

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection database = DriverManager.getConnection(url, username, password);
            Statement dataRequest = database.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); // refer : https://www.onlinetutorialspoint.com/jdbc/jdbc-scrollable-resultset-example-tutorials.html
            dataRequest.setFetchSize(20); // we can also set rows fetch 
            String query = "select * from emp";
            ResultSet results = dataRequest.executeQuery(query);

            System.out.println("getRow() : " + results.getRow());
            results.next();
            results.next();
            System.out.println("getRow() : " + results.getRow()); // return the current row no.
            results.previous();
            System.out.println("getRow() : " + results.getRow()); // return the current row no.
            results.last();
            System.out.println("getRow() : " + results.getRow()); // return the current row no.
            results.first();
            System.out.println("getRow() : " + results.getRow()); // return the current row no.
            results.absolute(5);
            System.out.println("getRow() : " + results.getRow()); // return the current row no.
            results.relative(-2);
            System.out.println("getRow() : " + results.getRow()); // return the current row no.
            results.relative(-2);
            System.out.println("getRow() : " + results.getRow()); // return the current row no.           

            System.out.println("Data at current row : ");
            System.out.println("Name          : " + results.getString(1) + "\nDept         : " + results.getString(2) + "\nDesignation  : " + results.getString(3) + "\nSalary       : " + results.getInt(4) + "\nDate Of Join : " + results.getString(5) +"\n\n"); // We can traverse all row using loop 
        }
        catch(Exception e)
        {
            System.out.println("Error Occured : " + e.getMessage());
        }
    }
}