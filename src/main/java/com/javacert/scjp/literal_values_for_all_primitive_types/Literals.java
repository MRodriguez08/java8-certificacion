package com.javacert.scjp.literal_values_for_all_primitive_types;

public class Literals {

    public static void main(String[] args) {
        
        char a = 0x892; // hexadecimal literal
        char b = 982; // int literal
        char c = (char) 70000; // The cast is required; 70000 is out of char range
        char d = (char) -98; // Ridiculous, but legal
        
        char doubleQuote = '\"'; // A double quote
        char newLine = '\n'; // A newline
        
        
        int x = (int)3957.229; // illegal
        
        float f = 234.56F;
        short s = (short)f;
        
        float myVar = (float)32.3;
        
        System.out.println("s = " + s);
    }

}
