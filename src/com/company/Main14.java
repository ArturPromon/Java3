package com.company;

public class Main14 {
    public static void main(String[] args){
        int length = 0;
        int [] array = new int[] {10,40,30,50,10,40,5};
        for(int i = 0;i<array.length;i++){
            if(array[i] > 50){
                if(length<3){
                    length++;
                }

            }
        }
        System.out.println("count is " + length);
        int [] array2 = new int[length];

    }
}
