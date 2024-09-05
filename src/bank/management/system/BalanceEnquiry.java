package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RectangularShape;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1;
    JLabel l2;
    BalanceEnquiry(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm1.png"));
        Image i2 = i1.getImage().getScaledInstance(1300,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,-30,1300,700);
        add(l3);

        JLabel l1 = new JLabel("YOUR CURRENT BALANCE IS RS.");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(350,170,700,35);
        l3.add(l1);

        l2 = new JLabel();
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(350,200,400,35);
        l3.add(l2);


        b1 = new JButton("BACK");
        b1.setBounds(580,345,130,30);
        b1.setBackground(new Color(50, 83, 100, 231));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        int balance = 0;
        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
            while (resultSet.next()) {
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        l2.setText(""+balance);


        setLayout(null);
        setSize(1300,700);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_Class(pin);
    }

    public static void main(String[] args){
        new BalanceEnquiry("");
    }
}
