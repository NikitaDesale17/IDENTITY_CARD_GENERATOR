
package Id;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class id
{
    JFrame f1=new JFrame();
    ResultSet rs;
    String nm;
    
    JLabel l4;
    JLabel l5;
    JLabel l6;
    JLabel l7;
    JLabel l8;
    JLabel l9;
    JLabel l10;
    JLabel l11;
    
    JLabel lf1;
    JLabel lf2;
    JLabel lf3;
    JLabel lf4;
    JLabel lf5;
    JLabel lf6;
    JLabel lf7;
    JLabel lf8;
    JLabel lf9;
    JLabel lf10;
    JLabel lf11;
    JLabel lf12;
    
    File fl;
    String si;
    ImageIcon i5;
    
    JButton save;
    JButton exit;
    
    
    id(String id) throws SQLException, ClassNotFoundException
    {
        f1.setVisible(true);
        f1.setTitle("IDCARD");
        f1.setSize(1500,1500);
        f1.setLayout(null);
        f1.setVisible(true);
        
        
        
        
        Font fn1=new Font("Arial",Font.BOLD,40);
        Font fn2=new Font("Arial",Font.BOLD,25);
        Font fn3=new Font("Arial",Font.BOLD,19);
        Font fn4=new Font("Arial",Font.BOLD,30);
        Font fn5=new Font("Arial",Font.BOLD,36);
        
        JPanel p1=new JPanel();
        p1.setBounds(440,30,1040,950);
        p1.setLayout(null);
        p1.setVisible(true);
        p1.setBackground(Color.black);
        f1.add(p1);
        
        JPanel p2=new JPanel();
        p2.setBounds(30,30,980,890); //890
        p2.setLayout(null);
        p2.setVisible(true);
        p2.setBackground(Color.GRAY);
        p1.add(p2);
        
        
        JLabel l1=new JLabel("Govt. Polytechnic, Aurangabad");
        l1.setBounds(210,7,630,60);
        l1.setFont(fn1);
        l1.setForeground(Color.RED);
        p2.add(l1);
        
        ImageIcon i=new ImageIcon("C:\\mini logo\\gpa.jpg");
        JLabel l2=new JLabel("      (An Autonomous Institute of Govt. of Maharashtra)",i,JLabel.CENTER);
        l2.setBounds(40,20,750,110);
        l2.setFont(fn2);
        l2.setForeground(Color.black);
        p2.add(l2);
        
        JLabel l3=new JLabel("Osmanpura, Aurangabad Ph:0240-2334724");
        l3.setBounds(235,75,600,60);
        l3.setFont(fn2);
        l3.setForeground(Color.black);
        p2.add(l3);
        
        JLabel l12=new JLabel("___________________________________________________________________________________________");
        l12.setBounds(0,100,1030,50);
        l12.setFont(fn1);
        l12.setForeground(Color.BLACK);
        p2.add(l12);
        
        JLabel l13=new JLabel("Student Identity Card");
        l13.setBounds(450,230,400,40);
        l13.setFont(fn5);
        l13.setForeground(Color.black);
        p2.add(l13);
        
        l4=new JLabel("NAME                                  :");
        l4.setBounds(210,375,300,40);
        l4.setFont(fn3);
        l4.setForeground(Color.black);
        p2.add(l4);
        
        l5=new JLabel("EMAIL                                 :");
        l5.setBounds(210,425,300,40);
        l5.setFont(fn3);
        l5.setForeground(Color.black);
        p2.add(l5);
        
        l6=new JLabel("PROGRAMME                   :");
        l6.setBounds(210,470,300,40);
        l6.setFont(fn3);
        l6.setForeground(Color.black);
        p2.add(l6);
        
        l7=new JLabel("DOB                                    :");
        l7.setBounds(210,525,300,40);
        l7.setFont(fn3);
        l4.setForeground(Color.black);
        p2.add(l7);
        
        l8=new JLabel("ENROLLMENT NO            :");
        l8.setBounds(210,570,300,40);
        l8.setFont(fn3);
        l8.setForeground(Color.black);
        p2.add(l8);
        
        l9=new JLabel("BLOOD GROUP                 :");
        l9.setBounds(210,625,300,40);
        l9.setFont(fn3);
        l9.setForeground(Color.black);
        p2.add(l9);
        
        l10=new JLabel("CONTACT NO                    :");
        l10.setBounds(210,670,300,40);
        l10.setFont(fn3);
        l10.setForeground(Color.black);
        p2.add(l10);
        
        l11=new JLabel("AADHAR NO                       :");
        l11.setBounds(210,725,300,40);
        l11.setFont(fn3);
        l11.setForeground(Color.black);
        p2.add(l11);
        
        l12=new JLabel("ADDRESS                           :");
        l12.setBounds(210,770,300,40);
        l12.setFont(fn3);
        l12.setForeground(Color.black);
        p2.add(l12);
        
        
        //name
        lf1=new JLabel("");      
        lf1.setBounds(530,370,500,40);
        lf1.setFont(fn3);
        lf1.setForeground(Color.black);
        p2.add(lf1);
        
        //email
        lf2=new JLabel("");
        lf2.setBounds(530,425,500,40);
        lf2.setFont(fn3);
        lf2.setForeground(Color.black);
        p2.add(lf2);
        
        //programme
        lf3=new JLabel("");
        lf3.setBounds(530,470,500,40);
        lf3.setFont(fn3);
        lf3.setForeground(Color.black);
        p2.add(lf3);
        
        //day
        lf4=new JLabel("");
        lf4.setBounds(530,525,35,40);
        lf4.setFont(fn3);
        lf4.setForeground(Color.black);
        p2.add(lf4);
        
        //month
        lf5=new JLabel("");
        lf5.setBounds(560,525,35,40);
        lf5.setFont(fn3);
        lf5.setForeground(Color.black);
        p2.add(lf5);
        
        //year
        lf6=new JLabel("");
        lf6.setBounds(580,525,65,40);
        lf6.setFont(fn3);
        lf6.setForeground(Color.black);
        p2.add(lf6);
        
        //enrollment
        lf7=new JLabel("");
        lf7.setBounds(530,570,400,40);
        lf7.setFont(fn3);
        lf7.setForeground(Color.black);
        p2.add(lf7);
        
        //blood group
        lf8=new JLabel("");
        lf8.setBounds(530,620,400,40);
        lf8.setFont(fn3);
        lf8.setForeground(Color.black);
        p2.add(lf8);
        
        //contact no
        lf9=new JLabel("");
        lf9.setBounds(530,670,400,40);
        lf9.setFont(fn3);
        lf9.setForeground(Color.black);
        p2.add(lf9);
        
        //aadhar no
        lf10=new JLabel("");
        lf10.setBounds(530,720,400,40);
        lf10.setFont(fn3);
        lf10.setForeground(Color.black);
        p2.add(lf10);
        
        //address
        lf11=new JLabel("");
        lf11.setBounds(530,770,400,40);
        lf11.setFont(fn3);
        lf11.setForeground(Color.black);
        p2.add(lf11);
        
        
        //image
        //ImageIcon i=new ImageIcon("");
        
        
        
        //i5 = new ImageIcon(""+si);
        lf12=new JLabel();
        lf12.setBounds(210,170,170,200);
        p2.add(lf12);
        
        
       /* ImageIcon i1=new ImageIcon("C:\\Users\\Neha\\Desktop\\save.jpg");
        save=new JButton("Save",i1);
        save.setBounds(1450,500,80,50);
        f1.add(save);
        
        
        
        exit=new JButton("Exit");
        ImageIcon i2=new ImageIcon("C:\\Users\\Neha\\Desktop\\back.jpg");
        exit=new JButton("Exit",i2);
        exit.setBounds(1450,550,80,50);
        f1.add(exit);
        */
        
      
        
        
        
      
        
        try
            {
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/miniproject","app","app");
            Statement st = con.createStatement();
            System.out.println("success");
            
            
            String sql;
            sql = "select * from studentn where enro='"+id+"'";
            
            
           
            
            //PreparedStatement ps=con.prepareStatement(sql);
            
             rs=st.executeQuery(sql);
             
             
           
           if(rs.next())
           {  
               //setIcon(new ImageIcon
               lf1.setText(rs.getString("NAME"));
               lf2.setText(rs.getString("EMAIL"));
               lf3.setText(rs.getString("PROGRAMEE"));
               lf4.setText(rs.getString("DAY"));
               lf5.setText(rs.getString("MONTH"));
               lf6.setText(rs.getString("Y"));
               lf7.setText(rs.getString("ENRO"));
               lf8.setText(rs.getString("BLOODGROUP"));
               lf9.setText(rs.getString("CONTACT"));
               lf10.setText(rs.getString("AADHAR"));
               lf11.setText(rs.getString("AADRESS"));
               lf12.setIcon(new ImageIcon(rs.getString("IMAGE")));
              // si=rs.getString("IMAGE");
               
               
           }
              System.out.println(si);
            }
            catch(ClassNotFoundException cnfe)
            {
            out.println("Class Not Found : " + cnfe);
            }
            catch(SQLException ex)
            {
            out.println("SQL Exception : " + ex);
            }
        
        
        
    }
     public static void main(String args[])
     {
         id i=new id();
         
     }

    private id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}     
                 
             
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

