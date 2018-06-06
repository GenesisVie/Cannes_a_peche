

import java.lang.*;
import java.sql.*;

public class JDBC {
    public static void main(String[] args){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?" + "user=java&password=admin");
        }catch(SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }catch(Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
