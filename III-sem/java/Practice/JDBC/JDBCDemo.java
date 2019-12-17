import java.sql.*;

public class JDBCDemo
{
    public static void main(String[] args) throws Exception
    {
        String url = "jdbc:msql://localhost:3306/student";
        String username = "root";
        String password = "password";
        String query = "Select * from details";
        Class.forName("com.mysql.jdbc.Driver");
        /*Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        rs.next();
        String name = rs.getString("name");

        System.out.println("name");
        */
    }
}