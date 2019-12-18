package com.kodilla.testing.shape;

class Circle implements Shape {

    final private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getName() {
        return "Koło";
    }

    @Override
    public double getField() {
        return Math.PI * r *r;
    }
}

