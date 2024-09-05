package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAd;
    JRadioButton r1,r2,e1,e2;
    JButton next;

    String formno;
    Signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,10,100,100);
        add(image);

        JLabel l1 = new JLabel("Page 2");
        l1.setBounds(350,50,600,30);
        l1.setFont(new Font("serif",Font.BOLD,21));
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setBounds(310,80,600,30);
        l2.setFont(new Font("serif",Font.BOLD,21));
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setBounds(100,130,100,25);
        l3.setFont(new Font("serif",Font.BOLD,18));
        add(l3);

        String religion[] = {"Hindu","Muslim","Christan","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground( new Color(195, 255, 188));
        comboBox.setFont(new Font("serif",Font.BOLD,14));
        comboBox.setBounds(300,130,300,25);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setBounds(100,170,100,25);
        l4.setFont(new Font("serif",Font.BOLD,18));
        add(l4);

        String category[] = {"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground( new Color(195, 255, 188));
        comboBox2.setFont(new Font("serif",Font.BOLD,14));
        comboBox2.setBounds(300,170,300,25);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setBounds(100,210,100,25);
        l5.setFont(new Font("serif",Font.BOLD,18));
        add(l5);

        String income[] = {"Null","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground( new Color(195, 255, 188));
        comboBox3.setFont(new Font("serif",Font.BOLD,14));
        comboBox3.setBounds(300,210,300,25);
        add(comboBox3);

        JLabel l6 = new JLabel("Education :");
        l6.setBounds(100,250,100,25);
        l6.setFont(new Font("serif",Font.BOLD,18));
        add(l6);

        String education[] = {"High School","UG","PG","Doctorate","Others"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground( new Color(195, 255, 188));
        comboBox4.setFont(new Font("serif",Font.BOLD,14));
        comboBox4.setBounds(300,250,300,25);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setBounds(100,290,150,25);
        l7.setFont(new Font("serif",Font.BOLD,18));
        add(l7);

        String occupation[] = {"Employed","Self-Employed","Business","Student","Retired","Others"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground( new Color(195, 255, 188));
        comboBox5.setFont(new Font("serif",Font.BOLD,14));
        comboBox5.setBounds(300,290,300,25);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN no :");
        l8.setBounds(100,330,100,25);
        l8.setFont(new Font("serif",Font.BOLD,18));
        add(l8);

        textPan = new JTextField();
        textPan.setBounds(300,330,300,25);
        textPan.setFont(new Font("serif",Font.BOLD,14));
        add(textPan);

        JLabel l9 = new JLabel("Adhaar no :");
        l9.setBounds(100,370,100,25);
        l9.setFont(new Font("serif",Font.BOLD,18));
        add(l9);

        textAd = new JTextField();
        textAd.setBounds(300,370,300,25);
        textAd.setFont(new Font("serif",Font.BOLD,14));
        add(textAd);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setBounds(100,410,200,25);
        l10.setFont(new Font("serif",Font.BOLD,18));
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("serif",Font.BOLD,14));
        r1.setBackground( new Color(195, 255, 188));
        r1.setBounds(300,410,100,25);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("serif",Font.BOLD,14));
        r2.setBackground( new Color(195, 255, 188));
        r2.setBounds(400,410,100,25);
        add(r2);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setBounds(100,450,200,25);
        l11.setFont(new Font("serif",Font.BOLD,18));
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("serif",Font.BOLD,14));
        e1.setBackground( new Color(195, 255, 188));
        e1.setBounds(300,450,100,25);
        add(e1);
        e2 = new JRadioButton("No");
        e2.setFont(new Font("serif",Font.BOLD,14));
        e2.setBackground( new Color(195, 255, 188));
        e2.setBounds(400,450,100,25);
        add(e2);
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);

        JLabel l12 = new JLabel("Form No :");
        l12.setBounds(600,10,100,25);
        l12.setFont(new Font("serif",Font.BOLD,16));
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setBounds(660,10,60,25);
        l13.setFont(new Font("serif",Font.BOLD,16));
        add(l13);

        next = new JButton("Next");
        next.setBounds(620,540,80,30);
        next.setFont(new Font("serif",Font.BOLD, 14));
        next.setBackground(Color.GRAY);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);


        this.formno = formno;

        setLayout(null);
        setSize(800,620);
        setLocation(250,20);
        getContentPane().setBackground(new Color(195, 255, 188));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String adhaar = textAd.getText();

        String scitizen = "";
        if (r1.isSelected()){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }

        String eaccount = "";
        if (e1.isSelected()){
            eaccount = "Yes";
        } else if (e2.isSelected()) {
            eaccount = "No";
        }

        try{
            if (textPan.getText().equals("") || textAd.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Conn c1 = new Conn();
                String q = "insert into Signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+adhaar+"','"+scitizen+"','"+eaccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args){
        new Signup2("");
    }
}
