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
    private JButton btnZurrueck;


    public Einkauf() throws HeadlessException {

        setTitle("Bestellfenster");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
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

        btnZurrueck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taBestellung.setText("Hier kommt Ihre Bestellung:");
            }
        });
    }

    public void berechen() {
        //taBestellung.append("\nFolgende Produkte wurden bestellt:");

        try {
            String sStueckzahl = txtStueckzahl.getText().toString();
            String sStueckpreis = txtStueckpreis.getText().toString();
            String sRabatt = txtRabatt.getText().toString();

            int iStueckzahl = Integer.parseInt(sStueckzahl);
            double dStueckpreis = Double.parseDouble(sStueckpreis);
            double dRabatt = Double.parseDouble(sRabatt)/100.0;

            double dgesamt = iStueckzahl * dStueckpreis * (1.0 - dRabatt);
            dgesamt = Math.round(dgesamt * 100.0) / 100.0;

            taBestellung.append("\nStückzahl "+ sStueckzahl + "\t  x  Stückpreis " + sStueckpreis + "€\t = "+ dgesamt + "€");




        } catch (Exception e) {

            JOptionPane.showMessageDialog(this,"Bitte geben Sie korrekte Zahlen ein!","Ungültige eingabe",JOptionPane.WARNING_MESSAGE);

            throw new RuntimeException(e);
        }

    }


}
