package com.company;

public class Main {

    public static void main(String[] args) {

        int x = 10;

        if(x == 10) {
            int y = 20;
            System.out.println("X and Y are " + x + " " + y);

            x = y * 2;
        }

        System.out.println("x is " + x);
        x++;
        System.out.println(x);

    }
}
