package com.kodilla.testing.shape;

class Triangle implements Shape {

    final private double a;
    final private double b;
    final private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getName() {
        return "Trójkat";
    }

    @Override
    public double getField() {
        return Math.sqrt(
                (a+b+c) * (a+b-c) * (a-b+c) * (-1 * a + b + c)
        ) / 4;
    }
}