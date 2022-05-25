package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args){
        BufferedReader file = null;
        Scanner scn = new Scanner(System.in);
        char somechar = scn.next().charAt(0);
        char somechar2 = Character.toUpperCase(somechar);
        try{
            file = new BufferedReader(new FileReader("src/com/Artur.txt"));
            String line;
            while((line= file.readLine()) != null){
                int counter = 0;
                String[] parts = line.split(" ");

                for(int i = 0; i< parts.length;i++){
                      parts[i] = Character.toUpperCase(parts[i].charAt(0)) + parts[i].substring(1);
                }

                for(int i = 0; i < line.length();i++){
                    if(line.charAt(i) == somechar || line.charAt(i) == somechar2){
                        counter++;
                    }
                }

                System.out.println(Arrays.toString(parts));
                System.out.println(counter);
            }
        }catch (Exception e){
            System.out.println("Error" + e);
        }
    }
}
