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
public class EventWin extends JFrame implements WindowListener {
    JFrame frame ;
    public EventWin(){
     frame = new JFrame();
     frame.setTitle("Handling windows event");
     frame.addWindowListener(this);
     frame.setSize(400, 300);
     frame.setVisible(true);
    }
    public void windowClosing(WindowEvent we){
        JOptionPane.showMessageDialog(frame,"Goodbyeee!!");
        System.exit(1);
    }
    public void windowOpened(WindowEvent we){
        JOptionPane.showMessageDialog(frame, "Welcome");
    }
    public void windowIconified(WindowEvent we){
        JOptionPane.showMessageDialog(frame, "See you later");
    }
    public void windowDeiconified(WindowEvent we){
        JOptionPane.showMessageDialog(frame, "Welcome back!!!");
    }
      public void windowClosed(WindowEvent we){}
      public void windowActivated(WindowEvent we){}
      public void windowDeactivated(WindowEvent we){}

    public static void main(String args[]){
         new EventWin();
    }
    
}
