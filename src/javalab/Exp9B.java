/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author rishabh
 */
public class Exp9B extends JApplet{

    
    @Override
    public void init() {
        super.init(); //To change body of generated methods, choose Tools | Templates.
            System.out.println("Init() called");
       }

    @Override
    public void start() {
        super.start(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("start called"); 
    }
    
    
    public void paint(Graphics g){
        super.paint(g);
        System.out.println("Paint called");
        
      g.setColor(Color.BLACK);  
g.drawString("Rishabh",40, 50);  
g.drawLine(20,30,20,200); 
  
g.setColor(Color.CYAN);
g.fillRect(50,120,30,30);

g.setColor(Color.BLUE);  
g.fillOval(20,50,30,30);

g.setColor(Color.BLACK);  
g.fillOval(50,50,30,30);

g.setColor(Color.RED);  
g.fillOval(80,50,30,30);

g.setColor(Color.YELLOW);  
g.fillOval(35,80,30,30);

g.setColor(Color.GREEN);  
g.fillOval(65,80,30,30);

       
    }

    @Override
    public void stop() {
        super.stop(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Stop called");
    }

    @Override
    public void destroy() {
        super.destroy(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Destroy called");
    }
    
    
}
