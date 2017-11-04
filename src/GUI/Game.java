/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import src.interfaces.Player;

/**
 *
 * @author Daniyal
 */
public class Game extends JPanel implements KeyListener{

    private Frame frame;
    private int x;
    private int y;
    private Player player;

    public Game(Frame frame) {
        this.frame = frame;
        initComponent();
    }

    private void initComponent() {
        x = frame.getX();
        y = frame.getY();
        setPreferredSize(new Dimension(x, y));
        setBackground(Color.decode("#8080FF"));
        setFocusable(true);
        requestFocusInWindow();
        setVisible(true);

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            player.links();
        }

        if (key == KeyEvent.VK_RIGHT) {
            player.rechts();
        }

        if (key == KeyEvent.VK_SPACE) {
            player.springen();
            System.out.println("space");
        }

        if (key == KeyEvent.VK_DOWN) {
            player.bukken();
            System.out.println("down");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
