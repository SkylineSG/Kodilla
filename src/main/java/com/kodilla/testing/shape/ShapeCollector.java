
package com.kodilla.testing.shape;

import java.util.ArrayList;

class ShapeCollector {

    ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }
    public boolean removeFromList(Shape shape) {
        boolean result = false;
        if (figures.contains(shape)){
            figures.remove(shape);
            result = true;
        }
        return result;
    }


    public Shape getFigure(int n) {
            return figures.get(n);
    }
}

