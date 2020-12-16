package com.oop.Laborator8;

public class GeometricBody {
    public static void main (String arg[])
    {
        Cub cub = new Cub (10);
        System.out.println ("Surface = " + cub.getSurface ());
        System.out.println ("Volume = " + cub.getVolume ());

        Sphere sph = new Sphere (10);
        System.out.println ("Surface = " + sph.getSurface ());
        System.out.println ("Volume = " + sph.getVolume ());
        Parallelepiped prp = new Parallelepiped (10, 5, 10);
        System.out.println ("Surface = " + prp.getSurface ());
        System.out.println ("Volume = " + prp.getVolume ());
    }
}

class Cub
{
    double length;

    Cub (double length)
    {
        this.length = length;
    }

    double getVolume ()
    {
        return length * length * length;
    }

    double getSurface ()
    {
        return 6 * length;
    }
}


class Sphere
{
    double radius;

    Sphere (double radius)
    {
        this.radius = radius;
    }

    double getVolume ()
    {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    double getSurface ()
    {
        return 4 * Math.PI * radius * radius;
    }
}

class Parallelepiped
{
    double length;
    double width;
    double height;

    Parallelepiped (double length, double width, double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getVolume ()
    {
        return length * width * height;
    }

    double getSurface ()
    {
        return (2 * length * width + 2 * width * height + 2 * height * length);
    }
}