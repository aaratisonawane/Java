package com.company;

public class RecursionDemo{

    static int factorial(int n) {
        System.out.println("factorial:"+n);
        if (n==1) return 1;
        int res = n * factorial(n-1);
        System.out.println("res= "+res);
        return res;
    }

    static int fib(int n) {
        System.out.println("fib: "+n);
        if (n < 3) return 1;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(factorial(4));
        System.out.println(fib(4));

    }
}
