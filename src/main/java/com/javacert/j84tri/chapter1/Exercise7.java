package com.javacert.j84tri.chapter1;

public class Exercise7 {

    public interface RunnableEx {
        public void run() throws Exception;
    }

    public static Runnable andThen(Runnable first, Runnable second){
        Runnable wrapper = () -> {
            first.run();
            second.run();
        };
        return wrapper;
    }

    public static void main(String... args) {
        andThen(
            () -> {
                System.out.println("executing first");
            }, 
            ()-> {
                System.out.println("executing second");
            }
        ).run();
    }

}