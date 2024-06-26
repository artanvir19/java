/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_practice;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class RestaurantMenu {
    
    JLabel totalPriceLabel;
    double totalPrice = 0;
    JFrame frame;

    RestaurantMenu() {
        frame = new JFrame();
        
        JLabel l1 = new JLabel("RESTAURANT");
        JLabel l2 = new JLabel("MENU");
        JLabel l3 = new JLabel("SNACKS- ");
        JLabel l4 = new JLabel("MAIN COURSE- ");
        JLabel l5 = new JLabel("DESSERTS- ");
        JLabel l6 = new JLabel("DINNER- ");
        
        JLabel l7 = new JLabel("cancel");
        JLabel l8 = new JLabel("Place an order ");
        
        JCheckBox j1 = new JCheckBox("1. Chips            -10");
        JCheckBox j2 = new JCheckBox("2. Popcorn        -20");
        JCheckBox j3 = new JCheckBox("3. Candy        -5");
        JCheckBox j4 = new JCheckBox("4. Cookies        25");
        
        JCheckBox j11 = new JCheckBox("1. Bhuna Khicuri       -130");
        JCheckBox j12 = new JCheckBox("2. Kacchi Biriani         -200");
        JCheckBox j13 = new JCheckBox("3. Kala Bhuna       -170");
        JCheckBox j14 = new JCheckBox("4. Panta ilish       -150");
        
        JCheckBox j21 = new JCheckBox("1. Misti Doi        -30");
        JCheckBox j22 = new JCheckBox("2. Shondesh      -10");
        JCheckBox j23 = new JCheckBox("3. Roshogolla     -40");
        JCheckBox j24 = new JCheckBox("4. Jilapi      -180");
        
        JCheckBox j31 = new JCheckBox("1. Chicken Biriani      -150");
        JCheckBox j32 = new JCheckBox("2. Tehari      -130");
        JCheckBox j33 = new JCheckBox("3. Mutton      -170");
        
        totalPriceLabel = new JLabel("Total Price: ");
        
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(l8);
        frame.add(totalPriceLabel);
        
        frame.add(j1);
        frame.add(j2);
        frame.add(j3);
        frame.add(j4);
        frame.add(j11);
        frame.add(j12);
        frame.add(j13);
        frame.add(j14);
        frame.add(j21);
        frame.add(j22);
        frame.add(j23);
        frame.add(j24);
        frame.add(j31);
        frame.add(j32);
        frame.add(j33);
        
        l1.setBounds(50, 50, 100, 20);
        l2.setBounds(50, 70, 100, 20);
        l3.setBounds(50, 100, 100, 20);
        l4.setBounds(50, 150, 100, 20);
        l5.setBounds(50, 200, 100, 20);
        l6.setBounds(50, 250, 100, 20);
        
        l7.setBounds(500, 50, 100, 20); // cancel
        l8.setBounds(500, 70, 100, 20); // place an order
        totalPriceLabel.setBounds(500, 100, 200, 20);
        
        j1.setBounds(50, 130, 200, 20);
        j2.setBounds(50, 160, 200, 20);
        j3.setBounds(50, 190, 200, 20);
        j4.setBounds(50, 220, 200, 20);
        
        j11.setBounds(50, 280, 200, 20);
        j12.setBounds(50, 310, 200, 20);
        j13.setBounds(50, 340, 200, 20);
        j14.setBounds(50, 370, 200, 20);
        
        j21.setBounds(50, 430, 200, 20);
        j22.setBounds(50, 460, 200, 20);
        j23.setBounds(50, 490, 200, 20);
        j24.setBounds(50, 520, 200, 20);
        
        j31.setBounds(50, 570, 200, 20);
        j32.setBounds(50, 600, 200, 20);
        j33.setBounds(50, 630, 200, 20);
        
        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.setVisible(true);
        
        // Add action listeners to checkboxes
        ActionListener checkBoxListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTotalPrice();
            }
        };
        
        j1.addActionListener(checkBoxListener);
        j2.addActionListener(checkBoxListener);
        j3.addActionListener(checkBoxListener);
        j4.addActionListener(checkBoxListener);
        j11.addActionListener(checkBoxListener);
        j12.addActionListener(checkBoxListener);
        j13.addActionListener(checkBoxListener);
        j14.addActionListener(checkBoxListener);
        j21.addActionListener(checkBoxListener);
        j22.addActionListener(checkBoxListener);
        j23.addActionListener(checkBoxListener);
        j24.addActionListener(checkBoxListener);
        j31.addActionListener(checkBoxListener);
        j32.addActionListener(checkBoxListener);
        j33.addActionListener(checkBoxListener);
    }
    
    private void updateTotalPrice() {
        double totalPrice = 0;
        
        // Check each checkbox, if selected, extract price and add to total
        Component[] components = frame.getContentPane().getComponents();
        for (Component component : components) {
            if (component instanceof JCheckBox) {
                JCheckBox checkBox = (JCheckBox) component;
                if (checkBox.isSelected()) {
                    String[] parts = checkBox.getText().split(" ");
                    totalPrice += Double.parseDouble(parts[parts.length - 1]);
                }
            }
        }
        
        // Update the total price label
        totalPriceLabel.setText("Total Price: " + totalPrice);
    }
    
    public static void main(String[] args) {
        RestaurantMenu o = new RestaurantMenu();
    }
}


/**
 *
 * @author User
 */
public class resturnet1 {
    
}
