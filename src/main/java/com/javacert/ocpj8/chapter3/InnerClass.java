package com.javacert.ocpj8.chapter3;

public class InnerClass {
    // define Point as an inner class within Circle class
    class Point {
        private int xPos;
        private int yPos;

        // you can provide constructor for an inner class like this
        public Point(int x, int y) {
            xPos = x;
            yPos = y;
        }

        // the inner class is like any other class - you can override methods
        // here
        public String toString() {
            radius = 0;
            return "(" + xPos + "," + yPos + ")";
        }
    }

    // make use of the inner class for declaring a field
    private Point center;
    private int radius;

    public InnerClass(int x, int y, int r) {
        // note how to make use of the inner class to instantiate it
        center = this.new Point(x, y);
        radius = r;
    }

    public String toString() {
        return "mid point = " + center + " and radius = " + radius;
    }

    public static void main(String[] s) {
        InnerClass myInner = new InnerClass(10, 10, 20);
        myInner.center = myInner.new Point(15, 15);
        System.out.println(new InnerClass(10, 10, 20));
    }
    // other methods such as area are elided
}