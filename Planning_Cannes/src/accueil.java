
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import DAO.Connect;

public class accueil extends JFrame {


    private JPanel panel1,panelMain,PanelPlanning;
    private JButton accueilB,planningB,ajoutB,suppressionB,SubmitButton,ajouterButton;
    private JLabel imgAcc,horaireLab,nomfilmLab,addFilmLab,filmsLabel,LabelJour;
    private JTextField addFilmField;
    private JComboBox horaireCombo;
    private JComboBox Jour;
    private JList addFilmList;
    private JComboBox filmCombo;
    private String requete = "SELECT * FROM "

    public accueil() {


        imgAcc.setVisible(true);

        Jour.setVisible(false);
        LabelJour.setVisible(false);
        filmsLabel.setVisible(false);
        SubmitButton.setVisible(false);
        addFilmList.setVisible(false);

        ajouterButton.setVisible(false);
        nomfilmLab.setVisible(false);
        horaireLab.setVisible(false);
        filmCombo.setVisible(false);
        horaireCombo.setVisible(false);

        planningB.addActionListener(new MenuListenerPlanning());
        ajoutB.addActionListener(new MenuListenerAdd());
        accueilB.addActionListener(new MenuListenerAcc());



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
            }
        }
    }


}
