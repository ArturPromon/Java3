package com.company;

public class MPhone {
    public static void main(String[] args){
        MPhoneDemo phone1 = new MPhoneDemo();
        MPhoneDemo phone2 = new MPhoneDemo("Samsung", "+372 53026563");
        MPhoneDemo phone3 = new MPhoneDemo("Nokia", "M15", "+372 55556767");
        System.out.println(phone1.model);
        MPhoneDemo2 phone4 = new MPhoneDemo2();
        MPhoneDemo2 phone5 = new MPhoneDemo2("Ubuntu", 4, 1000);

        MPhoneDemo2 phone6 = new MPhoneDemo2("Apple", "12", "+372 6586794", "Windows", 6, 1200);

        System.out.println(phone4.system);

        System.out.println(phone5.core);

        System.out.println(phone6.mark);
        System.out.println(phone6.model);
        System.out.println(phone6.number);
        System.out.println(phone6.system2);
        System.out.println(phone6.core);
        System.out.println(phone6.price);
    }
}
