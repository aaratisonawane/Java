package com.company;

public class Main {

    public static void main(String[] args) throws java.io.IOException {
	char ch = 'K';
	System.out.print("Can you guess the letter: ");
	char input = (char)System.in.read();

	if(input == ch){
	    System.out.println("***************Right*****************");
    }
    else{
	    System.out.println("****Sorry, you are wrong*********");
	    if(input < ch){
	        System.out.println("Guess Higher");
        }
        else{
            System.out.println("Guess Lower");
        }
    }


    }
}
