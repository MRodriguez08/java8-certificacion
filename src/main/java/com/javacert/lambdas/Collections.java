package com.javacert.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    
    public static List<String> someCars = new ArrayList<String>(){{
        add("Ferrari FF");
        add("Ferrari gto 250");
        add("Ferrari 430");
        add("Ferrari 458");
    }};
    
    public static void main(String... args){
        someCars.forEach(System.out::println);
    }

}
