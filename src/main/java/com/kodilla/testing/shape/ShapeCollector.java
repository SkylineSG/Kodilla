/*
package com.kodilla.testing.shape;

import java.util.ArrayList;

interface Shape {
   void shapeCollector(String name);
   void getField(int field);
}

class Triangle implements Shape {

    String name = "Triangle";
    private int a = 2;
    private int h = 5;
    int field = (a*h) / 2;

    public Triangle(String name, int a, int h) {
        this.name = name;
        this.a = a;
        this.h = h;
    }

    public void shapeCollector(String name) {
        System.out.println(name);
    }
    public void getField(int field){
        System.out.println(field);
    }
}

class Square implements Shape{

    private String name = "Square";
    private int a=3;
    private int field= a*a;

    public Square(String name, int a) {
        this.name = name;
        this.a = a;
    }

    public void shapeCollector(String name) {
        System.out.println(name);
    }
    public void getField(int field){
        System.out.println(field);
    }
}

class Circle implements Shape{

    private String name = "Circle";
    private double pi = 3.14;
    private int r=3;
    private double field = (r*r)*pi;

    public Circle(String name, double pi, int r) {
        this.name = name;
        this.pi = pi;
        this.r = r;
    }

    public void shapeCollector(String name) {
        System.out.println(name);
    }
    public void getField(int field){
        System.out.println(field);
    }
}

class ShapeCollector {

    ArrayList<Circle> figures = new ArrayList<>();



    public ShapeCollector(ArrayList<Circle> circles) {
        this.figures = circles;
    }

    public void addFigure(Shape shape) {

    }

    public boolean removeFromList(Shape shape) {
        boolean result = false;
        if (figures.contains(shape)){
            figures.remove(shape);
            result = true;
        }
        return result;
    }


    public ShapeCollector getFigure(int n) {
        Circle shape = null;
        if (n >= 0 && n < figures.size()) {
            shape = figures.get(n);
        }
        return shape;
}

*/