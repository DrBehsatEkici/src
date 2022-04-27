package Day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int [] arr = {10,10,20,30,40,30,30,30};
        //             0, 1, 2, 3, 4, 5, 6, 7

        arr= replaceAll(arr, 30,300);

        System.out.println(Arrays.toString(arr));

        arr= replaceAll(arr, 300,500);

        System.out.println(Arrays.toString(arr));


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

    public static class RemoveDuplicates {

        public static void main(String[] args) {

            int[] arr = {1,1,1,1,1,1,2,2,3,3,4,4,4,4};
            arr =removeDuplicates(arr);

            System.out.println(Arrays.toString(arr));

            System.out.println( "-------------------------------");
            String [] words = {"Java", "Java", "Python", "C#", "Java", "Java"};
            words= removeDuplicates(words);

            System.out.println(Arrays.toString(words));

            System.out.println( "-------------------------------");
            //int[] numbers = {1,1,1,1,1,1,2,2,3,3,4,4,4,4,5,5,5,5};

            //numbers = Arrays.stream(numbers).distinct().toArray(); FOR FUTURE
            //System.out.println(Arrays.toString(numbers));


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
}
