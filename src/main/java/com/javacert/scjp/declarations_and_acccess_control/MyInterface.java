package com.javacert.scjp.declarations_and_acccess_control;

abstract interface I1 {
    
    String SOME_CONST = "";
    
    String sayHello();
}

interface I2 {
    String sayGoodbye();
}

public interface MyInterface extends I1, I2 {
    String chat();
}

class MyConcrClass implements MyInterface {

    @Override
    public String sayHello() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String sayGoodbye() {
        SC_ClassOne one = new SC_ClassOne();
        return null;
    }

    @Override
    public String chat() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
