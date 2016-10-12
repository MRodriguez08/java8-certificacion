package com.javacert.scjp.declarations_and_acccess_control;

enum DummyEnum {
    VALUE
};
public class Tests {
    
    static DummyEnum a;
    

    
    public void doSomething(){
        
    }

    public static void main(String[] args) {


        System.out.println("BIG: " + CoffeeSize.BIG.getLidCode());
        System.out.println("OVERWHELMING: " + CoffeeSize.OVERWHELMING.getLidCode());
    }

}
