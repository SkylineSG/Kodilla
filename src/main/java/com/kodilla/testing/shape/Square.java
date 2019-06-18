package com.kodilla.testing.shape;

class Square implements Shape {
    final private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getName() {
        return "Kwadrat";
    }

    @Override
    public double getField() {
        return a*a;
    }
}