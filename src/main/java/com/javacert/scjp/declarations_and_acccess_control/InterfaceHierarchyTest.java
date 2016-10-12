package com.javacert.scjp.declarations_and_acccess_control;

public class InterfaceHierarchyTest {
    public static void main(String[] args) {
        System.out.println((new B(1)).foo());
    }
}

interface Pet {
    public void beFriendly();
}

abstract class Dog implements Pet {
    public void beFriendly() {
        System.out.println("I'm friendly!");
    }
}

class Pitbull extends Dog implements Pet {

}

class A {
    
    public A(String str){
        
    }
    
    public void method() {

    }
}

class B extends A {
    
    public B(int i){
        super(String.valueOf(i));
    }
    
    public String method(int i) {
        return "";
    }

    public int[] gimmeSomeInts() {
        return null;
    }

    public int foo() {
        char c = 'c';
        return c; // char is compatible with int
    }

}