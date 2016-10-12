package com.javacert.ocpj8.chapter3;

public class StatusReporter {
    
    private static Integer myInt = 1;
    
    private interface MyInt {
        
    }
    
    // important to note that the argument "color" is declared final
    static Shape.Color getDescriptiveColor(Shape.Color color) {
        // local class DescriptiveColor that extends Shape.Color class
        class DescriptiveColor extends Shape.Color implements MyInt {
            public String toString() {
                return "You selected a color with RGB values" + color;
            }
            public void addOne(Integer i){
                i++;
            }
        }
        return new DescriptiveColor();
    }
    
    // important to note that the argument "color" is declared final
    static Shape.Color getDescriptiveColorAnonymous(Shape.Color color) {
        // local class DescriptiveColor that extends Shape.Color class
        return new Shape.Color(){
            public String toString() {
                return "You selected a color with RGB values" + color;
            }
        };
    }

    public static void main(String[] args) {
        Shape.Color descriptiveColor = StatusReporter.getDescriptiveColor(new Shape.Color(0, 0, 0));
        System.out.println(descriptiveColor);
    }
}
