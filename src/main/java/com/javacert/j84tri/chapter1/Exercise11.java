package com.javacert.j84tri.chapter1;

public class Exercise11 {
    
    public interface IntOne {
        default String prepString(){
            return "default_intone";
        }
    }
    
    public interface IntTwo {
        public String prepString();
    }
    
    public class SuperClass {
        public String prepString(){
            return "super_default";
        }
    }
    
    public class MyClass extends SuperClass implements IntOne, IntTwo {

    }
    
    public void doTheThing(){
        MyClass mc = new Exercise11.MyClass();
        System.out.println(mc.prepString());
    }

    public static void main(String... args) {
        Exercise11 enc = new Exercise11();
        enc.doTheThing();
    }

}