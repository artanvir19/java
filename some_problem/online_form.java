
package java_practice;
import java.applet.*;
import java.awt.*;
import javax.swing.*; 
import java.awt.Event.*;
class onlineform{
   onlineform(){
        JFrame z=new JFrame();
        
        JLabel l0=new JLabel("Online Form");
        JLabel l1=new JLabel("First Name:");
        JLabel l2=new JLabel("Last Name:");
        JLabel l3=new JLabel("Email:");
        JLabel l4=new JLabel("Password:");
        JLabel l5=new JLabel("Mobile:");
        JLabel l6=new JLabel("Qualification:");
        JLabel l7=new JLabel("Gender:");
        Button b1=new Button("Submit");
        TextField t1=new TextField();
        TextField t2=new TextField();
        TextField t3=new TextField();
        TextField t4=new TextField();
        TextField t5=new TextField();
        JCheckBox c1=new JCheckBox("SSC");
        JCheckBox c2=new JCheckBox("HSC");
        JCheckBox c3=new JCheckBox("BSC");
        JRadioButton rb1=new JRadioButton("Male");
        JRadioButton rb2=new JRadioButton("Female");
        JRadioButton rb3=new JRadioButton("Others");
        
        z.add(l0);
        z.add(l1);
        z.add(l2);
        z.add(l3);
        z.add(l4);
        z.add(l5);
        z.add(l6);
        z.add(l7);
        z.add(b1);
        z.add(t1);
        z.add(t2);
        z.add(t3);
        z.add(t4);
        z.add(t5);
        z.add(c1);
        z.add(c2);
        z.add(c3);
        z.add(rb1);
        z.add(rb2);
        z.add(rb3);
        
        l0.setBounds(250,50,100,50);
        l1.setBounds(50,100,100,50);
        l2.setBounds(50,150,100,50);
        l3.setBounds(50,200,100,50);
        l4.setBounds(50,250,100,50);
        l5.setBounds(50,300,100,50);
        l6.setBounds(50,350,100,50);
        l7.setBounds(50,400,100,50);
        
        t1.setBounds(150,100,300,50);
        t2.setBounds(150,150,300,50);
        t3.setBounds(150,200,300,50);
        t4.setBounds(150,250,300,50);
        t5.setBounds(150,300,300,50);
        
        c1.setBounds(150,350,50,50);
        c2.setBounds(200,350,50,50);
        c3.setBounds(250,350,50,50);
        
        rb1.setBounds(150,400,70,50);
        rb2.setBounds(250,400,70,50);
        rb3.setBounds(350,400,70,50);
      
        b1.setBounds(50,500,100,50);

        
        z.setSize(600,600);
        z.setLayout(null);
        z.setVisible(true); 
        z.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


public class online_form {
    public static void main(String[] args) {
        onlineform o=new onlineform();
    
    }
    
}
