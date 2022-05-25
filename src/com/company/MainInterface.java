package com.company;

public class MainInterface {
    public static void main(String[] args){
        Print car = new Myinterface("Bmw" , "GT");
        Read car2 = new Myinterface();
        car.printCar();
        car2.readCar();
//        car.readCar();
    }
}
