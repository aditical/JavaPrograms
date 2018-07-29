/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Anjel
 */
public class EventDemo extends JFrame implements ActionListener {
    JTextField t;
    JButton b;
    EventDemo(){
        t = new JTextField(20);
        t.setBounds(60, 70, 170, 20);
        setLayout(null);
        b = new JButton("CLick me");
        b.setBounds(100, 120, 80, 30);
        b.addActionListener(this);
        add(b);
        add(t);
        setSize(300, 200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        t.setText("welcome");
    }
    public static void main(String args[]){
         new EventDemo();
    }
}
