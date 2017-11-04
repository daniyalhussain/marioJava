/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.interfaces;

/**
 *
 * @author Daniyal
 */
public interface Player {
    public int x = 0;
    public int y = 0;
    
    public void springen();
    public void rechts();
    public void links();
    public void bukken();

    void paintComponent();
}
