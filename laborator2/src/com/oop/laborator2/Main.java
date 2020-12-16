package com.oop.laborator2;

public class Main {
    public void main (String[]args)
    {
        Box Box1 = new Box();
        Box Box2 = new Box(2,2,2);
        Box Box3 = new Box(2,2,2);
    }
    public class Box
    {
        public double height = 0;
        public double width  = 0;
        public double depth  = 0;
        public Box ()
        {
            System.out.print("Dimensions are " + height + " X " + width + " X " + depth);
        }
        public Box (double height)
        {
            this.height = height;
            this.width  = height;
            this.depth  = height;
            System.out.print("Dimensions are " + height + " X " + width + " X " + depth);
        }
        public Box (double height, double width, double depth)
        {
            this.height = height;
            this.width  = width;
            this.depth  = depth;
            System.out.print("Dimensions are " + height + " X " + width + " X " + depth);
        }
    }
}
