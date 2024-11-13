/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mini_paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author mirol
 */
public interface Shape {
    // set position
    public void setPosition(Point position);
    public Point getPosition();
    
    //update shape specific properties
    public void setProperties(Map<String , Double> properties);
    public Map<String , Double> getProperties();
    
    // Colorize
    public void setColor(Color color);
    public Color getColor();
    public void setFillColor(Color color);
    public Color getFillColor();
    
    //redraw the shape
    public void draw(java.awt.Graphics canvas); 
     public void colorize(Graphics canvas);
          public String generateId(int count);
          public String getId(); 

}
