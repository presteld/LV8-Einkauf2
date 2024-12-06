import javax.swing.*;
import java.awt.*;

public class Einkauf extends JFrame {


    private JPanel jpPanel;




    public Einkauf() throws HeadlessException {


        setTitle("Bestellfenster");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setContentPane(jpPanel);
        setVisible(true);


    }


}
