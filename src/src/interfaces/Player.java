/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.interfaces;

import java.awt.Graphics;

/**
 *
 * @author Daniyal
 */
public interface Player {
   
    public void springen();
    public void rechts();
    public void links();
    public void bukken();

    void paintComponent(Graphics g);
}
