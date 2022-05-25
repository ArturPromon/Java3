package com.company;

public class MPhoneDemo2 extends MPhoneDemo {
    String system = "Windows";
    String system2;
    int core;
    int price;

    MPhoneDemo2(){

    }

    MPhoneDemo2(String system2, int core, int price){
        this.system2 = system2;
        this.core = core;
        this.price = price;
    }

    MPhoneDemo2(String mark, String model, String number, String system2, int core, int price){
        super(mark, model, number);
        this.system2 = system2;
        this.core = core;
        this.price = price;
    }
}
