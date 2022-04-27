package day33_Statics;

public class Iphone {
    public static String brand= "Apple"; // static becasue there is only one brand

    public String model; // instance because there are different models

    public double price; //insance because each model has a different price

    public  static String OS= "IOS";

    public String color;

    public String size;

    public static String MadeIn = "China";

    public static boolean hasBattery=true;
    public static boolean isTouchScreen= true;

    public static boolean hasFaceTime= true;

    public static void printOperatingSystem()  {
            System.out.println(OS);
        }

        //if they are instance they belong to the object
        // static methods in java does not accept instances
        // instance methods accept static
    }


