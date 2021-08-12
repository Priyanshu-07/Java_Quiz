import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Java_Quiz extends JFrame implements ActionListener{
    JButton b1;
    JButton b2;
    JTextField t1;
    Java_Quiz(){
        setBounds(200,150,1100,580);
        ImageIcon icon1=new ImageIcon("coder.png");
        setIconImage(icon1.getImage());
        getContentPane().setBackground(Color.white);
        ImageIcon icon= new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
        JLabel l1= new JLabel(icon);
        setLayout(null);
        l1.setBounds(0,0,650,550);
        add(l1);
        JLabel l2=new JLabel("Java Quiz");
        l2.setFont(new Font("Poppins", Font.BOLD, 50));
        l2.setForeground(new Color(30, 144, 254));
        l2.setBounds(650,40,300,50);
        add(l2);



        JLabel l3=new JLabel("Enter Your Name :");
        l3.setFont(new Font("Poppins", Font.BOLD, 30));
        l3.setForeground(new Color(30, 144, 254));
        l3.setBounds(650,160,300,80);
        add(l3);

        t1= new JTextField();
        t1.setBounds(630,235,300,30);
        t1.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
        add(t1);

        b1= new JButton("Next");
        b1.setBounds(630, 305, 120, 30);
        b1.setFont(new Font("Poppins",Font.BOLD,20));
        b1.setBackground(new Color(30, 144, 254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2= new JButton("Exit");
        b2.setBounds(810, 305, 120, 30);
        b2.setFont(new Font("Poppins",Font.BOLD
        
        ,20));
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String name = t1.getText();
            this.setVisible(false);
            new Next(name);
        }
        else{
            System.exit(0);
        }

    }
    public static void main(String args[]) {
                new Java_Quiz();
                

    }   
}