package LoginPage.ui;
import java.awt.*;
import java.util.concurrent.Flow;
import java.util.jar.JarEntry;
import javax.swing.*;

public class signin extends JPanel {

    public void create(Object []obj, int n){
        for(int i=0;i<n;i++){
            obj[i] = new Object();
        }
    }

    JTextField [] tf;
    JPasswordField [] pf;
    JLabel lab[];
    public signin(){

        setLayout(null);
        setBackground(new Color(28, 28, 28));
        this.setPreferredSize(new Dimension(600,800));

        tf = new JTextField[4];
        pf = new JPasswordField[2];
        lab = new JLabel[7];
        create(tf, 4);
        create(pf, 2);

        

        


       



    }
    
}
