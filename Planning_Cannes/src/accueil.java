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


    public accueil() {


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
}
