/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.lang.String.valueOf;

/**
 *
 * @author mirol
 */
public class LineSegment extends ShapeII {
   

    @Override
    public void draw(Graphics canvas) {
        double xend = super.getProperties().get("Xend");
        double yend = super.getProperties().get("Yend");
        canvas.drawLine(position.x, position.y, (int)xend,(int) yend);
    }

    @Override
    public void colorize(Graphics canvas) {
// Graphics2D g2 = (Graphics2D) canvas;
//
//   
    canvas.setColor(getFillColor());
        System.out.println(getFillColor());
  
//
//    g2.setStroke(new BasicStroke(100));
  double xend = super.getProperties().get("Xend");
        double yend = super.getProperties().get("Yend");
//
//    g2.drawLine(position.x, position.y,(int) xend, (int)yend);   

 canvas.drawLine(position.x, position.y,
                            (int) xend, (int) yend);
            }
    
    @Override
    public String generateId(int count)
    {
        this.id= "Line"+ valueOf(count);
        return this.id;
    }

}
