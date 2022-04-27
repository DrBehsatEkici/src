package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {

        int[] intArray = {5, 6, 0, -1, 3, 4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);

        System.out.println("----------------------------------------------------");

        int sum3= sumOfNumbers(30, 40, 50);
        System.out.println("sum3 = " + sum3);

        System.out.println("-----------------------------------------------");

        int sum4= sumOfNumbers(10,20,30,40);
        System.out.println("sum4 = " + sum4);

        double sum5= sumOfNumbers(4.5,6.5,4.2,9.6);
        System.out.println("sum5 = " + sum5);




    }




    public static int sumOfNumbers(int num1, int num2, int num3) {

        return num1 + num2 + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {

        return num1 + num2 + num3 + num4;

        //for overloading same method name, different parameters.
        //parameters must be different

    }



    public static double sumOfNumbers (double num1, double num2, double num3, double num4) {
        return num1 + num2 + num3 + num4;




    }




    }


