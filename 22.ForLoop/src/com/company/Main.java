package com.company;

public class Main {

    public static void main(String[] args) {

        int num;
        for(num=0; num < 100; num++){
            double sRoot = Math.sqrt(num);
            double rError = num - (sRoot * sRoot);

            System.out.println("Square root of " + num + " is" + sRoot);
            System.out.println("Rounding error is " + rError);
            System.out.println();
        }
        System.out.println("TASK FINISH");
    }
}
