package com.company;

public class MyArray2 implements Array2{
    int a[] = new int[2];
    int size = 0;

    String names[] = new String[10];

    @Override
    public int Get(int i){
        return a[i];
    }

    @Override
    public boolean Add(int value){
        if(size!=a.length){
            a[size] = value;
            size++;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String Add(String name){
        if(size!= names.length){
            names[size] = name;
            size++;
        }
        return name;
    }

}
