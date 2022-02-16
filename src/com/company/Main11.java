package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args){
        int array [];
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        n = scn.nextInt();
        array = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter array[" + i + "] = ");
            array[i] = scn.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
