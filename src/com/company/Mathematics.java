package com.company;
import java.lang.Math;
public class Mathematics {
    public static void main(String[] args){
//        Math.random(); [0,1)
       int num;
       num =(int) Math.round(Math.random() * 100);
       System.out.println(num);

       float num2 = 5.001f;
       System.out.println("ceil " + Math.ceil(num2));

        float num3 = 5.9999f;
        System.out.println("floor " + Math.floor(num3));

        int num4,num5;
        num4 = 100;
        num5 = 150;
        System.out.println("Max " + Math.max(num4, num5));
        System.out.println("Min " + Math.min(num4, num5));
        int num6 = 9;
        System.out.println(Math.round(Math.sqrt(num6)));


    }
}
