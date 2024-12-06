import javax.swing.*;
import java.awt.*;

public class Einkauf extends JFrame {


    private JPanel jpPanel;
    private JLabel lblStueckzahl;
    private JLabel lblStueckpreis;
    private JLabel lblRabatt;
    private JTextField txtStueckzahl;
    private JTextField txtStueckpreis;
    private JTextField txtRabatt;
    private JButton btnBerechnen;
    private JTextArea taBestellung;
    private JButton btnEnde;


    public Einkauf() throws HeadlessException {


        setTitle("Bestellfenster");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setContentPane(jpPanel);
        setVisible(true);


    }


}
