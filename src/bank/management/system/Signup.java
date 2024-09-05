package bank.management.system;


import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;



public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;

    JTextField textName, textfName, textEmail, textAdd, textCity, textState, textPin;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);
    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO:"+first);
        label1.setBounds(160,20,600,30);
        label1.setFont(new Font("serif",Font.BOLD,30));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(350,60,600,30);
        label2.setFont(new Font("serif",Font.BOLD,21));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(310,80,600,30);
        label3.setFont(new Font("serif",Font.BOLD,21));
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setBounds(100,130,100,20);
        labelName.setFont(new Font("serif",Font.BOLD,20));
        add(labelName);

        textName = new JTextField();
        textName.setBounds(300,130,400,25);
        textName.setFont(new Font("serif",Font.BOLD,14));
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setBounds(100,170,200,20);
        labelfName.setFont(new Font("serif", Font.BOLD,20));
        add(labelfName);

        textfName = new JTextField();
        textfName.setBounds(300,170,400,25);
        textfName.setFont(new Font("serif",Font.BOLD,14));
        add(textfName);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setBounds(100,210,200,20);
        DOB.setFont(new Font("serif",Font.BOLD,20));
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,130,90));
        dateChooser.setBounds(300,210,400,25);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("serif",Font.BOLD,20));
        labelG.setBounds(100,250,200,20);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("serif",Font.BOLD,14));
        r1.setBackground(new Color(255,188,217));
        r1.setBounds(300,250,60,25);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("serif",Font.BOLD,14));
        r2.setBackground(new Color(255,188,217));
        r2.setBounds(450,250,100,25);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email Address:");
        labelEmail.setBounds(100,290,200,20);
        labelEmail.setFont(new Font("serif",Font.BOLD,20));
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setBounds(300,290,400,25);
        textEmail.setFont(new Font("serif",Font.BOLD,14));
        add(textEmail);

        JLabel labelMS = new JLabel("Marital Status :");
        labelMS.setFont(new Font("serif",Font.BOLD,20));
        labelMS.setBounds(100,330,200,20);
        add(labelMS);

        m1 = new JRadioButton("Married");
        m1.setBounds(300,330,100,25);
        m1.setFont(new Font("serif",Font.BOLD,14));
        m1.setBackground(new Color(255,188,217));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBounds(450,330,100,25);
        m2.setFont(new Font("serif",Font.BOLD,14));
        m2.setBackground(new Color(255,188,217));
        add(m2);

        m3 = new JRadioButton("Others");
        m3.setBounds(635,330,100,25);
        m3.setFont(new Font("serif",Font.BOLD,14));
        m3.setBackground(new Color(255,188,217));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("serif", Font.BOLD, 20));
        labelAdd.setBounds(100,370,200,20);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("serif",Font.BOLD, 14));
        textAdd.setBounds(300,370,400,25);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("serif", Font.BOLD, 20));
        labelCity.setBounds(100,410,200,20);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("serif",Font.BOLD, 14));
        textCity.setBounds(300,410,400,25);
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("serif", Font.BOLD, 20));
        labelPin.setBounds(100,450,200,20);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("serif",Font.BOLD, 14));
        textPin.setBounds(300,450,400,25);
        add(textPin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("serif", Font.BOLD, 20));
        labelstate.setBounds(100,490,200,20);
        add( labelstate);

        textState = new JTextField();
        textState.setFont(new Font("serif",Font.BOLD, 14));
        textState.setBounds(300,490,400,25);
        add(textState);

        next = new JButton("Next");
        next.setBounds(620,540,80,30);
        next.setFont(new Font("serif",Font.BOLD, 14));
        next.setBackground(Color.GRAY);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(255,188,217));
        setLayout(null);
        setSize(800,620);
        setLocation(250,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    String formno = first;
    String name = textName.getText();
    String fname = textfName.getText();
    String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
    String gender = null;
    if(r1.isSelected()){
        gender = "Male";
    } else if (r2.isSelected()) {
        gender = "Female";
    }
    String email = textEmail.getText();
    String marital = null;
    if(m1.isSelected()){
        marital = "Married";
    } else if (m2.isSelected()) {
        marital = "Unmarried";
    } else if (m3.isSelected()) {
        marital = "Others";
    }
    String address = textAdd.getText();
    String city = textCity.getText();
    String pin = textPin.getText();
    String state = textState.getText();

    try{
        if(textName.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Fill all the fields");
        }else {
            Conn con1 = new Conn();
            String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"', '"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
            con1.statement.executeUpdate(q);
            new Signup2(formno);
            setVisible(false);
        }
    } catch (Exception E) {
        E.printStackTrace();
    }
    }

    public static void main(String[] args){
        new Signup();
    }
}
