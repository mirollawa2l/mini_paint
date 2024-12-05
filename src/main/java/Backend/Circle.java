/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import static java.lang.String.valueOf;
import java.util.Map;
import javax.swing.text.Position;

/**
 *
 * @author mirol
 */
public class Circle extends ShapeII{


    @Override
    public void draw(Graphics canvas) {
       double r= super.getProperties().get("radius");
       
       int radius=(int) r;
           canvas.setColor(this.fillColor);
        canvas.fillOval(position.x - radius, position.y - radius, 2 * radius, 2 * radius);
        canvas.setColor(this.color);
        canvas.drawOval(position.x - radius, position.y - radius, 2 * radius, 2 * radius);
     
    }

    @Override
    public void colorize(Graphics canvas) {
       double r= super.getProperties().get("radius");
      int radius=(int) r;
        canvas.setColor(this.fillColor);
        canvas.fillOval(position.x - radius, position.y - radius, 2 * radius, 2 * radius); 
           canvas.setColor(this.color);
        canvas.drawOval(position.x - radius, position.y - radius, 2 * radius, 2 * radius);    
    }
    
     @Override
    public String generateId(int count)
    {
        this.id= "Circle"+ valueOf(count);
  
        return id;
    }
    
    
}
