/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.snowman;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ASchultz2026
 */
public class Snowman extends JPanel{
    public Snowman(){
        super();
    }
    
    //Setting up frame
    public static void main(String arg[]){
        JFrame frame = new JFrame("BasicJPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        
        Snowman panel = new Snowman();
        
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
    
    //Creating Snowman
    public void paintComponent(Graphics g){
       //filled shapes
       
       //Color set to light grey
       g.setColor(Color.LIGHT_GRAY);
       g.fillRect(0,200,400,100);
       
       //Color set to white
       g.setColor(Color.WHITE);
       g.fillOval(140, 125, 100, 100);
       g.fillOval(150, 75, 75, 75);
       g.fillOval(160, 40, 50, 50);
       
       //Color set to black
       g.setColor(Color.BLACK);
       g.fillOval(170, 50, 10, 10);
       g.fillOval(190, 50, 10, 10);
       g.fillOval(180, 100, 15, 15);
       g.fillOval(180, 120, 15, 15);
       g.fillOval(180, 140, 15, 15);
       g.fillRect(0, 300, 400, 200);
       
       //Color set to orange
       g.setColor(Color.ORANGE);
       
            //x coordinates of the vertices
            int[] x = { 220, 185, 185};
       
            //y coordinatats of the vertices
            int[] y = { 75, 60, 70};
       
            //Number of vertices
            int nPoints = 3;
      
            g.fillPolygon(x, y, nPoints);
       
       //Color set to green
       g.setColor(Color.GREEN);
       
            //x coordinates of the vertices
            int[] x2 = {300, 325, 360};
       
            //y coordinates of the vertices
            int[] y2 = {200, 20, 200};
       
            //Number of vertices
            int nPoints2 = 3;
       
            g.fillPolygon(x2, y2, nPoints2);
       
       
               
    }       
        
}
