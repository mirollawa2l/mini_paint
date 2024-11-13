/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public abstract class ShapeII implements Shape {

   protected Map<String, Double> properties;
     protected Point position;
     protected Color color;
     protected Color fillColor;
     protected String id;

     public ShapeII()
     {
         this.color=Color.BLACK;
        this.fillColor=Color.WHITE;
     }
     
    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Point getPosition() {
        return this.position;
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
    }

    @Override
    public Map<String, Double> getProperties() {
        return this.properties;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    @Override
    public Color getFillColor() {
        return this.fillColor;
    }

    @Override
    public abstract void draw(Graphics canvas);

    @Override
    public abstract void colorize(Graphics canvas);

    @Override
    public abstract String generateId(int count);
    
    @Override
    public String getId()
    {
        return this.id;
    }
    
    
    

}
