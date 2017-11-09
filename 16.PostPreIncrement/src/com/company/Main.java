package com.company;

public class Main {

    public static void main(String[] args) {

        int x = 10;
        int y = ++x;

        System.out.println("x = " +x + " & y = "+y);

        x = 10;
        y = x++;
        System.out.println("x = " +x + " & y = "+y);

        x = 10;
        System.out.println(x++);
        System.out.println(x);

        x = 10;
        System.out.println(++x);

    }
}
