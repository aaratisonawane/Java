package com.company;

public class Main {

    public static void main(String[] args) {

        int sample[] = new int[10];
        int i;
        for(i=0; i<sample.length; i++)
            sample[i] = i;
        for(i=0; i<sample.length; i++)
            System.out.println("sample [" + i + "] : " +i);

    }
}
