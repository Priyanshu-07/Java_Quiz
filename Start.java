import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Start extends JFrame implements ActionListener{

    int count=0;
    int time=10;
    int ans_given=0;
    int score=0;
    JButton b2,b3,b4;
    JRadioButton opt1,opt2,opt3,opt4;
    JLabel l1,l2,l3;
    ButtonGroup grp;

    String question[][] = new String[10][5];
    String ans[][]=new String[10][1];
    String ra[]=new String[10];
    String username;

    Start(String username){
        this.username=username;
        setBounds(200, 10, 1000, 800);
        ImageIcon icon1=new ImageIcon("coder.png");
        setIconImage(icon1.getImage());
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("quiz.jpg"));
        l1=new JLabel(i1);
        l1.setBounds(0, 0, 1000, 347);
        add(l1);

        l2=new JLabel("");
        l2.setFont(new Font("Poppins",Font.PLAIN,18));
        l2.setBounds(90,400,40,30);
        add(l2);

        l3=new JLabel("");
        l3.setFont(new Font("Poppins",Font.PLAIN,18));
        l3.setBounds(120,365,620,100);
        add(l3);

        // i = 0; i < question.length; i++ { inner loop}
        //j=0 ; j < question[0].length; j++ { if question[i][j] == question[i][2] then score += 10 else score += 0}
                question[0][0] = "What is the range of short data type in Java?";
                question[0][1] = "-2147483648 to 2147483647";
                question[0][2] = "-32768 to 32767";
                question[0][3] = "-128 to 127";
                question[0][4] = "None of the mentioned";

                question[1][0] = "What is the range of byte data type in Java?";
                question[1][1] = "-2147483648 to 2147483647";
                question[1][2] = "-32768 to 32767";
                question[1][3] = "-128 to 127";
                question[1][4] = "None of the mentioned";

                question[2][0] = "Which component is used to compile, debug and execute java program?";
                question[2][1] = "JVM";
                question[2][2] = "JIT";
                question[2][3] = "JRE";
                question[2][4] = "JDK";

                question[3][0] = "Which statement is true about java?";
                question[3][1] = "Platform dependent programming language";
                question[3][2] = "Platform independent programming language";
                question[3][3] = "Code dependent programming language";
                question[3][4] = "Sequence dependent programming language";

                question[4][0] = "Which of the following is a valid declaration of an object of class Box?";
                question[4][1] = "Box obj = new Box();";
                question[4][2] = "Box obj = new Box;";
                question[4][3] = "obj = new Box();";
                question[4][4] = "new Box obj;";

                question[5][0] = "Which of these operators can be used to concatenate two String objects?";
                question[5][1] = "&";
                question[5][2] = "+=";
                question[5][3] = "+";
                question[5][4] = "||";

                question[6][0] = "Which class is used to generate random number?";
                question[6][1] = "java.util.Random";
                question[6][2] = "java.util.randomnumber";
                question[6][3] = "java.lang.Object";
                question[6][4] = "java.util.Object";

                question[7][0] = "Which of these class is superclass of String and StringBuffer class?";
                question[7][1] = "java.util";
                question[7][2] = "java.lang";
                question[7][3] = "ArrayList";
                question[7][4] = "None of the mentioned";

                question[8][0] = "Which of the following is not OOPS concept in Java?";
                question[8][1] = "Inheritance";
                question[8][2] = "Encapsulation";
                question[8][3] = "Polymorphism";
                question[8][4] = "Compilation";

                question[9][0] = "Which of these selection statements test only for equality?";
                question[9][1] = "Switch";
                question[9][2] = "if";
                question[9][3] = "if & switch";
                question[9][4] = "none of the mentioned";

                ra[0] = question[0][2];
                ra[1] = question[1][3];
                ra[2] = question[2][4];
                ra[3] = question[3][2];
                ra[4] = question[4][1];
                ra[5] = question[5][3];
                ra[6] = question[6][1];
                ra[7] = question[7][2];
                ra[8] = question[8][4];
                ra[9] = question[9][1];


        opt1=new JRadioButton("");
        opt1.setBounds(120,450,450,35);
        opt1.setFont(new Font("Poppins",Font.PLAIN,15));
        opt1.setBackground(Color.WHITE);
        add(opt1);

        opt2=new JRadioButton("");
        opt2.setBounds(120,490,450,35);
        opt2.setFont(new Font("Poppins",Font.PLAIN,15));
        opt2.setBackground(Color.WHITE);
        add(opt2);

        opt3=new JRadioButton("");
        opt3.setBounds(120,530,450,35);
        opt3.setFont(new Font("Poppins",Font.PLAIN,15));
        opt3.setBackground(Color.WHITE);
        add(opt3);

        opt4=new JRadioButton("");
        opt4.setBounds(120,570,450,35);
        opt4.setFont(new Font("Poppins",Font.PLAIN,15));
        opt4.setBackground(Color.WHITE);
        add(opt4);

        grp=new ButtonGroup();
        grp.add(opt1);
        grp.add(opt2);
        grp.add(opt3);
        grp.add(opt4);

        b2=new JButton("Submit");
        b2.setFont(new Font("Poppins",Font.BOLD,15));
        b2.setEnabled(false);
        b2.setBounds(800,600,100,30);
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        b3=new JButton("Hint");
        b3.setFont(new Font("Poppins",Font.BOLD,15));
        b3.setBounds(800,550,100,30);
        b3.setBackground(new Color(30, 144, 254));
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);

        b4=new JButton("Next");
        b4.setFont(new Font("Poppins",Font.BOLD,15));
        b4.setBounds(800,500,100,30);
        b4.setBackground(new Color(30, 144, 254));
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        add(b4);

        start(0);


    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b4){       //NEXt BUTTON
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given=1;

            if(grp.getSelection()==null){
                ans[count][0] = "";
            }else{
                ans[count][0]=(grp.getSelection().getActionCommand());
            }

            if(count == 8)
            {
                b4.setEnabled(false);
                b2.setEnabled(true);
            }

            count++;
            start(count);
        }
        else if(ae.getSource() == b2){      //SUBMIT BUTTON
            ans_given=1;
            if(grp.getSelection()==null){
                ans[count][0] = "";
            }else
            {
                ans[count][0] = grp.getSelection().getActionCommand();
            }

            for(int i=0;i<ans.length;i++){
                if(ans[i][0] == (ra[i]))
                {
                    score = score + 10;
                }else{
                    score = score + 0;
                }
            }
            this.setVisible(false);
            new Score(username, score).setVisible(true);

        }
        else if(ae.getSource() == b3){      //HINT
            if(count==2||count==4||count==6||count==8||count==9)
            {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }
            else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            b3.setEnabled(false);

        }else{
            this.count = 0;
        }
    }
    public void paint(Graphics g){
        super.paint(g);
        String timer="Time left - "+ time;
        g.setColor(Color.RED);
        g.setFont(new Font("Poppins",Font.BOLD,18));

        if(time > 0){
            g.drawString(timer,800,450);
        }
        else{
            g.drawString("Times up!!",800,450);
        }

        time--;

        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }

        if(ans_given==1)
        {
            ans_given=0;
            time=10;
        }
        else if(time < 0)
        {
            time =10;

            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if(count == 8)
            {
                b4.setEnabled(false);
                b2.setEnabled(true);
            }
            if(count==9){
                if(grp.getSelection()==null){
                    ans[count][0] = "";
                }else
                {
                    ans[count][0] = grp.getSelection().getActionCommand();
                }
                
                for(int i=0;i<ans.length;i++){
                    if(ans[i][0] == (ra[i]))
                    {
                        score = score + 10;
                    }else{
                        score = score + 0;
                    }
                }

                this.setVisible(false);
                new Score(username, score).setVisible(true);
            }else{
                if(grp.getSelection()==null){
                    ans[count][0] = "";
                }else{
                    ans[count][0]=(grp.getSelection().getActionCommand());
                }
                count++;
                start(count);
            }
        }
    }

    public void start(int count){
        l2.setText(""+ (count+1)+".");
        l3.setText(question[count][0]);
        opt1.setText(question[count][1]);
        opt1.setActionCommand(question[count][1]);
        opt2.setText(question[count][2]);
        opt2.setActionCommand(question[count][2]);
        opt3.setText(question[count][3]);
        opt3.setActionCommand(question[count][3]);
        opt4.setText(question[count][4]);
        opt4.setActionCommand(question[count][4]);
        grp.clearSelection();

    }
  
    public static void main(String args[]){
        new Start("").setVisible(true);
    }
}