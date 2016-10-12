package com.javacert.scjp.declarations_and_acccess_control;

public class Exercise6Selftest1 {

}

class Electronic implements Device {
    public void doIt() {
    }
}

abstract class Phone1 extends Electronic {
}

abstract class Phone2 extends Electronic {
    public void doIt(int x) {
    }
}

class Phone3 extends Electronic implements Device {
    public void doStuff() {
    }
}

interface Device {
    public void doIt();
}
