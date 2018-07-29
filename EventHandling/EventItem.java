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
public class EventItem extends JFrame implements ItemListener {
        JRadioButton rb1, rb2;
        ButtonGroup bg;
        JComboBox cb;
        public EventItem(){
            rb1 = new JRadioButton("Male");
            rb2 = new JRadioButton("Female");
            bg = new ButtonGroup();
            String cn[]={"Nepal", "India" , "BHutan", "America"};
            cb = new JComboBox(cn);
            bg.add(rb1);
            bg.add(rb2);
            add(rb1);
            add(rb2);
            add(cb);
            rb1.addItemListener(this);
            rb2.addItemListener(this);
            cb.addItemListener(this);
            setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));
            setSize(400, 300);
            setVisible(true);            
        }
        public void itemStateChanged(ItemEvent ie){
            if(ie.getSource()== rb1 && rb1.isSelected()== true)
                JOptionPane.showMessageDialog(this, "You are male");
            if(ie.getSource() == rb2 && rb2.isSelected()== true)
                JOptionPane.showMessageDialog(this, "YOu are female");
            if(ie.getSource()== cb && ie.getStateChange()== ie.SELECTED)
                JOptionPane.showMessageDialog(this, "Your country is" + cb.getSelectedItem());
        }
    public static void main(String args[]){
         new EventItem();    }
    
}
