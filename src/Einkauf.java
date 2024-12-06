import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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

        btnEnde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnBerechnen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                berechen();
            }
        });

        txtStueckzahl.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                    txtStueckpreis.requestFocus();
            }
        });


        txtStueckpreis.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                    txtRabatt.requestFocus();
            }
        });

        txtRabatt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                    berechen();
            }
        });
    }

    public void berechen() {
        taBestellung.append("\nFolgende Produkte wurden bestellt:");



    }


}
