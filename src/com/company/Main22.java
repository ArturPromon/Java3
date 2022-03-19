package com.company;

public class Main22 {
    public static void main(String[] args){
        int [] arr = {5,6,7,8};

        try{
//            int num1;
//            num1 = 100/0;
            System.out.println(arr[5]);
        }catch (Exception e){
            System.out.println("Some error:" + e);
        }finally {
            System.out.println("Hello world");
        }
    }
}
