/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Anjel
 */
public class EventPrac extends JFrame implements ActionListener{
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2;
    public EventPrac(){
        l1 = new JLabel("First Number");
        l2 = new JLabel("Second Number");
        l3 = new JLabel("Result");
        t1= new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        b1 = new JButton("Multiply");
        b2 = new JButton ("Divide");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
        add(b2);
        setLayout(new FlowLayout(FlowLayout.LEFT, 150, 10));
        setSize(400, 300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        int x, y, z;
        x = Integer.parseInt(t1.getText());
        y = Integer.parseInt(t2.getText());
        if(ae.getActionCommand()== "Multiply")
            z = x*y;
        else
            z = x/y;
        t3.setText(String.valueOf(z));
    }
    public static void main(String args[]){
        new EventPrac();
    }
 }
