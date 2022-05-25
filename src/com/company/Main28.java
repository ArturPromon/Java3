package com.company;

public class Main28 {
    public static void main(String[] args){
        int [] numbers = new int[] {34,52,21,6,5,2,-133,64,435,575,4,234};

        int max,min;
        max = min =  numbers[0];
        for(int i = 0; i<numbers.length;i++){
            if(max<numbers[i]){
                max = numbers[i];
            }
            if(min>numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println("Max value is " + max);
        System.out.println("Min value is " + min);

    }
}
