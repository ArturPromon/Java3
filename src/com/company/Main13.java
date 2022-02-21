package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args){
        int [] array;
        int n;

        int count = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        n = scn.nextInt();
        array = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter array[" + i + "] = ");
            array[i] = scn.nextInt();
            if(array[i] > 50){
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        int [] array2 = new int[count];
        int index = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] > 50){
                array2[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array2));
        int sum = 0;
        for(int i = 0; i<array2.length; i++){
            sum = sum + array2[i];
        }
        System.out.print("Sum of array2 is " + sum);

    }
}
