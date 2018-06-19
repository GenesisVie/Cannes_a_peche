package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public  class Connect {
    private static String url = "jdbc:mariadb://localhost:3306/bdd_planning";
    private static final String passwd = "admin";
    private static final String user = "java";
    private static Connection connect;


    public static Connection Connexion() {
        if(connect == null)
        {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connect = DriverManager.getConnection(url,user,passwd);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERREUR DE CONNEXION ! ", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return connect;
    }
}