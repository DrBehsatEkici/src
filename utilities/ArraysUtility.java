package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an integer array in separate lines.
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    // prints each double of double array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }

    }

    // prints each char of char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }


    }

    // prints each String of string array in separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }

    }

    //returns the maximum number for integer array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }


    //returns the maximum number for double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    //returns the minimum number for double array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //checks if the given integer is contained in the given array. returns boolean. contains [int], int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;

        for (int each : array) {
            if (each == element) { //if any array's element is matching with the given element.
                result = true;

            }
        }
        return result;
    }


    //checks if the given double is contained in the given array. returns boolean. contains [double], double)
    public static boolean contains(double[] array, double element) {
        boolean result = false;

        for (double each : array) {
            if (each == element) {
                result = true;
            }

        }
        return result;
    }

    //checks if the given char is contained in the given array. returns boolean. contains [char], char)
    public static boolean contains(char[] array, char element) {
        boolean result = false;

        for (char each : array) {
            if (each == element) {
                result = true;
            }

        }
        return result;
    }

    //checks if the given string is contained in the given array. returns boolean. contains [string], string)
    public static boolean contains(String[] array, String element) {

        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }

        }
        return result;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element) {

        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element) {

        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element) {

        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element) {

        int count = 0;
        for (String each : array) {
            if (each.equals(element)) { // we have to use equals () instead of ==
                count++;
            }
        }
        return count;
    }


    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }


        result[i] = element;
        return result;

    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }


        result[i] = element;
        return result;

    }

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }


        result[i] = element;
        return result;

    }


    //returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array) {
        int[] result = {}; //new int [0]

        for (int each : array) {


            if (ArraysUtility.frequencyOfElement(array, each) == 1) { //if the frequency is one the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    //returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array) {
        double[] result = {}; //new int [0]

        for (double each : array) {


            if (ArraysUtility.frequencyOfElement(array, each) == 1) { //if the frequency is one the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    //returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array) {
        char[] result = {}; //new int [0]

        for (char each : array) {


            if (ArraysUtility.frequencyOfElement(array, each) == 1) { //if the frequency is one the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    //returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array) {
        String[] result = {}; //new int [0]

        for (String each : array) {


            if (ArraysUtility.frequencyOfElement(array, each) == 1) { //if the frequency is one the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }


    // removes the index from the int array, returns new array
    //                     {1,2,3,           4    } //removing the index number 4
    public static int[] removeElements(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println(" Invalide Index: " + index);
            System.exit(0); //whenever you give invalid index numbers, it terminates the program.
        }

        int[] result = new int[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // if the index of the array is matching with the element at given index
                continue; //skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    // removes the index from the double array, returns new array
    public static double[] removeElements(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println(" Invalide Index: " + index);
            System.exit(0); //whenever you give invalid index numbers, it terminates the program.
        }

        double[] result = new double[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // if the index of the array is matching with the element at given index
                continue; //skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    // removes the index from the char array, returns new array
    public static char[] removeElements(char[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println(" Invalide Index: " + index);
            System.exit(0); //whenever you give invalid index numbers, it terminates the program.
        }

        char[] result = new char[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // if the index of the array is matching with the element at given index
                continue; //skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    // removes the index from the String array, returns new array
    public static String[] removeElements(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println(" Invalide Index: " + index);
            System.exit(0); //whenever you give invalid index numbers, it terminates the program.
        }

        String[] result = new String[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // if the index of the array is matching with the element at given index
                continue; //skip
            }
            result[j++] = array[i];
        }

        return result;
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



    // replace the integer array
    public static int [] replace (int [] array, int index, int newElement) {

        if (index <0 || index > array.length-1) {
            System.err.println("invalid index: " +index);
            System.exit(0);
        }
        array [index] = newElement;
        return array;
    }

    // replace the double array
    public static double [] replace (double [] array, int index, double newElement) {

        if (index <0 || index > array.length-1) {
            System.err.println("invalid index: " +index);
            System.exit(0);
        }
        array [index] = newElement;
        return array;
    }

    // replace the char array
    public static char [] replace (char [] array, int index, char newElement) {

        if (index <0 || index > array.length-1) {
            System.err.println("invalid index: " +index);
            System.exit(0);
        }
        array [index] = newElement;
        return array;
    }

    // replace the String array
    public static String [] replace (String [] array, int index, String newElement) {

        if (index <0 || index > array.length-1) {
            System.err.println("invalid index: " +index);
            System.exit(0);
        }
        array [index] = newElement;
        return array;
    }

    // replaces all the matching old integer value with the new value
    public static int [] replaceAll (int [] array, int oldValue, int newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array [i]== oldValue) {
                array[i] = newValue;
            }

        }
        return array;
    }

    // replaces all the matching old double value with the new value
    public static double [] replaceAll (double [] array, double oldValue, double newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array [i]== oldValue) {
                array[i] = newValue;
            }

        }
        return array;
    }

    // replaces all the matching old char value with the new value
    public static char [] replaceAll (char [] array, char oldValue, char newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array [i]== oldValue) {
                array[i] = newValue;
            }

        }
        return array;
    }

    // replaces all the matching old String value with the new value
    public static String [] replaceAll (String [] array, String oldValue, String newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array [i].equals(oldValue)) {
                array[i] = newValue;
            }

        }
        return array;
    }

    // removes the duplicates from the given int array, return the new array
    public static int [] removeDuplicates (int [] array) {

        int [] result = {};
        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result=  ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }

    // removes the duplicates from the given double array, return the new array
    public static double [] removeDuplicates (double [] array) {

        double [] result = {};
        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result=  ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }

    // removes the duplicates from the given char array, return the new array
    public static char [] removeDuplicates (char [] array) {

        char [] result = {};
        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result=  ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }

    // removes the duplicates from the given String array, return the new array
    public static String [] removeDuplicates (String [] array) {

        String [] result = {};
        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result=  ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }
}



