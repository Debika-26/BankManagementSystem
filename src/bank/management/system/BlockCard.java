package bank.management.system;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class BlockCard extends JFrame implements ActionListener {
    String pin;
    JButton blockButton, backButton;

    public BlockCard(String pin) {
        this.pin = pin;

        // Set background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm1.png"));
        Image i2 = i1.getImage().getScaledInstance(1300, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, -30, 1300, 700);
        add(l3);

        // Label for card blocking
        JLabel l1 = new JLabel("DO YOU WANT TO BLOCK YOUR CARD?");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(370, 170, 400, 35);
        l3.add(l1);

        // Block card button
        blockButton = new JButton("BLOCK CARD");
        blockButton.setBounds(580, 310, 130, 30);
        blockButton.setBackground(new Color(50, 83, 100, 231));
        blockButton.setForeground(Color.WHITE);
        blockButton.addActionListener(this);
        l3.add(blockButton);

        // Back button
        backButton = new JButton("BACK");
        backButton.setBounds(580, 345, 130, 30);
        backButton.setBackground(new Color(50, 83, 100, 231));
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(this);
        l3.add(backButton);

        // Frame settings
        setLayout(null);
        setSize(1300, 700);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == blockButton) {
                // Block card logic
                Conn c = new Conn();
                String query = "update login set card_status='Blocked' where pin='" + pin + "'";
                c.statement.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Your card has been blocked successfully.");
                setVisible(false);
                new main_Class(pin);
            } else if (e.getSource() == backButton) {
                setVisible(false);
                new main_Class(pin);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new BlockCard("");
    }
}
