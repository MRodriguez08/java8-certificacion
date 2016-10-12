package com.javacert.ocpj8.chapter3;

public class Enum {
    
    enum Brands {
        LAMBORGHINI,
        FERRARI,
        MASERATTI,
        ZENVO,
        KOENIGSEGG
    }
    
    enum WeelDriveTypes {
        AWD,
        RWD,
        FWD
    }
    
    
    public static void main(String... args){
        System.out.println(Brands.FERRARI.equals(WeelDriveTypes.RWD));
    }

}
