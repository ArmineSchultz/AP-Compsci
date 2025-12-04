/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.game;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author ASchultz2026
 */
public class Game  extends JPanel{
    public Game(){
        super();
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("BasicJPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        
        Game panel = new Game();
        
        frame.setContentPane(panel);
        frame.setVisible(true);
    
    }
    public void paintComponent(Graphics g){
       //filled shapes
       
       //Color set to light grey
       g.setColor(Color.LIGHT_GRAY);
       g.fillRect(0,200,400,100);
    }
}