/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;


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

    private ArrayList<Shape> shapes = new ArrayList<>();
    private Map<Shape, String> shapeList = new HashMap<>();

    @Override
    public void addShape(Shape shape) {
        int count = 0;
        shapes.add(shape);
        if (shape instanceof Circle) {
            count = circleCount;
            circleCount++;
        } else if (shape instanceof Square) {
            count = squareCount;
            squareCount++;
        } else if (shape instanceof Rectangle) {
            count = recCount;
            recCount++;
        } else if (shape instanceof LineSegment) {
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
