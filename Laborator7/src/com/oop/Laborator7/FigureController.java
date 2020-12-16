package com.oop.Laborator7;

public class FigureController {

    public static void main (String arg[])
    {
        Square sqr = new Square (10);
        System.out.println ("Area = " + sqr.getArea ());
        System.out.println ("Perimeter = " + sqr.getPerimeter ());

        Rectangle rect = new Rectangle (10, 5);
        System.out.println ("Area = " + rect.getArea ());
        System.out.println ("Perimeter = " + rect.getPerimeter ());

        Triangle trng = new Triangle (10, 10, 10);
        System.out.println ("Area = " + trng.getArea ());
        System.out.println ("Perimeter = " + trng.getPerimeter ());
    }
}

class Square
{
    double length;

    Square (double length)
    {
        this.length = length;
    }

    double getArea ()
    {
        return length * length;
    }

    double getPerimeter ()
    {
        return 2 * (length + length);
    }
}


class Rectangle
{
    double length;
    double breadth;

    Rectangle (double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea ()
    {
        return length * breadth;
    }

    double getPerimeter ()
    {
        return 2 * (length + breadth);
    }
}

class Triangle
{
    double length;
    double width;
    double height;

    Triangle (double length, double width, double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getArea ()
    {
        double p = (length+width+height)/2;
        return Math.sqrt(p*(p-length)*(p-width)*(p-height));
    }

    double getPerimeter ()
    {
        return length + width + height;
    }
}

