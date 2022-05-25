package com.company;

public class Main27 {
    public static void main(String[] args){
       System.out.println(function(10,25));
       int num1,num2;
       num1 = 100;
       num2 = 200;
       System.out.println(function2(num1,num2));
       function3();
    }


    public static int function(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }

    public static int function2(int number1, int number2){
        int result;
        result= number2- number1;
        return result;
    }

    public static void function3(){
        int num1, num2;
        num1 = 10;
        num2 = 20;
        int result = num1 + num2;
        System.out.println(result);

    }

}
