package com.company;

public class Main17 {
    public static void main(String[] args){
        int num = 5;
        int result = 1;
        int range = 1;

        while(true){
            result = result * num;
            System.out.println(num + " в степени " + range + " = " + result);
            range++;
            if(range>3){
                break;
            }
        }
    }
}
