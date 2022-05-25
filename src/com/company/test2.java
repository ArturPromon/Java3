package com.company;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int sum = 0;
        int average = 0;
        int[] array = new int[]{188, 181, 156, 162, 173, 152, 169, 193, 185};

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            average = sum / array.length;
        }

        System.out.println(average);

        if (average % 3 == 0) {
            System.out.println("Hello");
        } else {
            System.out.println("Error");
        }

        Arrays.sort(array);
        double median;
        if (array.length % 2 == 0) {
            median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
        } else {
            median = array[array.length/2];
        }
        System.out.println(median);
    }
}