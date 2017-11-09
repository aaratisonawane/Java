package com.company;

class Myclass{
    int x;

    Myclass(int i){
        x = i;
    }
}

public class ParaConstDemo {

    public static void main(String[] args) {
	// write your code here
        Myclass first = new Myclass(10);
        Myclass second = new Myclass(30);

        System.out.println(first.x + " " + second.x);


    }
}
