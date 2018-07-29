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
public class OuterClass extends JFrame{
    JTextField t;
    JButton b;
    OuterClass(){
        t = new JTextField(20);
        t.setBounds(60, 50, 170, 20);
        setLayout(null);
        b = new JButton("Click me ");
        b.setBounds(100, 120, 80, 30);
        b.addActionListener(new Handler(this));
        add(t);
        add(b);
        setVisible(true);
    }
    public static void main(String args[]){
        new OuterClass();
    }
}
class Handler implements ActionListener{
    OuterClass ed; 
    Handler(OuterClass e){
        ed= e;
     }
    public void actionPerformed(ActionEvent e){
        ed.t.setText("Welcome");
                
    }
}
