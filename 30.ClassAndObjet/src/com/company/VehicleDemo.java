package com.company;
class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;
}

public class VehicleDemo {

    public static void main(String[] args) {
	// write your code here
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1;
        int range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Minivan can carry "+ minivan.passengers + " passangers with a range of "+ range1+" miles");
        System.out.println("Sportscar can carry "+ sportscar.passengers + " passangers with a range of "+ range2+ " miles");
    }
}
