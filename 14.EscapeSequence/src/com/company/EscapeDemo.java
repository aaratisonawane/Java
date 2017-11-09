package com.company;

public class EscapeDemo {

    public static void main(String[] args) {

        System.out.println("1.My name is \'Aarati\'");
        System.out.println("2.My name is \"Aarati\"");
        System.out.println("3.My name is \\Aarati\\");
        System.out.println("4.My name is \rAarati");
        System.out.println("5.My name is \nAarati");
        System.out.println("6.My name is \fAarati");
        System.out.println("7.My name is \tAarati");
        System.out.println("8.My name is \bAarati");

        char ch = '\t';
        System.out.println("ch is " + ch);

        ch = '\'';
        System.out.println("ch is " + ch);

    }
}
