package com.company;

public class Main {

    public static void main(String[] args) {

        double gallon;
        double litter;
        int count =0;

        for(gallon = 1; gallon<=100; gallon++){
            litter = 3.785 * gallon;
            System.out.println(gallon + " gallons is " + litter + " litters");
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }


    }
}
