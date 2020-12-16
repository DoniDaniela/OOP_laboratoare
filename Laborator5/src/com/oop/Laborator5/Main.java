package com.oop.Laborator5;

public class Main {
    public static void main (String[]args)
    {
        A a = new A ();
        System.out.println ("Class A : " + a.getA ());
        B b = new B ();
        System.out.println ("Class B : " + b.getB ());
        C c = new C ();
        System.out.println ("Class C : " + c.getC ());
        D d = new D ();
        System.out.println ("Class D : " + d.getD ());
        E e = new E ();
        System.out.println ("Class E : " + e.getE ());
        F f = new F ();
        System.out.println ("Class F : " + f.getF ());
        G g = new G ();
        System.out.println ("Class G : " + g.getG ());
        H h = new H ();
        System.out.println ("Class H : " + h.getH ());
        I i = new I ();
        System.out.println ("Class I : " + i.getI ());
        J j = new J ();
        System.out.println ("Class J : " + j.getJ ());
    }
}

class A
{
    public String a = "a";
    String getA ()
    {
        return a;
    }
}


class B extends A
{
    public String b = "b";
    String getB ()
    {
        return b;
    }
}

class C extends B
{
    public String c = "c";
    String getC ()
    {
        return c;
    }
}

class D extends C
{
    public String d = "d";
    String getD ()
    {
        return d;
    }
}

class E extends D
{
    public String e = "e";
    String getE ()
    {
        return e;
    }
}

class F extends E
{
    public String f = "f";
    String getF ()
    {
        return f;
    }
}

class G extends F
{
    public String g = "g";
    String getG ()
    {
        return g;
    }
}

class H extends G
{
    public String h = "h";
    String getH ()
    {
        return h;
    }
}

class I extends H
{
    public String i = "i";
    String getI ()
    {
        return i;
    }
}

class J extends I
{
    public String j = "j";
    String getJ ()
    {
        return j;
    }
}