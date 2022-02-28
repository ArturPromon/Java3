package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main18 {
    public static void main(String[] args){
        int [] array = new int[] {50,430,40,506,70,80,20};
        int sum = 0;
        int i = 0;
        boolean isTrue = true;
//        while(isTrue){
//            sum += array[i];
//            i++;
//            if(i>array.length){
//                isTrue = false;
//            }
//        }


//        while(i < array.length){
//            sum = sum + array[i];
//            i++;
//        }

//        for(int j = 0; j < array.length; j++){
//            sum+= array[i];
//        }
//
//        for(int element : array){
//            System.out.println(element);
//            sum = sum + element;
//        }

//        IntStream elements = IntStream.of(array);
//        sum = elements.sum();
//        System.out.println(sum);

        System.out.print(Arrays.stream(array).sum());
    }
}
