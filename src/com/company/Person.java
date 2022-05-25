package com.company;

public class Person {
    public static void main(String[] args){
         PersonDemo person1 = new PersonDemo();
         PersonDemo person2 = new PersonDemo();
         System.out.println(person1.age);
         System.out.println(person1.height);
         System.out.println(person1.name);
         person1.height = 182;
         System.out.println(person1.height);
         person2.age = 24;
         person1.say("Kolyan");

    }
}
