package com.javacert.j84tri.chapter1;

import java.awt.Button;

public class Exercise5 {
    
    public static void main(String... args){

        
        Button save = new Button("Save");
        save.addActionListener(e -> {
            System.out.println("helo there!");
        });
    }

}
