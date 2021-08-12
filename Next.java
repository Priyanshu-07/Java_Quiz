import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class Next extends JFrame implements ActionListener{
    JButton b1,b2;
    String username;
    Next(String username) {
        this.username=username;
        setBounds(300, 150, 1000, 600);
        ImageIcon icon1=new ImageIcon("coder.png");
        setIconImage(icon1.getImage());
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l1=new JLabel("Welcome "+username+" to Java Quiz");
        l1.setBounds(80,20,800,40);
        l1.setFont(new Font("Poppins", Font.BOLD,40));
        l1.setForeground(new Color(90, 144, 254));
        add(l1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("second.jpg"));
        JLabel l2=new JLabel(i1);
        l2.setBounds(40,30,900,420);
        add(l2);

        
        b1=new JButton("Back");
        b1.setBounds(250,450,120,40);
        b1.setFont(new Font("Poppins",Font.BOLD,20));
        b1.setBackground(new Color(30, 144, 254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("Start");
        b2.setBounds(630,450,120,40);
        b2.setFont(new Font("Poppins",Font.BOLD,20));
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            this.setVisible(false);
            new Java_Quiz().setVisible(true);

        }
        else if(ae.getSource()==b2){
            this.setVisible(false);
            new Start(username).setVisible(true);
        }
    }

    public static void main(String args[]) {
        new Next("");
    }
}
