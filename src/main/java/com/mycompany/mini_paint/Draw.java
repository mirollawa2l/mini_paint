/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_paint;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author mirol
 */
public class Draw extends javax.swing.JPanel {

    private DrawingEngineII engine;

    public Draw(DrawingEngineII engine) {
        this.engine = engine;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 

        for (Shape shape : engine.getShapes()) {
            shape.draw(g);  
        }
    }
}




