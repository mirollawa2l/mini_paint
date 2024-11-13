/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_paint;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mirol
 */
public class DrawingEngineII implements DrawingEngine {

    private int circleCount = 0, lineCount = 0, squareCount = 0, recCount = 0;

    public ArrayList<Shape> shapes = new ArrayList<>();
    private Map<Shape, String> shapeList = new HashMap<>();

    @Override
    public void addShape(Shape shape, String key) {
        int count = 0;
        shapes.add(shape);
        if (key.equals("circle")) {
            count = circleCount;
            circleCount++;
        } else if (key.equals("square")) {
            count = squareCount;
            squareCount++;
        } else if (key.equals("rectangle")) {
            count = recCount;
            recCount++;
        } else if (key.equals("line")) {
            count = lineCount;
            lineCount++;
        }
        shapeList.put(shape, shape.generateId(count));

    }

    @Override
    public void removeShape(Shape shape) {
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            shapeList.remove(shape);
        } else {
            return;
        }

    }

    @Override
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    /**
     *
     * @return
     */
    public Map<Shape, String> getMap() {
        return shapeList;

    }

    @Override
    public void refresh(Graphics canvas) {
        for (Shape s : shapes) {
            s.draw(canvas);
        }
    }

    public Shape getShape(String id) {
        for (Shape s : shapes) {
            if (id.equals(s.getId())) {
                return s;
            }
        }
        return null;
    }

}
