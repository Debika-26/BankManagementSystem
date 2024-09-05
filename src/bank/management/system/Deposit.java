package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1,b2;

    Deposit(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm1.png"));
        Image i2 = i1.getImage().getScaledInstance(1300,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,-30,1300,700);
        add(l3);

        JLabel l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(370,170,400,35);
        l3.add(l1);

        textField = new TextField();
        textField.setBackground(new Color(50, 83, 100, 231));
        textField.setForeground(Color.WHITE);
        textField.setBounds(370,210,320,25);
        textField.setFont(new Font("System",Font.BOLD,22));
        l3.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(580,310,130,30);
        b1.setBackground(new Color(50, 83, 100, 231));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(580,345,130,30);
        b2.setBackground(new Color(50, 83, 100, 231));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);



        setLayout(null);
        setSize(1300,700);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount = textField.getText();
            Date date=new Date();
            if(e.getSource()==b1){
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the amount you want to Deposit");
                }else{
                    Conn c = new Conn();
                    c.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null,"RS. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
                }else if (e.getSource()==b2){
                setVisible(false);
                new main_Class(pin);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Deposit("");
    }
}
