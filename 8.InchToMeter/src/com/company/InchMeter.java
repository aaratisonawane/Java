package com.company;

public class InchMeter {

    public static void main(String[] args) {
        double inches;
        double meter;
        int feet = 12;
        for(inches =1; inches<12*feet; inches++) {
            meter = inches / 39.37;
            System.out.println(inches + " inches is " + meter + " meters");
            if(inches % 12 == 0)
                System.out.println();
        }
    }
}