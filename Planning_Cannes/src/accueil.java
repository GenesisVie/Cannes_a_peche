import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class accueil extends JFrame {


    private JPanel panel1;
    private JButton accueilB;
    private JButton planningB;
    private JButton ajoutB;
    private JButton suppressionB;
    private JPanel panelAcc;
    private JPanel panelMenu;
    private JLabel imgAcc;
    private JComboBox Jour;
    private JLabel LabelJour;
    private JTextPane AffichageFilm;
    private JButton SubmitButton;
    private JPanel PanelPlanning;


    public accueil() {
        imgAcc.setVisible(false);

        planningB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
            imgAcc.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        JFrame fen = new JFrame();
        fen.setContentPane(new accueil().panel1);
        fen.setVisible(true);
        fen.setSize(600,1000);
        fen.setLocationRelativeTo(null);
        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
