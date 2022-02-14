package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args){
        float num1, num2, result;
        char operator;
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        num1 = scn.nextFloat();
        System.out.print("Please enter second number: ");
        num2 = scn.nextFloat();
        System.out.print("Enter please an operator(+, -, *, /) : ");
        operator = scn.next().charAt(0);
        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.print("Error!!!");
                return;
        }

        System.out.print("Result is " + result);

    }
}
