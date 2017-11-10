/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import src.interfaces.Player;

/**
 *
 * @author Daniyal
 */
public class Mario extends JLabel implements Player{
    private Image sprite;
    private int height = 100;
    private int width = 50;
    
    
    public Mario(){
        initComponent();
    }
    
    private void initComponent(){
        try {
            sprite = ImageIO.read(new File("sprites/mario.png"));
            sprite = sprite.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        } catch (IOException ex) {
         
            System.out.println("player can\'t be loaded");
        }
        setBounds(100, 100, width, height);
        setVisible(true);

    }
    
    @Override
    public void springen() {
        
    }

    @Override
    public void rechts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void links() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bukken() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(sprite, 30, 30, this);

    }

    
  
    
}
