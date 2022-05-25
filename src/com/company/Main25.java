package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main25 {
    public static void main(String[] args){
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter name of months January-December: ");
        String monthsname= scn.nextLine();

        if(Arrays.asList(months).contains(monthsname)){
            System.out.println(Arrays.asList(months).indexOf(monthsname) + 1);
        }else{
            System.out.println("error!");
        }

    }
}