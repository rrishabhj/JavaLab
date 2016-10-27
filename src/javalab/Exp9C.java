/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JApplet;

/**
 *
 * @author rishabh
 */
public class Exp9C extends JApplet{

    private Image image;

    @Override
    public void init() {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        image=getImage(getCodeBase(),"bg_main.jpg");
        setBackground(Color.YELLOW);
    }

    @Override
    public void paint(Graphics g) {
        
            super.paint(g); //To change body of generated methods, choose Tools | Templates.
            System.out.println(getCodeBase());
            g.drawString("rishabh moving image", 10, 10);
            
            for(int i=0;i<500;i++){
                try {
                    g.drawImage(image, i,200,this);
                    
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Exp9C.class.getName()).log(Level.SEVERE, null, ex);
                }
            
    }
    
    
    
}
}
