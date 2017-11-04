/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Daniyal
 */
public class Menu extends JPanel{
    private Frame frame;
    private Image backgroundImage;
    private int x;
    private int y;
    
    public Menu(Frame frame){
        this.frame = frame;
        initComponent();
    }
    
    private void initComponent(){
        
        x = frame.getX();
        y = frame.getY();
        setPreferredSize(new Dimension(x, y));
        
        try {
            backgroundImage = ImageIO.read(new File("sprites/mainscreen.png"));
            backgroundImage = backgroundImage.getScaledInstance(x, y, Image.SCALE_SMOOTH);
        } catch (IOException ex) {
            frame.dispose();
            System.out.println("Image can\'t be loaded");
        }
        
        JButton start = new JButton("Start");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.switchPanel(new Game(frame));
            }
        });
        add(start);
        setVisible(true);
    }
    
 
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, this);
    }
}
