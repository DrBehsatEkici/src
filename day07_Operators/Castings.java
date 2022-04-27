package day07_Operators;

public class Castings {

    public static void main (String[] args)  {

        float averageStore = 20.5f;

        byte num1 = (byte) averageStore; //explicit casting
        short num2 = (short) averageStore; // explicit casting
        int num3 = (int) averageStore; // explicit casting

        float num4 = averageStore; //no casting
        double num5 = averageStore; //implicit casting

        long num6 = (long) averageStore;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);




    }
}
