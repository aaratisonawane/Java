package com.company;
class Vehicle{
    int passangers;
    int fuelcap;
    private int mpg;

    Vehicle(int p, int f, int m){
        passangers = p;
        fuelcap = f;
        mpg = m;
    }
    int range(){
        return fuelcap * mpg;
    }
    void setMpg(int m){
        mpg = m;
    }
    int getMpg(){
        return mpg;
    }
}
public class VehicleDemo {

    public static void main(String[] args) {
	// write your code here
        Vehicle car1 = new Vehicle(7,20,10);
        Vehicle car2 = new Vehicle(2,10,15);
        Vehicle car3 = new Vehicle(2,10,12);

        System.out.println("Range for car1 is "+ car1.range());
        System.out.println("Range for car2 is "+ car2.range());
        System.out.println("Range for car3 is "+ car3.range());

        car2.setMpg(car3.getMpg());

        car1 = car2;
        System.out.println("Range for car1 is "+ car1.range());
        System.out.println("Range for car2 is "+ car2.range());
        System.out.println("Range for car3 is "+ car3.range());

        if(car2 == car3)
            System.out.println("car2 and car3 same");
        else
            System.out.println("Car2 and Car3 are different");


    }
}
