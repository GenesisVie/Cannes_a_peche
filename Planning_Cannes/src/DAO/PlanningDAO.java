package DAO;

import java.lang.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

public class PlanningDAO {

    public void ProjectBD() {

        //Statement state = Connect.Connexion().createStatement();
        //ResultSet res = state.executeQuery("INSERT INTO projection VALUES ("??";);
    }



    public static void   addFilmCombob(String query, JComboBox combo) {
        try {
            Statement state = Connect.Connexion().createStatement();
            ResultSet resCM = state.executeQuery(query);
            while (resCM.next()) {
                combo.addItem(resCM.getString("nomf"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); }

    }
    public void filmP(String query) {
        try {
            Statement state = Connect.Connexion().createStatement();
            ResultSet resCM = state.executeQuery(query);
            ResultSetMetaData meta = resCM.getMetaData();

            String[][] data = new String[10][10];

            resCM.beforeFirst();
            int j = 1;
            while (resCM.next())
                for (int i = 1; i < meta.getColumnCount(); i++) {
                    //data[j - 1][i - 1] = resCM.getString(i);
                    j = j + 1;
                }


                ResultSet res2 = state.executeQuery(query);
                ResultSetMetaData meta2 = res2.getMetaData();
                String[] data2 = new String[res2.getRow()];
                int i = 0;
                while (res2.next()) {
                    data2[i] = (String) res2.getObject(i);
                    i++;
                }

            }catch(SQLException e){
                e.printStackTrace();
            }

        }
    }
