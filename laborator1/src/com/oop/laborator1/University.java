package com.oop.laborator1;

import java.util.*;

public class University {
    static Scanner j = new Scanner(System.in);
    String NAME;
    int FoundationYear;
    Student[] students = new Student[1000];

    public double Average() {
        double aux = 0;
        for (int i = 0; i < 3; i++) {
            aux += students[i].media;
        }
        return aux / 3;
    }

    public static void main(String[] args) {
        University myObj1 = new University();// Object 1
        University myObj2 = new University();// Object 2
        University myObj3 = new University();// Object 3
        myObj1.NAME = "UTM";
        myObj2.NAME = "USM";
        myObj3.NAME = "ULIM";
        myObj1.FoundationYear = 1964;
        myObj2.FoundationYear = 1972;
        myObj3.FoundationYear = 1990;
        int nr_students = 3;
        for (int i = 0; i < nr_students; i++) {
            myObj1.students[i] = new Student();
            System.out.println("Age: ");
            myObj1.students[i].age = j.nextInt();
            System.out.println("Name: ");
            myObj1.students[i].NAME = j.next();
            System.out.println("Media : ");
            myObj1.students[i].media = j.nextDouble();
        }
        for (int i = 0; i < nr_students; i++) {
            myObj2.students[i] = new Student();
            System.out.println("Age: ");
            myObj2.students[i].age = j.nextInt();
            System.out.println("Name: ");
            myObj2.students[i].NAME = j.next();
            System.out.println("Media : ");
            myObj2.students[i].media = j.nextDouble();
        }
        for (int i = 0; i < nr_students; i++) {
            myObj3.students[i] = new Student();
            System.out.println("Age: ");
            myObj3.students[i].age = j.nextInt();
            System.out.println("Name: ");
            myObj3.students[i].NAME = j.next();
            System.out.println("Media : ");
            myObj3.students[i].media = j.nextDouble();
        }
        System.out.println(myObj1.Average());
        System.out.println(myObj2.Average());
        System.out.println(myObj3.Average());
    }
}


