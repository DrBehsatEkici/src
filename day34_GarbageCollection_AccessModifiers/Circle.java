package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius; // radius is unknown, in can vary.
    public static double pi; // it is known
    public static String name;

    public static ArrayList <Integer>  numbers;


    public Circle (double radius) {
        this.radius=radius;
        pi= 3.14;
    }

    /*
    static {
        pi= 3.14;
        name= "Circle";
        numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

     */

   static {
        pi=3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);


        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }
    }

    // You should never use constructor to set the static variable
    // because it will unccessarily create the static variable every time they use.
    // if you have a static variable that takes more than one step to set, you should alwasy use static bloc.
    // if you hava a static variable that takes only one step, you can directly set it.


