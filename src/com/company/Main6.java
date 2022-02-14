package com.company;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("How old are u?: ");
        int age = scn.nextInt();
        int constage = 64;

        if(age<constage){
            int dif = constage - age;
            if(dif>25){
                System.out.print("Don't picture please pension!!!");
            }else{
                System.out.print("You need to work " +dif + " years for pension" );
            }
        }else{
            System.out.print("U have 300 euros per month");
        }
    }
}
