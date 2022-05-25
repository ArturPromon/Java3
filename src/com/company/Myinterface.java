package com.company;

public class Myinterface implements Print,Read {
    public String mark;
    public String model;


    Myinterface(){

    }
    Myinterface(String mark, String model){
        this.mark = mark;
        this.model = model;
    }

    public void printCar() {
        System.out.println(mark + " " + model);
    }
    public void readCar(){
        System.out.println("Audi A6");
    }


}
