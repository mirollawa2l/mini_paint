/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_paint;

import java.awt.Graphics;
import static java.lang.String.valueOf;

/**
 *
 * @author mirol
 */
public class Square extends ShapeII{
  

    @Override
    public void draw(Graphics canvas) {
      double side=super.getProperties().get("side");
      canvas.setColor(getFillColor());
      canvas.fillRect(position.x, position.y,(int) side,(int) side);
      canvas.setColor(getColor());
      canvas.drawRect(position.x, position.y,(int) side,(int) side);
      
      
    }

    @Override
    public void colorize(Graphics canvas) {
          double side=super.getProperties().get("side");
          canvas.setColor(fillColor); 
        canvas.fillRect(position.x, position.y, (int)side,(int) side); 
    }
    
     @Override
    public String generateId(int count)
    {
        this.id= "Square"+ valueOf(count);
        return this.id;
    }
     
}
