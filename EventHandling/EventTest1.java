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
public class EventTest1 extends JFrame implements KeyListener{
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b; 
    public EventTest1(){
        l1 = new JLabel("First number");
        l2 = new JLabel("Second number");
        l3= new JLabel("Result");
        t1= new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        b = new JButton("Calculate");
        b.addKeyListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        setLayout(new FlowLayout(FlowLayout.LEFT, 140,10));
        setSize(400,300);
        setVisible(true);
    }
    public void keyPressed(KeyEvent ke){
        int x, y, z;
        x = Integer.parseInt(t1.getText());
        y = Integer.parseInt(t2.getText());
        if(ke.getKeyChar()== 'a'){
            z = x+y;
        }else if(ke.getKeyChar()== 'b'){
            z = x-y;
        }else{
            t3.setText("Press a or s");
            return;
        }
        t3.setText(String.valueOf(z));
    }
    public void keyTyped(KeyEvent ke){}
    public void keyReleased(KeyEvent ke){}
    public static void main(String args[]){
        new EventTest1();
    }
}
