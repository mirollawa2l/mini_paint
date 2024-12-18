/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Graphics;
import static java.lang.String.valueOf;

/**
 *
 * @author mirol
 */
public class Rectangle extends ShapeII{

    @Override
    public void draw(Graphics canvas) {
       double length=super.getProperties().get("length");
        double width=super.getProperties().get("width");
             canvas.setColor(getFillColor());
     canvas.fillRect(position.x, position.y,(int)length,(int) width);
        canvas.setColor(getColor());
      canvas.drawRect(position.x, position.y,(int) length,(int) width);   
   
      
    }

    @Override
    public void colorize(Graphics canvas) {
double length=super.getProperties().get("length");
        double width=super.getProperties().get("width");
                  canvas.setColor(fillColor); 
      canvas.fillRect(position.x, position.y,(int)length,(int) width);
    }
    
     @Override
    public String generateId(int count)
    {
        this.id= "Rectangle"+ valueOf(count);
        return this.id;
    }
    
}
