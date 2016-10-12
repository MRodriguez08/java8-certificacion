package com.javacert.scjp.literal_values_for_all_primitive_types;

public class VariableScope {
    
    static int i = 10;
    
    {
        i++;
    }
    
    {
        i++;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(new VariableScope().i);
        
        int t;
        
        
    }
    
    {
        i--;
    }

}
