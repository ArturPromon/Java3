package com.company;

public class MPhoneDemo {
    String mark;
    String model;
    String number;

    MPhoneDemo(){
        mark = "Iphone";
        model = "XR";
        number = "1220";
    }

    MPhoneDemo(String mark, String model, String number){
        this.mark = mark;
        this.model = model;
        this.number = number;
    }
    MPhoneDemo(String mark1, String number1){
        mark = mark1;
        number = number1;
    }
}
