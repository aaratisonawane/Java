package com.company;
class  Vehicle{
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    double fuelneeded(int miles){
        return  miles/mpg;

    }
}

public class VehicleDemo {

    public static void main(String[] args) {
	// write your code here
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportcar = new Vehicle(2, 14,12);
        int dist = 252;

        double gallons = minivan.fuelneeded(dist);
        System.out.println("To go "+ dist + " miles minivan needs "+ gallons+ " gallons of fuel");

        gallons = sportcar.fuelneeded(dist);
        System.out.println("To go "+ dist + " miles sportscar needs "+ gallons+ " gallons of fuel");
    }
}
