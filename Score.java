import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    Score(String username, int score){
        setBounds(250,100,900,700);
        ImageIcon icon1=new ImageIcon("coder.png");
        setIconImage(icon1.getImage());
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("marks.jpeg"));
        Image img1= img.getImage().getScaledInstance(400,350,Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(img1);
        JLabel l1=new JLabel(img2);
        l1.setBounds(60,270,350,300);
        add(l1);

        JLabel l2=new JLabel("Thankyou "+username+" for playing Java Quiz !!");
        l2.setBounds(70,40,800,50);
        l2.setFont(new Font("Poppins",Font.BOLD,30));
        l2.setForeground(new Color(30, 144, 254));
        add(l2);

        JLabel l3=new JLabel("Your Score is "+score);
        l3.setBounds(500,270,700,30);
        l3.setFont(new Font("Jokerman",Font.BOLD,26));
        l3.setForeground(new Color(86, 19, 122));
        add(l3);

        JButton b1=new JButton("PLAY AGAIN");
        b1.setBounds(550,360,120,35);
        b1.setBackground(new Color(81, 95, 255));
        b1.setFont(new Font("Poppins",Font.BOLD,13));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
    }   
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Java_Quiz().setVisible(true);

    }
    public static void main(String args[]) {
        new Score("",0).setVisible(true);
    } 
}