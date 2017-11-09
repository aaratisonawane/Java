package com.company;

public class Main {

    public static void main(String[] args)throws java.io.IOException {

	for(int i = 0; i<100; i++ ) {
        char ch = (char) System.in.read();
        if (ch == 'q')
            break;
    }
    System.out.println("Finnally q");


    }
}
