package com.javacert.lambdas;

public class VariableScope {
    
    private String bestCarEver = "Lamborghini Miura";

    public static void main(String... args) {
        VariableScope o = new VariableScope();
        o.printLocalVar();
    }
    
    private void printLocalVar(){
        Runnable r = () -> {
            System.out.println(this.bestCarEver);
        };
        new Thread(r).start();
    }

    private static void repeatMessage(String text, int count) {
        Runnable r = () -> {
            int myCount = count;
            while (myCount > 0) {
                myCount--; // Error: Can’t mutate captured variable
                System.out.println(text);
                Thread.yield();
            }
        };
        new Thread(r).start();
    }

}
