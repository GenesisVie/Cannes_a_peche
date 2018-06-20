
import DAO.Connect;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class accueil extends JFrame {


    private JPanel panel1,panelMain,PanelPlanning;
    private JButton accueilB,planningB,ajoutB,suppressionB,SubmitButton,ajouterButton;
    private JLabel imgAcc,horaireLab,nomfilmLab,addFilmLab,filmsLabel,LabelJour;
    private JTextField addFilmField;
    private JComboBox horaireCombo;
    private JComboBox Jour;
    private JList addFilmList;
    private JComboBox filmCombo;
    private JTable tab;
    private String requetef = "select nomF,film.selectionF,nomS from film,salle where film.selectionF='CM' and salle.SelectionF='CM' ;";
    private String requetes = "Select nomS from salle;";


    public accueil() {


        imgAcc.setVisible(true);

        Jour.setVisible(false);
        LabelJour.setVisible(false);
        filmsLabel.setVisible(false);
        SubmitButton.setVisible(false);
        addFilmList.setVisible(false);
        tab.setVisible(false);
        ajouterButton.setVisible(false);
        nomfilmLab.setVisible(false);
        horaireLab.setVisible(false);
        filmCombo.setVisible(false);
        horaireCombo.setVisible(false);

        SubmitButton.addActionListener(new GenererPlanning());
        planningB.addActionListener(new MenuListenerPlanning());
        ajoutB.addActionListener(new MenuListenerAdd());
        accueilB.addActionListener(new MenuListenerAcc());
        this.setContentPane(new Panneau());
        initPlanning(requetef);

    }

    public void initPlanning(String query) {
        try{
            Statement state = Connect.Connexion().createStatement();
            ResultSet resCM = state.executeQuery(query);
            ResultSetMetaData meta = resCM.getMetaData();

            tab.setModel(DbUtils.resultSetToTableModel(resCM));



            resCM.close();
            state.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame fen = new JFrame();
        fen.setContentPane(new accueil().panel1);
        fen.setVisible(true);
        fen.setSize(600,1000);
        fen.setLocationRelativeTo(null);
        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class MenuListenerPlanning implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource()==planningB){
                /*bouttons planning visible*/
                imgAcc.setVisible(false);
                Jour.setVisible(true);
                LabelJour.setVisible(true);
                SubmitButton.setVisible(true);
                addFilmList.setVisible(true);
                /*bouttons d'ajout cacher*/
                filmCombo.setVisible(false);
                ajouterButton.setVisible(false);
                nomfilmLab.setVisible(false);
                horaireLab.setVisible(false);
                addFilmField.setVisible(false);
                horaireCombo.setVisible(false);
                tab.setVisible(true);
            }
        }
    }

    public class MenuListenerAdd implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource()==ajoutB){
                imgAcc.setVisible(false);
                /*bouttons planning visible*/
                Jour.setVisible(true);
                LabelJour.setVisible(true);
                SubmitButton.setVisible(true);
                addFilmList.setVisible(true);
                /*bouttons d'ajout visible*/
                filmCombo.setVisible(true);
                ajouterButton.setVisible(true);
                nomfilmLab.setVisible(true);
                horaireLab.setVisible(true);
                addFilmField.setVisible(true);
                addFilmLab.setVisible(true);
                horaireCombo.setVisible(true);
                tab.setVisible(true);
            }
        }
    }

    public class MenuListenerAcc implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource()==accueilB){
                imgAcc.setVisible(true);
                /*bouttons planning visible*/
                Jour.setVisible(false);
                LabelJour.setVisible(false);
                SubmitButton.setVisible(false);
                addFilmList.setVisible(false);
                /*bouttons d'ajout visible*/
                filmCombo.setVisible(false);
                ajouterButton.setVisible(false);
                nomfilmLab.setVisible(false);
                horaireLab.setVisible(false);
                addFilmField.setVisible(false);
                horaireCombo.setVisible(false);
                tab.setVisible(false);
            }
        }
    }

    public class GenererPlanning implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource()==SubmitButton)
            {

            }

        }


    }

}
