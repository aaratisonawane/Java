package com.company;
class MyClass{
    void myMethod(){
        for(int i=0; i<10; i++) {
            if (i == 5) return;
            System.out.println(i);
        }
    }
}

public class MyMath {

    public static void main(String[] args) {
	// write your code here
        MyClass integer = new MyClass();
        System.out.println("Print numbers");
        integer.myMethod();
    }
}
