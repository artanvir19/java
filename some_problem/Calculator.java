
package java_practice;
import java.applet.*;
import javax.swing.*;
import java.awt.*;
 
import java.awt.event.*;

class calc
{
    
    calc(){
        JFrame frame=new JFrame("Calculator");
        
         TextField t1=new TextField();
         
         JButton b1=new JButton("1");
         JButton b2=new JButton("2");
         JButton b3=new JButton("3");
         JButton b4=new JButton("4");
         JButton b5=new JButton("5");
         JButton b6=new JButton("6");
         JButton b7=new JButton("7");
         JButton b8=new JButton("8");
         JButton b9=new JButton("9");
         JButton b10=new JButton(".");
         JButton b11=new JButton("0");
         JButton b12=new JButton("*10");
         JButton b13=new JButton("%");
         JButton b14=new JButton("C");
         JButton b15=new JButton("+");
         JButton b16=new JButton("-");
         JButton b17=new JButton("*");
         JButton b18=new JButton("/");
         JButton b19=new JButton("=");
         JButton b20=new JButton("ON");
         
         
         
         
         
         
         
         t1.setBounds(50,50,350,50);
         b1.setBounds(50,100,70,50);
         b2.setBounds(120,100,70,50);
         b3.setBounds(190,100,70,50);
         b4.setBounds(50,150,70,50);
         b5.setBounds(120,150,70,50);
         b6.setBounds(190,150,70,50);
         b7.setBounds(50,200,70,50);
         b8.setBounds(120,200,70,50);
         b9.setBounds(190,200,70,50);
         b10.setBounds(50,250,70,50);
         b11.setBounds(120,250,70,50);
         b12.setBounds(190,250,70,50);
         
         b13.setBounds(260,100,70,50);
         b14.setBounds(330,100,70,50);
         b15.setBounds(260,150,70,50);
         b16.setBounds(330,150,70,50);
         b17.setBounds(260,200,70,50);
         b18.setBounds(330,200,70,50);
         b19.setBounds(260,250,70,50);
         b20.setBounds(330,250,70,50);
         
         
       
         
         
         
         frame.add(t1);
         frame.add(b1);
         frame.add(b2);
         frame.add(b3);
         frame.add(b4);
         frame.add(b5);
         frame.add(b6);
         frame.add(b7);
         frame.add(b8);
         frame.add(b9);
         frame.add(b10);
         frame.add(b11);
         frame.add(b12);
         frame.add(b13);
         frame.add(b14);
         frame.add(b15);
         frame.add(b16);
         frame.add(b17);
         frame.add(b18);
         frame.add(b19);
         frame.add(b20);
         
         
         
         
         
         
         
         frame.setSize(500,500);
         frame.setLayout(null);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class Calculator {
    public static void main(String[] args) {
        calc c=new calc();
    }
}

   
    
    

