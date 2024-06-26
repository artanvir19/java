/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 public class java_simple_cal  extends JFrame implements ActionListener{
    
    private Container c;
    private JLabel lb1,lb2,res;
    private JTextField tx1,tx2;
    private JButton add,sub,div,mul,mod,sqr;
    
    java_simple_cal()
    {
        setTitle("My Calculator");
        setBounds(100,100,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
          
        c=getContentPane();
        c.setLayout(null);
        
        lb1=new JLabel("Enter 1st Num");
        lb1.setBounds(20, 20, 100, 20);
        c.add(lb1);
        tx1=new JTextField();
        tx1.setBounds(120,20,100,20);
        c.add(tx1);
        
        lb2=new JLabel("Enter 2nd Num");
        lb2.setBounds(20, 50, 100, 20);
        c.add(lb2);
        tx2=new JTextField();
        tx2.setBounds(120,50,100,20);
        c.add(tx2);
        
        add=new JButton("+");
        add.setBounds(10,80,50,30);
        c.add(add);
        sub=new JButton("-");
        sub.setBounds(70,80,50,30);
        c.add(sub);
        mul=new JButton("*");
        mul.setBounds(130,80,50,30);
        c.add(mul);
        div=new JButton("/");
        div.setBounds(190,80,50,30);
        c.add(div);
        mod=new JButton("%");
        mod.setBounds(250,80,50,30);
        c.add(mod);
        sqr=new JButton("^2 ");
        sqr.setBounds(10,130,70,30);
        c.add(sqr);
        
        res=new JLabel("Result: ");
        res.setBounds(10,200,150,20);
        c.add(res);
        
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        sqr.addActionListener(this);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        try {
            if(e.getSource()==add)
            {
                int a=Integer.parseInt(tx1.getText());
                int b=Integer.parseInt(tx2.getText());
                int c=a+b;
                res.setText("Result: "+c);
            }
            if(e.getSource()==add)
            {
                int a=Integer.parseInt(tx1.getText());
                int b=Integer.parseInt(tx2.getText());
                int c=a+b;
                res.setText("Result: "+c);
            }
            if(e.getSource()==sub)
            {
                int a=Integer.parseInt(tx1.getText());
                int b=Integer.parseInt(tx2.getText());
                int c=a-b;
                res.setText("Result: "+c);
            }
            if(e.getSource()==mul)
            {
                int a=Integer.parseInt(tx1.getText());
                int b=Integer.parseInt(tx2.getText());
                int c=a*b;
                res.setText("Result: "+c);
            }
            if(e.getSource()==div)
            {
                int a=Integer.parseInt(tx1.getText());
                int b=Integer.parseInt(tx2.getText());
                int c=a/b;
                res.setText("Result: "+c);
            }
            if(e.getSource()==mod)
            {
                int a=Integer.parseInt(tx1.getText());
                int b=Integer.parseInt(tx2.getText());
                int c=a%b;
                res.setText("Result: "+c);
            }
             if(e.getSource()==sqr)
            {
                int a=Integer.parseInt(tx1.getText());
                int b=Integer.parseInt(tx2.getText());
                int c=(a*a)+2*a*b+(b*b);
                res.setText("Result: "+c);
            }
        }catch(ArithmeticException z)
                {
                    res.setText("cant divided by zero");
                }
        catch(NumberFormatException z){
            res.setText("Enter Integer only");
        }
        
        
    }
     public static void main(String[] args) {
         java_simple_cal c=new java_simple_cal();
     }
}
