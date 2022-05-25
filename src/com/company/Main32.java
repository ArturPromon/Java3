package com.company;

public class Main32 {
    public static int сумма(int a,int b){
        return a+b;
    }
    public static int сумма(int a,int b, int c){
        return a+b+c;
    }
    public static float сумма(float a, float b, float c){
        return a+b+c;
    }

    public static void main(String[] args){
        System.out.println(сумма(5,6));
        System.out.println(сумма(5,6,7));
        System.out.println(сумма(5.5f,5.5f,5.5f));
    }
}
