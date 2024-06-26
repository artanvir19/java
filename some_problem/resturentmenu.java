package java_practice;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class resturent {

    resturent() {

        JFrame f = new JFrame();

        f.setSize(1000, 1000);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        JLabel l0 = new JLabel("Resturent Menu");
        JLabel l1 = new JLabel("BreakFast");
        JLabel l2 = new JLabel("Lunch");
        JLabel l3 = new JLabel("Dinner");
        JLabel l4 = new JLabel("Dessert");
        

       JCheckBox c11 = new JCheckBox("Roti - ৳30.00");
       JCheckBox c12 = new JCheckBox("Nun - ৳20.00");
       JCheckBox c13 = new JCheckBox("Dhal - ৳40.00");
       JCheckBox c14 = new JCheckBox("Sobji - ৳60.00");
       JCheckBox c15 = new JCheckBox("Omlet - ৳70.00");
       JCheckBox c16 = new JCheckBox("Dim khichuri - ৳90.00");

       // Lunch
       JCheckBox c21 = new JCheckBox("Rice - ৳25.00");
       JCheckBox c22 = new JCheckBox("Chicken Curry - ৳80.00");
       JCheckBox c23 = new JCheckBox("Vegetable Curry - ৳50.00");
       JCheckBox c24 = new JCheckBox("Salad - ৳35.00");
       JCheckBox c25 = new JCheckBox("Dal - ৳40.00");

       // Dinner
       JCheckBox c31 = new JCheckBox("Spaghetti - ৳60.00");
       JCheckBox c32 = new JCheckBox("Meatballs - ৳85.00");
       JCheckBox c33 = new JCheckBox("Garlic Bread - ৳30.00");
       JCheckBox c34 = new JCheckBox("Caesar Salad - ৳40.00");
       JCheckBox c35 = new JCheckBox("Soup - ৳35.00");

       // Dessert
       JCheckBox c41 = new JCheckBox("Chocolate Cake - ৳50.00");
       JCheckBox c42 = new JCheckBox("Ice Cream - ৳30.00");
       JCheckBox c43 = new JCheckBox("Fruit Salad - ৳45.00");
       JCheckBox c44 = new JCheckBox("Cheesecake - ৳60.00");
       JCheckBox c45 = new JCheckBox("Pudding - ৳25.00");

        
        

        l0.setBounds(400, 50, 150, 50);
        l1.setBounds(100, 100, 150, 50);
        l2.setBounds(300, 100, 150, 50);
        l3.setBounds(500, 100, 150, 50);
        l4.setBounds(700, 100, 150, 50);
        

        c11.setBounds(100, 150, 150, 50);
        c12.setBounds(100, 200, 150, 50);
        c13.setBounds(100, 250, 150, 50);
        c14.setBounds(100, 300, 150, 50);
        c15.setBounds(100, 350, 150, 50);

        c21.setBounds(300, 150, 150, 50);
        c22.setBounds(300, 200, 150, 50);
        c23.setBounds(300, 250, 150, 50);
        c24.setBounds(300, 300, 150, 50);
        c25.setBounds(300, 350, 150, 50);

        c31.setBounds(500, 150, 150, 50);
        c32.setBounds(500, 200, 150, 50);
        c33.setBounds(500, 250, 150, 50);
        c34.setBounds(500, 300, 150, 50);
        c35.setBounds(500, 350, 150, 50);

        c41.setBounds(700, 150, 150, 50);
        c42.setBounds(700, 200, 150, 50);
        c43.setBounds(700, 250, 150, 50);
        c44.setBounds(700, 300, 150, 50);
        c45.setBounds(700, 350, 150, 50);

        

       
        f.add(l0);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
       
       

        f.add(c11);
        f.add(c12);
        f.add(c13);
        f.add(c14);
        f.add(c15);
      
        
        f.add(c21);
        f.add(c22);
        f.add(c23);
        f.add(c24);
        f.add(c25);
      
        f.add(c31);
        f.add(c32);
        f.add(c33);
        f.add(c34);
        f.add(c35);
     
        
        f.add(c41);
        f.add(c42);
        f.add(c43);
        f.add(c44);
        f.add(c45);
     

    }
}

public class resturentmenu {

    public static void main(String[] args) {
        resturent r = new resturent();
    }


}
