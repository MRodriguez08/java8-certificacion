package com.javacert.j84tri.chapter1;

import java.io.File;
import java.util.Arrays;

public class Exercise4 {
    
    public static void main(String... args){
        
        File[] files = new File[10];
        
        Arrays.sort(files, (first, second) 
            -> first.getAbsolutePath().compareTo(second.getAbsolutePath()));
        
    }

}
