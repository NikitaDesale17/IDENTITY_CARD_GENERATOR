
package Id;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class login implements ActionListener
{
    JFrame f=new JFrame();
    JButton b1;
    JTextField t1=new JTextField();
    JPasswordField t2=new JPasswordField();
    JButton b2;
    
    login()
    {
        
        f.setSize(1500,1500);
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("ADMIN LOGIN");

        

        JPanel p=new JPanel();
        p.setBounds(400,100,800,700);
        p.setLayout(null);
        p.setVisible(true);
        p.setBackground(Color.GRAY);
        f.add(p); 


    

        Font fn1=new Font("Arial",Font.BOLD,40);

        Font fn2=new Font("Arial",Font.PLAIN,30);

        Font fn3=new Font("Arial",Font.PLAIN,20);

        
        JLabel l1=new JLabel("LOG IN");
        l1.setBounds(320,100,300,50);
        l1.setFont(fn1);

        
        JLabel l2=new JLabel("Username");
        l2.setBounds(120,195,200,50);
        l2.setFont(fn2);
        
        t1.setBounds(120,260,500,40);
        t1.setFont(fn3);
        
        
        
        JLabel l3=new JLabel("Password");
        l3.setBounds(120,310,200,50);
        l3.setFont(fn2);
        
        
        t2.setBounds(120,370,500,40);
        t2.setFont(fn3);
        t2.setEchoChar('*');

        //JCheckBox c=new JCheckBox("Show Password");
        //c.setBounds(120,415,200,40);
        //c.setFont(fn3);

        b1=new JButton("Login");
        b1.setBounds(270,480,220,50);
        b1.setFont(fn2);
        
        ImageIcon i1=new ImageIcon("C:\\mini logo\\back.jpg");
        b2=new JButton(i1);
        b2.setBounds(30,40,20,20);
        b2.setFont(fn3);

       /* JLabel l4=new JLabel("Sign Up");
        l4.setBounds(120,530,200,40);
        l4.setFont(fn3);

        JLabel l5=new JLabel("Forgot Password?");
        l5.setBounds(120,562,200,40);
        l5.setFont(fn3);*/

        
        p.add(l1);
        p.add(l2);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(b1);
        p.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);

        


    }
    public void actionPerformed(ActionEvent e)
    {
        
       Object ob=e.getSource();
       
       
           String s1=t1.getText();
           String s2=t2.getText();
       
     if(ob==b1)
       {
           if(s1.equals("Admin" )&& s2.equals("GPA123"))
           {
              f.setVisible(false);
              new generate().setVisible(true);
              
            
           }
           else 
           {
           
            JOptionPane.showConfirmDialog(null," Invalid Username / Password ","Select",JOptionPane.DEFAULT_OPTION);
            new login().setVisible(true);
            
           }
         
       }
       else if(ob==b2)
       {
           
              f.setVisible(false);
              new Home().setVisible(true);
       
        }
           
    
    }
       
           
       
       
       
    

    public static void main (String args[])
    {
        login lgn=new login();

    }

    void setVisible(boolean b)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

    