import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class JDBC
{
    public static void main(String[] args)
    {
        try
        {
            // the mysql driver string
            Class.forName("org.mariadb.jdbc.Driver");

            // the mysql url
            String url = "jdbc:mariadb://localhost:3306/bdd_planning";

            // get the mysql database connection
            Connection conn  = DriverManager.getConnection(url,"java", "admin");

            // now do whatever you want to do with the connection
            // ...
            Statement stmt = conn.createStatement();
            ResultSet rs =stmt.executeQuery("select * from lol");
            while(rs.next())
                System.out.println(rs);
            stmt.close();
            conn.close();

        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            System.exit(2);
        }
    }
}