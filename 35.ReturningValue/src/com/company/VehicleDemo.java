package com.company;
class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;

    int range(){
        return fuelcap * mpg;
    }
}

public class VehicleDemo {

    public static void main(String[] args) {
	// write your code here
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;


        int range1, range2;

        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("Minivan can carry "+ minivan.passengers + " passengers with range "+ range1+" miles");
       System.out.println("Sportsar can carry "+ sportscar.passengers + " passengers with range "+ range2+ " miles");

//        System.out.println("Minivan can carry "+ minivan.passengers + " passengers with range "+ minivan.range()+" miles");
//        System.out.println("Sportsar can carry "+ sportscar.passengers + " passengers with range "+ sportscar.range()+ " miles");

    }
}
