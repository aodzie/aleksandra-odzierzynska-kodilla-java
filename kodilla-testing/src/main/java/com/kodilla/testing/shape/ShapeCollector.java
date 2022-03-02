package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeCollector {
    private List<Shape> listOfShapes = new ArrayList();

    public ShapeCollector() {
    }

    public void addFigure(Shape shape) {
        this.listOfShapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (this.listOfShapes.contains(shape)) {
            this.listOfShapes.remove(shape);
            result = true;
        }

        return true;
    }

    public int getShapesQuantity() {
        return this.listOfShapes.size();
    }

    public Shape getFigure(int n) {
        return n >= 0 && n < this.getShapesQuantity() ? (Shape)this.listOfShapes.get(n) : null;
    }

    public String showFigures() {
        String names = "";

        String var10000;
        for(Iterator var2 = this.listOfShapes.iterator(); var2.hasNext(); names = var10000 + names) {
            Shape shape = (Shape)var2.next();
            var10000 = shape.getShapeName();
        }

        return names;
    }
}