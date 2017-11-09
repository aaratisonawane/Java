package com.company;

class Myclass{
    private int alpha;
    public int gamma;
    int beta;

    void setAlpha(int a){
        alpha = a;
    }
    int getAlpha(){
        return alpha;
    }
    Myclass(int b, int g){
        gamma = g;
        beta = b;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Myclass object = new Myclass(12 ,27);
        object.setAlpha(10);
//      int val = object.getAlpha();
//      System.out.println("Alpha is "+ val);
        System.out.println("Alpha is "+ object.getAlpha());
        System.out.println("Gamma is "+ object.gamma);
        System.out.println("Beta is "+ object.beta);

    }
}
