package com.company;
class Vehicle{
    int mpg;
}

public class Main {

    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        Vehicle car2 = car1;
        car1.mpg = 26;
        System.out.println(car1.mpg);
        System.out.println(car2.mpg);

    }
}
