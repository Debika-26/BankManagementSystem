package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash(){

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.gif"));
        Image iii2 = iii1.getImage().getScaledInstance(800,400, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,800,400);
        add(iiimage);

        setLayout(null);
        setLocation(250,20);
        setSize(800,400);
        setVisible(true);

        try {
            Thread.sleep(5000);
            new Login();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}
