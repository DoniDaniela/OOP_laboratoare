package com.oop.Laborator4;

public class Main {
    static boolean checkSyntax(String fileName) {
        Stack<String> stack = new Stack<String>();
        String content = "";
        boolean resultat = true;
        try {
            content = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException ex) {
            System.out.println("Exception:" + ex.getMessage());
            resultat = false;
        }
        stack.clear();
        String buf;
        for (int i = 0; i < content.length(); i++) {
            buf=content.substring(i, i+1);
            if (buf.equals("(")) {
                stack.push("(");
            } else if (buf.equals(")")) {
                try {
                    stack.pop();
                } catch (EmptyStackException ex) {
                    resultat = false;
                }
            }
        }
        if (!stack.isEmpty()) {
            resultat = false;
        }
        return resultat;
    }

    public static void main(String s[]) {
        String file = "";
        file = "c:\\a.txt";
        if (checkSyntax(file)) {
            System.out.println("File " + file + " is corect");
        } else {
            System.out.println("File " + file + " isn't corect");
        }
        file = "c:\\b.txt";
        if (checkSyntax(file)) {
            System.out.println("File " + file + " is corect");
        } else {
            System.out.println("File " + file + " isn't corect");
        }
        file = "c:\\c.txt";
        if (checkSyntax(file)) {
            System.out.println("File " + file + " is corect");
        } else {
            System.out.println("File " + file + " isn't corect");
        }
}
