package com.company;

public class IfDemo {

    public static void main(String[] args) {
	 int a=2, b=3, c;

	 c = b - a;
	 System.out.println("C contains " + c);

	 if (c>0)
	     System.out.println("C is positive");
	 if (c<0)
	     System.out.println("C is negative");

	 c = a - b;
	 System.out.println("C contains " + c);

	 if (c>0)
         System.out.println("C is positive");
	 if (c<0)
         System.out.println("C is negative");



    }
}
