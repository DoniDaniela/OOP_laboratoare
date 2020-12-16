package com.oop.Laborator3;

public class Main {
    public String str = "Hello world. test.";
    public void cntWords ()
    {
        char[] cArray = new char[str.length ()];
        cArray = str.toCharArray ();
        int w = 0;
        int count = 1;
        for (int i = 0; i < str.length (); i++)
        {
            if (cArray[i] == ' ')
            {
                count++;
            }
        }
        System.out.println ("Words: " + count);
    }
    public void cntSentences ()
    {
        char[] cArray = new char[str.length ()];
        cArray = str.toCharArray ();
        int w = 0;
        int count = 0;
        for (int i = 0; i < str.length (); i++)
        {
            if (cArray[i] == '.')
            {
                count++;
            }
        }
        System.out.println ("Sentences: " + count);
    }
    public static void main (String[]args)
    {
        new Main ().cntWords ();
        new Main ().cntSentences ();
    }
}

