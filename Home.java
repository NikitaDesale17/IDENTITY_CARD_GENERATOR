
package Id;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



 class Home implements ActionListener
{
     
     JButton b1;
     JFrame f=new JFrame();
     JButton b2;
     JButton b3;
     
   Home()
   {
       
       f.setSize(1200,1200);
       f.setVisible(true);
       f.setLayout(null);
       f.setTitle("HOME PAGE");
       
       Font fn1=new Font("Arial",Font.BOLD,22);
       Font fn2=new Font("Arial",Font.BOLD,25);
       Font fn3=new Font("Arial",Font.BOLD,35);
       Font fn4=new Font("Arial",Font.PLAIN,20);
       Font fn5=new Font("Arial",Font.PLAIN,19);
       Font fn6=new Font("Arial",Font.BOLD,40);
       
       
       
       JPanel p1=new JPanel();
       p1.setBounds(300,200,600,600);
       p1.setLayout(null);
       p1.setVisible(true);
       p1.setBackground(Color.GRAY);
       f.add(p1);

       
       JPanel p2=new JPanel();
       p2.setBounds(900,200,600,600);
       p2.setLayout(null);
       p2.setVisible(true);
       p2.setBackground(Color.BLACK);
       f.add(p2);
   
       ImageIcon i1=new ImageIcon("C:\\mini logo\\admin.jpg");
       b1=new JButton("  ADMIN ",i1);
       b1.setBounds(150,100,300,100);
       p2.add(b1);
       //f.add(b1);
       b1.setFont(fn1);
      
       
       
       ImageIcon i2=new ImageIcon("C:\\mini logo\\student.jpg");
       b2=new JButton(" STUDENT",i2);
       b2.setBounds(150,250,300,100);
       p2.add(b2);
       //f.add(b2);
       b2.setFont(fn1);
       
       ImageIcon i3=new ImageIcon("C:\\mini logo\\exit1.jpg");
       b3=new JButton("    EXIT   ",i3);
       b3.setBounds(150,400,300,100);
       p2.add(b3);
       //f.add(b2);
       b3.setFont(fn1);
       
       JLabel l1=new JLabel("WELCOME TO GPA");
       l1.setBounds(700,50,450,60);
       l1.setFont(fn6);
       f.add(l1);
       
       JLabel l2=new JLabel("Identity Card Generator System");
       l2.setBounds(630,105,700,40);
       f.add(l2);
       l2.setFont(fn3);  
       
       JLabel ll2=new JLabel("Identity Card Generator System");
       ll2.setBounds(50,50,700,40);
       p1.add(ll2);
       ll2.setFont(fn3);  
       
       JLabel l3=new JLabel("MAKING ID CARDS HAS NEVER BEEN EASIER!");                 
       l3.setBounds(30,155,550,30);
       p1.add(l3);
       l3.setFont(fn4);  
       
       JLabel l4=new JLabel("Create GPA Student's Identity Card in easy way of minutes with");                 
       l4.setBounds(30,200,590,30);
       p1.add(l4);
       l4.setFont(fn5); 
       
       JLabel l5=new JLabel("GPA's easy to use GPA Identity Card Generator System . ");
       l5.setBounds(30,234,590,30);
       p1.add(l5);
       l5.setFont(fn5); 
       
       JLabel l6=new JLabel("To generate identity card explore : ");
       l6.setBounds(30,275,500,30);
       p1.add(l6);
       l6.setFont(fn1); 
       
       JLabel l7=new JLabel("1) ADMIN ");
       l7.setBounds(30,315,200,30);
       p1.add(l7);
       l7.setFont(fn4); 
       
       JLabel l8=new JLabel("-Log In");
       l8.setBounds(40,350,200,30);
       p1.add(l8);
       l8.setFont(fn4); 
       
       JLabel l9=new JLabel("-Generate Student Id Card");
       l9.setBounds(40,385,400,30);
       p1.add(l9);
       l9.setFont(fn4); 
       
       JLabel l10=new JLabel("2) STUDENT ");
       l10.setBounds(30,430,200,30);
       p1.add(l10);
       l10.setFont(fn4); 
       
       JLabel l11=new JLabel("-Set Details");
       l11.setBounds(40,465,200,30);
       p1.add(l11);
       l11.setFont(fn4); 
       
       JLabel l12=new JLabel("-Exit");
       l12.setBounds(40,500,200,30);
       p1.add(l12);
       l12.setFont(fn4); 
       
       
       
       
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
           new login().setVisible(true);
       }
       else if(ob==b2)
       {
           f.setVisible(false);
           
           
           student1 st=new student1();
           st.Show();
           dispose();
       }
       else if(ob==b3)
       {
           int a=JOptionPane.showConfirmDialog(null,"Do you really want to exit application","Select",JOptionPane.YES_NO_OPTION);
           e.getSource();
          
           if(a==0)
           {
               
         System.exit(0);
           }
           
       }
   }
    
    public static void main(String[] args) 
    {
       Home h=new Home();
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 }
