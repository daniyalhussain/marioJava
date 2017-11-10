/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Daniyal
 */
public class Frame extends JFrame{
    private int x = 1280;
    private int y = 720;
    private JPanel panel;
    
    
    public Frame(){
       initComponent();
    }
    
    private void initComponent(){
        setTitle("Mario the Game");
        setSize(x, y);
        
        setResizable(false);
        setFocusable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new Menu(this);
        add(panel);
        setVisible(true);
    }
    
    
    public void switchPanel(JPanel panel){
        remove(this.panel);
        add(panel);
        if(panel instanceof Game){
            addKeyListener((Game)panel);
        }
        revalidate();
        repaint();
    }
    
    @Override
    public int getX(){
        return x;
    }
    
    @Override
    public int getY(){
        return y;
    }
    
}
