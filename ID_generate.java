
package Id;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


class generate implements ActionListener
{
    JFrame f=new JFrame();
    JButton b2;
    JButton b1;
    JTextField t1;
            
    generate()
    {
        
        f.setSize(1500,1500);
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("GENERATE ID");
       
        

        

        JPanel p=new JPanel();
        p.setBounds(400,100,800,700);
        p.setLayout(null);
        p.setVisible(true);
        p.setBackground(Color.GRAY);
        f.add(p); 


    

        Font fn1=new Font("Arial",Font.BOLD,40);

        Font fn2=new Font("Arial",Font.PLAIN,30);

        Font fn3=new Font("Arial",Font.PLAIN,20);


        JLabel l1=new JLabel("GENERATE ID CARD");
        l1.setBounds(200,60,400,50);
        l1.setFont(fn1);

        
        JLabel l2=new JLabel("Student Username");
        l2.setBounds(120,195,280,50);
        l2.setFont(fn2);
        t1=new JTextField();
        t1.setFont(fn3);
        t1.setBounds(120,260,500,40);
        
        JLabel l3=new JLabel("Student Password");
        l3.setBounds(120,310,280,50);
        l3.setFont(fn2);
        JPasswordField t2=new JPasswordField();
        t2.setBounds(120,370,500,40);
        t2.setFont(fn3);
        t2.setEchoChar('*');

        //JCheckBox c=new JCheckBox("Show Password");
        //c.setBounds(120,415,200,40);
        //c.setFont(fn3);

        b1=new JButton("Generate Id Card");
        b1.setBounds(220,480,300,50);
        b1.setFont(fn2);
        
        ImageIcon i1=new ImageIcon("C:\\mini logo\\back.jpg");
        b2=new JButton(i1);
        b2.setBounds(30,40,20,20);
        b2.setFont(fn3);


        
        p.add(l1);
        p.add(l2);
        p.add(t1);
        p.add(t2);
        p.add(l3);
        p.add(b1);
        p.add(b2);
        
        b2.addActionListener(this);
        b1.addActionListener(this);
       

        


    }
    public void actionPerformed(ActionEvent e)
    {
        
       Object ob=e.getSource();
       
       if(ob==b2)
       {
           
              f.setVisible(false);
              new login().setVisible(true);
       
        }
       else if(ob==b1)
       {
           String id=t1.getText();
           
            
             f.setVisible(false);
           try {
               new id(id); /*catch (ClassNotFoundException ex) {
               Logger.getLogger(generate.class.getName()).log(Level.SEVERE, null, ex);
               }*/
           } catch (SQLException | ClassNotFoundException ex) {
               Logger.getLogger(generate.class.getName()).log(Level.SEVERE, null, ex);
           }
       
        }
    }

    public static void main (String args[])
    {
        generate g=new generate();

    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

    