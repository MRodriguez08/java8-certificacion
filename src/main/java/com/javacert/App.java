package com.javacert;

import java.awt.Button;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        
        BiFunction<String, String, Integer> comp
        = (first, second) -> Integer.compare(first.length(), second.length());
        
        String[] strings = new String[1];
        Arrays.sort(strings, String::compareToIgnoreCase);
        
        List<String> labels = new ArrayList<String>(){{
            add("labelOne"); 
            add("labelTwo");
        }};
        Stream<Button> stream = labels.stream().map(Button::new);
        List<Button> buttons = stream.collect(Collectors.toList());
        
    }
}
