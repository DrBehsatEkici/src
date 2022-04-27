package day26_CustomMethodsPractice;

import utilities.ArraysUtility; //you need to import it from the right package

import java.util.Arrays;

public class MergeTwoArrays2 {

    public static void main(String[] args) {
        int [] arr1= {1,2,3,4};
        int [] arr2= {5,6,7};

        int [] arr3= merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

        System.out.println("----------------------------------");

        String [] a1= {"A", "B", "C"};
        String [] a2= {"D", "E", "F"};

        String [] result= merge(a1, a2);
        System.out.println(Arrays.toString(result));

    }

    //merges the given two integer arrays and returns a new integer array
    public static int [] merge (int []arr1, int []arr2) {
        int [] result = {};

        for (int each: arr1) {
           result= ArraysUtility.addElement(result, each);
        }
        for (int each: arr2) {
            result= ArraysUtility.addElement(result, each);
    }

        return result;

    }

    //merges the given two double arrays and returns a new double array
    public static double [] merge (double []arr1, double []arr2) {
        double [] result = {};

        for (double each: arr1) {
            result= ArraysUtility.addElement(result, each);
        }
        for (double each: arr2) {
            result= ArraysUtility.addElement(result, each);
        }

        return result;
    }

    //merges the given two char arrays and returns a new char array
    public static char [] merge (char []arr1, char []arr2) {
        char [] result = {};

        for (char each: arr1) {
            result= ArraysUtility.addElement(result, each);
        }
        for (char each: arr2) {
            result= ArraysUtility.addElement(result, each);
        }

        return result;
    }

    //merges the given two String arrays and returns a new String array
    public static String [] merge (String []arr1, String []arr2) {
        String [] result = {};

        for (String each: arr1) {
            result= ArraysUtility.addElement(result, each);
        }
        for (String each: arr2) {
            result= ArraysUtility.addElement(result, each);
        }

        return result;
    }
}
