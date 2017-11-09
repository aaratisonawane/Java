package com.company;

public class CircleDemo {

    public static void main(String[] args) {
	// write your code here
        Circle c1 = new Circle(1.0);
        System.out.println(c1.count);
        System.out.println(Circle.count);

        Circle c2 = new Circle(2.0);
        System.out.println(c2.count);
        System.out.println(Circle.count);

        System.out.println(c1.getRadius());
        System.out.println(c1.perimeter());
        System.out.println(c1.area());

        System.out.println(c2.getRadius());
        System.out.println(c2.perimeter());
        System.out.println(c2.area());

        System.out.println(c1.PI);
        c1.PI = 3.0;
        System.out.println(c1.PI);
        c2.PI = 2.0;
        System.out.println(c1.PI);

        System.out.println();

        System.out.println(c1.getRadius());
        System.out.println(c1.perimeter());
        System.out.println(c1.area());

        System.out.println(c2.getRadius());
        System.out.println(c2.perimeter());
        System.out.println(c2.area());

    }
}
