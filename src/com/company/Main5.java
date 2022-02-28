package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args){
        float num1, num2, result;
        char operator;
        boolean isTrue = true;
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        num1 = scn.nextFloat();
        System.out.print("Please enter second number: ");
        num2 = scn.nextFloat();
        System.out.print("Enter please an operator(+, -, *, /) : ");
        operator = scn.next().charAt(0);
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("answer is " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("answer is " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("answer is " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("answer is " + result);
                break;
            default: while(isTrue){
                System.out.println("Error! Incorrect mark! Please enter an operator again : ");
                operator = scn.next().charAt(0);
                switch (operator) {
                    case '+' -> {
                        result = num1 + num2;
                        isTrue = false;
                        System.out.println("answer is " + result);
                    }
                    case '-' -> {
                        result = num1 - num2;
                        isTrue = false;
                        System.out.println("answer is " + result);
                    }
                    case '*' -> {
                        result = num1 * num2;
                        isTrue = false;
                        System.out.println("answer is " + result);
                    }
                    case '/' -> {
                        result = num1 / num2;
                        isTrue = false;
                        System.out.println("answer is " + result);
                    }
                }

            }

        }

    }
}
