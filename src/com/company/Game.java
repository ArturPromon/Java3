package com.company;
import java.lang.Math;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){

        int num1,num2,result;

        boolean isTrue2 = true;
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);

        System.out.println("This is a game!");
        System.out.println("Rules: First number is secret! sum of 2 numbers must be lower than 100");
        while(isTrue2){
            boolean isTrue = true;
            num1 = (int) Math.round(Math.random() * 100);
            System.out.println("First number is secret, please enter second number: ");
            num2= scn.nextInt();
            while(isTrue) {
                if (num2 <= 10) {
                    System.out.println("Second number must be bigger than 10!");
                    System.out.println("Please enter second number again: ");
                    num2 = scn.nextInt();
                } else {
                    result = num1 + num2;
                    if (result < 100) {
                        System.out.println("You won the game!, because sum of 2 numbers was " + result);
                        System.out.println("Secret number was " + num1);
                    } else {
                        System.out.println("You lost the game!, because sum of 2 numbers was bigger than 100");
                        System.out.println("Secret number was " + num1);
                    }
                    isTrue = false;
                }
            }
            System.out.println("Would you like to play again? (Yes/No):");
            isTrue2 = scn2.nextLine().equalsIgnoreCase("Yes");
        }
    }
}
