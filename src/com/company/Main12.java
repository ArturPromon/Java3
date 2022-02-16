package com.company;

public class Main12 {
    public static void main(String[] args){
        int [] array = new int[] {10};
//        int result = array[0] + array[1] + array[2] + array[3];
//        System.out.println(result);
        System.out.println(array.length);
        int sum = 0;
        for(int i = 0; i<array.length;i++){
//            System.out.println(array[i]);
            sum = sum + array[i];
        }
        System.out.print("sum is " + sum);
    }
}
