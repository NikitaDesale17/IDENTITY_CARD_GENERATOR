
package Id;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.swing.filechooser.FileSystemView;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


class Student implements ActionListener
{
    JButton b3;
    JFrame f=new JFrame();
    JButton b0=new JButton("Select Image");
    JLabel l=new JLabel("Selected");
    JButton b1;
    JButton b2;
    JTextField t1=new JTextField();
    JTextField t2=new JTextField();
    File fl;
    
     JComboBox c1;
     JComboBox c2;
     JComboBox c3;
     JComboBox c4;
     JTextField t4=new JTextField();
     JComboBox c5;
     JTextField t5=new JTextField();
     JTextField t6=new JTextField();
     JTextArea ta=new JTextArea(1,1);
    
    Student()
    {
        
        f.setSize(2500,2500);
        f.setVisible(true);
        f.setLayout(null);
       // f.setDefaultCloseOperation(JFrame.EXIT_ON_ClOSE);
        f.setTitle("student info");

        JPanel p=new JPanel();
        p.setBounds(460,20,1000,980);
        p.setVisible(true);
        p.setLayout(null);
        p.setBackground(Color.BLACK);
        f.add(p);
        
       

        Font fn1=new Font("Arial",Font.BOLD,35);

        Font fn2=new Font("Arial",Font.PLAIN,20);

        Font fn3=new Font("Arial",Font.PLAIN,20);
        
        Font fn4=new Font("Arial",Font.PLAIN,15);

        
        ImageIcon i = new ImageIcon("C:\\mini logo\\student.jpg");
        JLabel l1=new JLabel("STUDENT  INFORMATION",i,JLabel.CENTER);
        l1.setForeground(Color.WHITE);
        l1.setBounds(230,40,490,40);
        l1.setFont(fn1);

        JLabel l2=new JLabel("Name");
        l2.setBounds(200,120,100,20);
        l2.setFont(fn2);
        l2.setForeground(Color.WHITE);
        
        t1.setBounds(200,150,600,30);
        t1.setFont(fn2);

        JLabel l3=new JLabel("Email Id");
        l3.setBounds(200,190,150,20);
        l3.setFont(fn2);
        l3.setForeground(Color.WHITE);
        
        t2.setBounds(200,220,600,30);
        t2.setFont(fn2);

        /*JLabel l4=new JLabel("Gender");
        l4.setBounds(200,260,150,20);
        l4.setFont(fn2);
        JRadioButton r1=new JRadioButton("Male");
        r1.setBounds(200,290,150,30);
        JRadioButton r2=new JRadioButton("Female");
        r1.setBounds(360,290,150,30);*/
        


        JLabel l5=new JLabel("Programme");
        l5.setBounds(200,260,200,20);
        l5.setFont(fn2);
        l5.setForeground(Color.WHITE);
        String branch[]={"Select","Information Technology","Computer Engineering","AIML","E&TC","Mechanical Engineering","Civil Engineering","Electrical Engineering","DDGM","Automobile Engineering"};
        c1=new JComboBox(branch);
        c1.setFont(fn4);
        c1.setBounds(200,290,600,30);
        

        JLabel l6=new JLabel("DOB");
        l6.setBounds(200,330,100,20);
        l6.setFont(fn2);
        l6.setForeground(Color.WHITE);
        
        String day[]={"Day","1/","2/","3/","4/","5/","6/","7/","8/","9/","10/","11/","12/","13/","14/","15/","16/","17/","18/","19/","20/","21/","22/","23/","24/","25/","26/","27/","28/","29/","30/","31/"};
        c2=new JComboBox(day);
        c2.setFont(fn4);
        c2.setBounds(200,360,130,30);
        
        String month[]={"Month","1/","2/","3/","4/","5/","6/","7/","8/","9/","10/","11/","12/"};
        c3=new JComboBox(month);
        c3.setFont(fn4);
        c3.setBounds(350,360,130,30);
        
        String year[]={"Year","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
        c4=new JComboBox(year);
        c4.setFont(fn4);
        c4.setBounds(510,360,285,30);
        

        JLabel l7=new JLabel("Enrollment No");
        l7.setBounds(200,410,200,20);
        l7.setFont(fn2);
        l7.setForeground(Color.WHITE);
        
        t4.setBounds(200,450,600,30);
        t4.setFont(fn2);
        

        JLabel l8=new JLabel("Blood Group");
        l8.setBounds(200,500,200,20);
        l8.setFont(fn2);
        l8.setForeground(Color.WHITE);
        String bg[]={"Blood Group","A+","B+","AB+","O+","A-","B-","AB-","O-"};
        c5=new JComboBox(bg);
        c5.setFont(fn4);
        c5.setBounds(200,530,600,30);
                

        JLabel l9=new JLabel("Contact No");
        l9.setBounds(200,580,250,20);
        l9.setFont(fn2);
        l9.setForeground(Color.WHITE);
        
        t5.setBounds(200,610,600,30);
        t5.setFont(fn2);
        
        
        JLabel l10=new JLabel("Aadhar No");
        l10.setBounds(200,660,400,20);
        l10.setFont(fn2);
        l10.setForeground(Color.WHITE);
        
        t6.setBounds(200,690,600,30);
        t6.setFont(fn2);

        JLabel l11=new JLabel("Address");
        l11.setBounds(200,740,200,20);
        l11.setFont(fn2);
        l11.setForeground(Color.WHITE);
        
        ta.setBounds(200,770,600,50);
        ta.setFont(fn3);
        
       
        b0.setBounds(200,845,600,35);
        b0.setFont(fn2);
        
        
        
        ImageIcon i1= new ImageIcon("C:\\mini logo\\save.jpg");
        b1=new JButton("SUBMIT",i1);
        b1.setBounds(310,900,170,40);
        b1.setFont(fn2);
        
        ImageIcon i2= new ImageIcon("C:\\mini logo\\reset.jpg");
        b2=new JButton("RESET",i2);
        b2.setBounds(500,900,170,40);
        b2.setFont(fn2);
        
        ImageIcon i3=new ImageIcon("C:\\mini logo\\back.jpg");
        b3=new JButton(i3);
        b3.setBounds(30,40,20,20);
        b3.setFont(fn3);

        
        p.add(l1);
        p.add(l2);
        p.add(t1);
        p.add(l3);
        p.add(t2);
        p.add(l5);
        p.add(c1);
        p.add(l6);
        p.add(c2);
        p.add(c3);
        p.add(c4);
        p.add(l7);
        p.add(t4);
        p.add(l8);
        p.add(c5);
        p.add(l9);
        p.add(t5);
        p.add(l10);
        p.add(t6);
        p.add(l11);
        p.add(ta);
        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        
       b3.addActionListener(this);
       b0.addActionListener(this);
       b1.addActionListener(this);
       b2.addActionListener(this);
       
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
       Object ob=e.getSource();
       
       if(ob==b1)
       {
           
                String s1 = t1.getText();
                String s2 = t2.getText();
                String s3 = c1.getSelectedItem().toString();
                String s4 = c2.getSelectedItem().toString();
                String s5 = c3.getSelectedItem().toString();
                String s6 = c4.getSelectedItem().toString();
                String s7 = t4.getText();
                String s8 = c5.getSelectedItem().toString();
                String s9 = t5.getText();
                String s10 = t6.getText();
                String s11 = ta.getText();
                String s12 = ""+fl;
                
                       
               // String r = "insert into studentn values('" + s1+ ",'" + s2+ "','" + s3 + "'," + s4 +"','" + s5+ ",'" + s6+ "','" + s7 + "'," + s8 +"','" +s6+ "','" + s7 + "'," + s8 + "','"+s9+ "','" + s10 + "'," + s11+ "')";
              
               // st.executeUpdate(r);
                 
            
       
            try
            {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/miniproject","app","app");
            Statement st = con.createStatement();
            
            
                
            
                // String r = "insert into STUDENTN values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 +"','" + s5+ "','" + s6+ "','" + s7 + "','" + s8 +"','" +s6+ "','" + s7 + "','" + s8 + "','"+s9+ "','" + s10 + "','" + s11+ "')";
              
                 st.executeUpdate("insert into studentn values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"')");
                 
                 /*ImageIcon i5=new ImageIcon(""+fl);
                 JFrame jf1=new JFrame();
                 jf1.setLayout(new BorderLayout());
                 jf1.setVisible(true);
                 jf1.setSize(200,200);
                 JLabel img=new JLabel(i5);
                 img.setSize(100,100);
                 jf1.add(img);*/
                  
                  
                  
                 JFrame jf=new JFrame();
                 jf.setAlwaysOnTop(true);
                 JOptionPane.showMessageDialog(jf, "Submit successfully");
                 setVisible(false);
                 
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
       else if(ob==b3)
       {
          
              f.setVisible(false);
              new student1().setVisible(true);
       
        }
       else if(ob==b2)
               {
                   
                   new Student().setVisible(true);
               }
               
       else if(ob==b0)
       {
                 
           
           
            // create an object of JFileChooser class
            JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
 
            // set the selection mode to directories only
            j.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
 
            // invoke the showsSaveDialog function to show the save dialog
            int r = j.showSaveDialog(null);
 
            if (r == JFileChooser.APPROVE_OPTION)
            {
                // set the label to the path of the selected directory
                fl=j.getSelectedFile();
                System.out.println(fl);
                l.setText(j.getSelectedFile().getAbsolutePath());
            }
            // if the user cancelled the operation
            else
                l.setText("the user cancelled the operation");
        }
        // if the user presses the open dialog show the open dialog
        else 
        {
            // create an object of JFileChooser class
            JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
 
            // set the selection mode to directories only
            j.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
 
            // invoke the showsOpenDialog function to show the save dialog
            int r = j.showOpenDialog(null);
 
            if (r == JFileChooser.APPROVE_OPTION) 
            {
                // set the label to the path of the selected directory
                l.setText(j.getSelectedFile().getAbsolutePath());
                
                System.out.println("image save"+j.getSelectedFile().getAbsolutePath());
            }
            // if the user cancelled the operation
            else
                l.setText("the user cancelled the operation");
            
            
        }
       
        
    }


 
    public static void main(String args[])
    {
        Student stud =new Student();
        try
        {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/miniproject","app","app");
            Statement st = con.createStatement();
            
            System.out.println("connection successful");
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

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    

    
    

