package com.company;

class Myclass{
    int x;
    Myclass(){
        x = 10;
    }
}



public class ConstructorDemo {

    public static void main(String[] args) {
	// write your code here
        Myclass first = new Myclass();
        Myclass second = new Myclass();

        System.out.println(first.x + " " + second.x);
    }
}
