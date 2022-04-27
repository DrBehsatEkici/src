package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {
        int [] numbers = {100,200,300,400,500,600};

        numbers= removeElements(numbers, 1); // creates a new array
        System.out.println(Arrays.toString(numbers));
    }

    // removes the index from the int array, returns new array
    //                     {1,2,3,           4    } //removing the index number 4
    public static int [] removeElements (int [] array,int index ) {

        if (index <0 || index > array.length-1 ) {
            System.err.println(" Invalide Index: " + index);
            System.exit(0); //whenever you give invalid index numbers, it terminates the program.
        }

        int [] result = new int[array.length-1];

        int j = 0;
        for (int i=0; i< array.length; i++) {
            if (i ==index) { // if the index of the array is matching with the element at given index
                continue; //skip
            }
            result [j++] = array[i];
        }

        return result;
    }

    // removes the index from the double array, returns new array
    public static double [] removeElements (double [] array,int index ) {

        if (index <0 || index > array.length-1 ) {
            System.err.println(" Invalid Index: " + index);
            System.exit(0); //whenever you give invalid index numbers, it terminates the program.
        }

        double [] result = new double [array.length-1];

        int j = 0;
        for (int i=0; i< array.length; i++) {
            if (i ==index) { // if the index of the array is matching with the element at given index
                continue; //skip
            }
            result [j++] = array[i];
        }

        return result;
    }

    // removes the index from the char array, returns new array
    public static char [] removeElements (char [] array,int index ) {

        if (index <0 || index > array.length-1 ) {
            System.err.println(" Invalide Index: " + index);
            System.exit(0); //whenever you give invalid index numbers, it terminates the program.
        }

        char [] result = new char [array.length-1];

        int j = 0;
        for (int i=0; i< array.length; i++) {
            if (i ==index) { // if the index of the array is matching with the element at given index
                continue; //skip
            }
            result [j++] = array[i];
        }

        return result;
    }

    // removes the index from the String array, returns new array
    public static String [] removeElements (String [] array,int index ) {

        if (index <0 || index > array.length-1 ) {
            System.err.println(" Invalide Index: " + index);
            System.exit(0); //whenever you give invalid index numbers, it terminates the program.
        }

        String [] result = new String [array.length-1];

        int j = 0;
        for (int i=0; i< array.length; i++) {
            if (i ==index) { // if the index of the array is matching with the element at given index
                continue; //skip
            }
            result [j++] = array[i];
        }

        return result;
    }
}
