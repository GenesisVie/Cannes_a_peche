package DAO;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.*;
import DAO.Connect;

import Classe.Projection;
import net.proteanit.sql.DbUtils;

import javax.swing.*;

public class PlanningDAO {

    public void ProjectBD() {
        /*try{
            Statement state = Connect.Connexion().createStatement();
            ResultSet res = state.executeQuery("INSERT INTO PROJECTION VALUES ("+p.getID_proj()
                    +","+ dateDeb+","+ dateFin +","
                    +p.getFilm().getID_film()+","+p.getSalle().getID_salle()+")";);
        }*/
    }


  /*  public void initPlanning(String query) {
       try {
            Statement state = Connect.Connexion().createStatement();
            ResultSet resCM = state.executeQuery(query);
            ResultSetMetaData meta = resCM.getMetaData();

            Object[][] data = new Object[][];
            int rowCount = resCM.getRow();

            resCM.beforeFirst();
            int j = 1;
            while (resCM.next()) {
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    data[j - 1][i - 1] = resCM.getString(i);
                    j = j + 1;
                }
            }

            ResultSet res2 = state.executeQuery(query);
            ResultSetMetaData meta2 = res2.getMetaData();
            Object[] data2 = new Object[res2.getRow()];
            int i = 0;
            while (res2.next()) {
                data2[i] = res2.getObject(i);
                i++;

            }


            while (resCM.next()) {

                String tab[resCM.getString("select nomF from film ;")];
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/
}
