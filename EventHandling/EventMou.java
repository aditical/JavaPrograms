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
public class EventMou extends JFrame implements MouseListener{
    int x, y, r1, r2;
    public EventMou(){
    setTitle("Handling mouse event");
    addMouseListener(this);
    setSize(400, 300);
    setVisible(true);
    }
    public void mouseClicked(MouseEvent me){
       x = me.getX(); 
       y = me.getY();
       r1 = 60;
       r2 = 40;
       repaint();
    }
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me ){}
    public void mouseExited(MouseEvent me){}
    public void paint(Graphics g){
        g.drawOval(x, y, r1, r2);
    }
    public static void main(String args[]){
        new EventMou();
    }
}
