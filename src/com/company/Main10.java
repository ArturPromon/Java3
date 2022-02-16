package com.company;

import java.util.Arrays;

public class Main10 {
    public static void main(String[] args){
        int [] array = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(array[5]);
        int [] array2 = new int[] {1,2,3,4};
        System.out.println(array2[3]);
        int [] array3 = new int[] {5,6,7,8,9};
        System.out.println(Arrays.toString(array3));

        int [][] array4 = new int[][] {{1,2,3,4,5}, {6,7,8,9} , {10,12,14}};
        System.out.println(array4[2][0]);

        int[] array5 = new int[5];
        array5[0] = 5;
        array5[4] = 10;
        System.out.println(Arrays.toString(array5));

        String [] cars = new String[3];
        cars[0] = "Audi";
        cars[1] = "Bmw";
        cars[2] = "Mercedes";
        System.out.println(Arrays.toString(cars));


    }
}
