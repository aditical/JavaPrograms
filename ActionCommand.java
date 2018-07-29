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
public class ActionCommand extends JFrame implements ActionListener {
    JLabel l; 
    JButton b1, b2;
    ActionCommand(){
        l = new JLabel();
        l.setBounds(60, 50, 170, 20);
        setLayout(null);
        setSize(300, 200);
        b1 = new JButton("Continue");
        b2 = new JButton("Ok");
        b1.setBounds(50, 120, 80, 30);
        b2.setBounds(140, 120, 80, 30);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b1.setActionCommand("proceed");
        b2.setActionCommand("proceed");
        add(l);
        add(b1);
        add(b2);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "proceed"){
            l.setText("Do you want to proceed?");
        }
    }
    public static void main (String args[]){
         new ActionCommand();
    }
}
