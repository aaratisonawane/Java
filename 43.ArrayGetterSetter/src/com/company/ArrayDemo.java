package com.company;
class FailSoftArray {
    private int a[];
    int size;
    int errVal;

    FailSoftArray(int s, int e) {
        size = s;
        errVal = e;
        a = new int[size];
    }

    int setA(int index, int val){
        if (index >= 0 && index < size){
            a[index] = val;
            return val;
        }
        else return errVal;
    }

    int getA(int index) {
        if (index >= 0 && index < size)
            return a[index];
        else return errVal;
    }
}
public class ArrayDemo {

    public static void main(String[] args) {
	// write your code here

        FailSoftArray sample = new FailSoftArray(5,9999999);
        int i;

        for(i=0;i<10;i++)
            sample.setA(i, 10*i+1);
        for(i=0;i<10;i++)
            System.out.println("sample["+i+"]="+sample.getA(i));
//			System.out.println("sample["+i+"]="+sample.a[i]);
    }
}
