package com.company;

public class Main {

    public static void main(String[] args) {

        double x = 10.0;
        double y = 3.0;
        int i;
        char ch;
        byte b;

        i = (int) (x/y) ; // type casting
        System.out.println("i is " + i);

        i = 100;
        b = (byte)i;
        System.out.println("b is " + b);

        i = 257;
        b = (byte)i;
        System.out.println("b is " + b);

        b = 88;
        ch = (char)b;
        System.out.println("ch is " + ch);
    }
}
