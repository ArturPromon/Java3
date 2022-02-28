package com.company;

import java.util.Scanner;

public class months {
    public static void main(String[] args){
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        Scanner scn = new Scanner(System.in);
        System.out.println("Choose the number of month from 1 to 12: ");
        int n = scn.nextInt();
        boolean isTrue = true;
        while(isTrue) {
            if (n > 12) {
                System.out.println("Enter the number of array from 1 to 12!!!");
                n = scn.nextInt();
            } else if (n < 1) {
                System.out.println("Enter the number of array from 1 to 12!!!");
                n = scn.nextInt();
            } else {
                System.out.println("Month is " + months[n - 1]);
                isTrue = false;
            }
        }
//        for(int i = 0; i< months.length; i++){
//            if(n == i){
//                System.out.println(months[i-1]);
//            }
//        }
    }
}
