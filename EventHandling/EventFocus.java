/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.EventHandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Anjel
 */
public class EventFocus extends JFrame implements FocusListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b;
    public EventFocus(){
        l1 = new JLabel("First number");
        l2 = new JLabel("Second number");
        l3 = new JLabel ("Result");
        t1 = new JTextField(20);
        t2= new JTextField(20);
        t3 = new JTextField(20);
        b= new JButton("Calculate");
        t1.addFocusListener(this);
        t2.addFocusListener(this);
        b.addFocusListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        setLayout(new FlowLayout(FlowLayout.LEFT, 140, 10));
        setSize(400, 300);
        setVisible(true);
    }
    public void focusGained(FocusEvent fe){
        int x , y, z;
         if(fe.getSource()==b){              
            x = Integer.parseInt(t1.getText());
            y = Integer.parseInt(t2.getText());
            z = x*y;
            t3.setText(String.valueOf(z));
         }  
    }
    public void focusLost(FocusEvent fe){
        if(fe.getSource()== t1 && t1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "You must enter a value");
            t1.requestFocus();
        }
        if(fe.getSource()== t2 && t2.getText().equals("")){
            JOptionPane.showMessageDialog(this,"You must enter a value");
            t2.requestFocus();
        }
    }
    public static void main (String args[]){
        new EventFocus();
    }
    
}
