package com.company;

public class Circle {
    private double radius;
    static double PI = 3.14159;
    static int count;

    public Circle(double radius){
        this.setRadius(radius);
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double perimeter(){
        return (2*PI*getRadius());
    }

    public double area(){
        return (PI * getRadius()*getRadius());
    }

}

