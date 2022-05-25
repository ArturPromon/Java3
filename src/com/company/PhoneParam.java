package com.company;

public class PhoneParam {
    class core{
        String core = "Switched off";
        public void working(){
            core = "working";
            System.out.println("Core is " + core);
        }

        public void notworking(){
            core = "not working";
            System.out.println("Core is " + core);
        }
    }
    class memory{
        String memory = "Switched off";
        public void working(){
            memory = "working";
            System.out.println("Memory is " + memory);
        }

        public void notworking(){
            memory = "not working";
            System.out.println("Memory is " + memory);
        }
    }
    core intelcore = new core();
    memory RAM = new memory();
}
