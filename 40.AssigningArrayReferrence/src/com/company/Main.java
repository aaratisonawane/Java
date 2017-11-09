package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];
        System.out.print("Here is nums1: ");
        for (i = 0; i < 10; i++) {
            nums1[i] = i;
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        System.out.print("Here is nums2: ");
        for (i = 0; i < 10; i++) {
            nums2[i] = -i;
            System.out.print(nums2[i]+" ");
        }
        System.out.println();

        nums2 = nums1;
        System.out.print("Here is nums2 after assignment: ");
        for(i=0; i<10; i++)
        System.out.print(nums2[i] + " ");
        System.out.println();

        nums2[3] = 33;
        System.out.print("Here nums1  after change through nums2: ");
        for(i=0; i<10; i++)
        System.out.print(nums1[i]+ " ");
        System.out.println();

        nums1[0] = 44;
        System.out.print("Here nums2  after change through nums1: ");
        for(i=0; i<10; i++)
            System.out.print(nums2[i]+ " ");
    }
}


