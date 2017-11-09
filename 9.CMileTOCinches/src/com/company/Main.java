package com.company;

public class Main {

    public static void main(String[] args) {

        double miles = 1;
        double inches;

        inches = 5280 * 12 * miles;

        long cMiles = (long)(miles * miles * miles);

        long cInches = (long)(inches * inches * inches);

        System.out.println(cMiles + " cubic miles is " + cInches + " cubic inches. ");


    }
}
