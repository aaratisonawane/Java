package com.company;
class ChkNum{
    boolean isEven(int num){
        if(num%2 == 0)
            return true;
        else
            return false;
    }

}

public class ParameterDemo {

    public static void main(String[] args) {
	// write your code here
        ChkNum num = new ChkNum();
        for(int x=0; x<= 10; x++) {
            if (num.isEven(x))
            System.out.println(x + " is even");
            else
            System.out.println(x + " is odd");
        }

    }
}
