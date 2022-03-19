package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Reader {
    public static void main(String[] args){
        BufferedReader file = null;
        try{
            file = new BufferedReader(new FileReader("src/com/Artur.txt"));
            String line;
            while((line= file.readLine()) != null){
                String[] parts = line.split(" ");
                System.out.println(line.toLowerCase());
                //line.toUpperCase()
//                System.out.println(Arrays.toString(parts));
            }
        }catch (Exception e){
            System.out.println("Error" + e);
        }
    }
}
