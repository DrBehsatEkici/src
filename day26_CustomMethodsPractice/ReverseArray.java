package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[] result = reverse(arr);
        System.out.println(Arrays.toString(result));

    }

    //Reverse the given integer array, returns a new integer array
    public static int[] reverse (int[] array) {
        int[] result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];

        }
        return result;
    }

    //Reverse the double array, returns a new double array
    public static double[] reverse(double[] array) {
        double[] result = new double[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];

        }
        return result;

    }

    //Reverse the char array, returns a new char array
    public static char[] reverse(char[] array) {
        char[] result = new char[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];

        }
        return result;


    }

    //Reverse the String array, returns a new String array
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];

        }
        return result;
    }
}

