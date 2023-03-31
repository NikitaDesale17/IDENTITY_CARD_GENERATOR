package Id;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class student1 implements ActionListener
{

 JButton b3;
 JFrame f=new JFrame();
 JButton b1=new JButton("Set Details");
 JButton b2=new JButton("Exit");
     

   student1()
   {
       
       f.setSize(600,600);
       f.setVisible(true);
       f.setLayout(null);
       f.setTitle("student Home");
       
       Font fn1=new Font("Arial",Font.BOLD,22);
       Font fn3=new Font("Arial",Font.BOLD,20);
       Font fn2=new Font("Arial",Font.BOLD,30);
       Font fn4=new Font("Arial",Font.PLAIN,40);
       
       
       /*JPanel p1=new JPanel();
       p1.setBounds(300,200,600,600);
       p1.setLayout(null);
       p1.setVisible(true);
       p1.setBackground(Color.PINK);
       f.add(p1);*/

       
       JPanel p2=new JPanel();
       p2.setBounds(500,200,600,600);
       p2.setLayout(null);
       p2.setVisible(true);
       p2.setBackground(Color.BLACK);
       f.add(p2);
   
       
       b1.setBounds(150,170,300,100);
       p2.add(b1);
       //f.add(b1);
       b1.setFont(fn1);
      
       
       
       b2.setBounds(150,320,300,100);
       p2.add(b2);
       b2.setFont(fn1);
       
       
       
       
       
       
       
       
       Label l1=new Label("Student Page");
       l1.setBounds(170,40,450,50);
       p2.add(l1);
       l1.setFont(fn4); 
       l1.setForeground(Color.WHITE);
       
        ImageIcon i3=new ImageIcon("C:\\mini logo\\back.jpg");
        b3=new JButton(i3);
        b3.setBounds(30,30,20,20);
        b3.setFont(fn3);
        p2.add(b3);
       
       
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       
       
       
       
   }
   
   public void actionPerformed(ActionEvent e)
   {
       Object ob=e.getSource();
       if(ob==b1)
       {
           f.setVisible(false);
           new Student().setVisible(true);
       }
       else if(ob==b2)
       {
           int a=JOptionPane.showConfirmDialog(null,"Do you really want to exit application","Select",JOptionPane.YES_NO_OPTION);
           e.getSource();
          
           if(a==0)
           {
               
         System.exit(0);
           }
       }
       else if(ob==b3)
       {
           f.setVisible(false);
           new Home().setVisible(true);
       }
   }
    
 
   public static void main(String[] args) 
    {
       student1 stud=new student1();
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

  

    
}
