package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    String pin;
    main_Class(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm1.png"));
        Image i2 = i1.getImage().getScaledInstance(1300,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,-30,1300,700);
        add(l3);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(370,170,400,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,21));
        l3.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.setBounds(345,240,155,30);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("CASH WITHDRAWL");
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.setBounds(555,240,155,30);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setBackground(new Color(65,125,128));
        b3.setForeground(Color.WHITE);
        b3.setBounds(345,275,155,30);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setBackground(new Color(65,125,128));
        b4.setForeground(Color.WHITE);
        b4.setBounds(555,275,155,30);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setBackground(new Color(65,125,128));
        b5.setForeground(Color.WHITE);
        b5.setBounds(345,310,155,30);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBackground(new Color(65,125,128));
        b6.setForeground(Color.WHITE);
        b6.setBounds(555,310,155,30);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("BLOCK CARD");
        b7.setBackground(new Color(65,125,128));
        b7.setForeground(Color.WHITE);
        b7.setBounds(345,345,155,30);
        b7.addActionListener(this);
        l3.add(b7);

        b8 = new JButton("EXIT");
        b8.setBackground(new Color(65,125,128));
        b8.setForeground(Color.WHITE);
        b8.setBounds(555,345,155,30);
        b8.addActionListener(this);
        l3.add(b8);

        setLayout(null);
        setSize(1300,700);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        }else if (e.getSource()==b8){
            System.exit(0);
        } else if (e.getSource()==b2) {
            new Withdrawl(pin);
            setVisible(false);
        } else if (e.getSource()==b6) {
            new BalanceEnquiry(pin);
            setVisible(false);
        }else if (e.getSource()==b3) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource()==b5) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new mini(pin);
        } else if (e.getSource()==b7) {
            new BlockCard(pin);
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new main_Class("");
    }
}
