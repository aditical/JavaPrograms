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
public class EventText extends JFrame implements TextListener{
    TextField t; 
    Label l; 
    public EventText(){
         t = new TextField(20);
         l = new Label();
         setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));         
         add(t);
         add(l);
         t.addTextListener(this);
         setSize(400, 300);
         setVisible(true);
    }
    public void textValueChanged(TextEvent te){
        if(te.getSource()== t){
         String msg = "You typed" + t.getText();
         l.setText(msg);
        }            
    }
    public static void main(String args[]){
        new EventText();
    }
}
