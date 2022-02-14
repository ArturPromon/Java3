package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter number:");
        n = scn.nextInt();

//        if(n != 0){
//            System.out.print("Number is not 0");
//        }
//
//        if(n > 0 && n<=100){
//            System.out.print("Number is positive");
//        }else if (n<0){
//            System.out.print("Number is negative");
//        }else{
//            System.out.print("Number is 0");
//        }


        switch(n){
            case 5:
                System.out.print("number is 5");
                break;
            case 10:
                System.out.print("number is 10");
                break;
            default:
                System.out.print("Number is some number");
        }

    }
}
